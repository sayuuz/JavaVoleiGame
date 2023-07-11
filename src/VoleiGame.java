import java.util.Scanner;

public class VoleiGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VoleiRules vr = new VoleiRules();

        System.out.println("Escolha o nome do time 1.");
        vr.time1Nome = sc.nextLine();

        System.out.println("\nEscolha o nome do time 2.");
        vr.time2Nome = sc.nextLine();

        if (vr.prJogar == 0) {
            System.out.println("\nO time " + vr.time1Nome + " começará jogando. \n");
        } else {
            System.out.println("\nO time " + vr.time2Nome + " começará jogando. \n");
        }

        while (vr.time1Pontos < 5 && vr.time2Pontos < 5) {
            System.out.println("Inicio da rodada: " + vr.ptdAtual);
            switch (vr.prJogar) {
                case 0:
                    vr.sequencia1();
                    break;
                case 1:
                    vr.sequencia2();
                    break;
                default:
                    break;
            }
            System.out.println("Placar atual: " + vr.time1Nome + " " + vr.time1Pontos + " X " + vr.time2Nome + " " + vr.time2Pontos + "\n");
        }

        if (vr.time1Pontos > vr.time2Pontos) {
            System.out.println("\nO ganhador do jogo é o time " + vr.time1Nome + " com " + vr.time1Pontos + " pontos!!!!");
        } else {
            System.out.println("\nO ganhador do jogo é o time " + vr.time2Nome + " com " + vr.time2Pontos + " pontos!!!!");
        }
    }
}
