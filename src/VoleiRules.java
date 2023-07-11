import java.util.Random;


public class VoleiRules {
    Random rand = new Random();
    int nroAleatorio = 2;
    //No geral, se tirar 1 consegue realizar a ação, se tirar 0 não consegue.

    String time1Nome;
    int time1Pontos = 0;

    String time2Nome;
    int time2Pontos = 0;
    
    int prJogar = rand.nextInt(nroAleatorio);
    
    int ptdAtual = 1;
    int ptdControle = 0;

    public void sequencia1() {
        if (ptdAtual != ptdControle) {
            time1Ataque();
        }
        if (ptdAtual != ptdControle) {
            time2Defesa();
        }
        if (ptdAtual != ptdControle) {
            time2Ataque();
        }
        if (ptdAtual != ptdControle) {
            time1Defesa();
        }
        ptdAtual++;
    }

    public void sequencia2() {
        if (ptdAtual != ptdControle) {
            time2Ataque();
        }
        if (ptdAtual != ptdControle) {
            time1Defesa();
        }
        if (ptdAtual != ptdControle) {
            time1Ataque();
        }
        if (ptdAtual != ptdControle) {
            time2Defesa();
        }
        ptdAtual++;
    }

    public void time1Ataque() {
        int ataque1 = rand.nextInt(nroAleatorio);
        if (ataque1 == 0) {
            System.out.println(time1Nome + " erra o ataque. Ponto para " + time2Nome);
            time2Pontos = time2Pontos + 1;
            prJogar = 1;
            ptdControle = ptdAtual;
        } else {
            System.out.println(time1Nome + " consegue fazer um ótimo ataque e passa a bola para o outro lado.");
        }
    }

    public void time2Ataque() {
        int ataque2 = rand.nextInt(nroAleatorio);
        if (ataque2 == 0) {
            System.out.println(time2Nome + " erra o ataque. Ponto para " + time1Nome);
            time1Pontos = time1Pontos + 1;
            prJogar = 0;
            ptdControle = ptdAtual;
        } else {
            System.out.println(time2Nome + " consegue fazer um ótimo ataque e passa a bola para o outro lado.");
        }
    }

    public void time1Defesa() {
        int defesa1 = rand.nextInt(nroAleatorio);
        if (defesa1 == 0) {
            System.out.println("A defesa do time " + time1Nome + " não foi boa o suficiente. Ponto para o time " + time2Nome);
            time2Pontos = time2Pontos + 1;
            prJogar = 1;
            ptdControle = ptdAtual;
        } else {
            System.out.println("O time " + time1Nome + " conseguiu defender com sucesso, agora o levantador preparou o ataque.");
        }
    }

    public void time2Defesa() {
        int defesa2 = rand.nextInt(nroAleatorio);
        if (defesa2 == 0) {
            System.out.println("A defesa do time " + time2Nome + " não foi boa o suficiente. Ponto para o time " + time1Nome);
            time1Pontos = time1Pontos + 1;
            prJogar = 0;
            ptdControle = ptdAtual;
        } else {
            System.out.println("O time " + time2Nome + " conseguiu defender com sucesso, agora o levantador preparou o ataque.");
        }
    }
}

