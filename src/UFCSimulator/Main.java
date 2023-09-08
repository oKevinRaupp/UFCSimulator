package UFCSimulator;

public class Main {
    public static void main(String[] args) {

        Lutador lutador[] = new Lutador[7];

        lutador[0] = new Lutador("Kevin","Brasil",20,1.70f,
                65f,3,1,1);
        lutador[1] = new Lutador("Lutador1","França",31,1.75f,
                68.9f,11,2,1);
        lutador[2] = new Lutador("Lutador2","Jamaica",29,1.68f,
                57.8f,14,2,3);
        lutador[3] = new Lutador("Lutador3","EUA",35,1.65f,
                80.9f,12,2,1);
        lutador[4] = new Lutador("Lutador4","Autralia",28,1.93f,
                81.6f,13,0,2);
        lutador[5] = new Lutador("Lutador5","Brasil",37,1.70f,
                119.3f,5,4,3);
        lutador[6] = new Lutador("Lutador6","EUA",30,1.81f,
                105.7f,12,2,5);
        //Você pode mudar os atributos dos lutadores e realizar sua propria luta!

        //Exemplo de luta:
        Luta luta1 = new Luta();

        luta1.marcarLuta(lutador[0],lutador[1]);
        luta1.lutar();
    }
}