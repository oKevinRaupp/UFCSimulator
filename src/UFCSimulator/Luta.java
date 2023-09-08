package UFCSimulator;
import java.util.Random;
public class Luta {
    //AtributosLuta
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    //FimAtributosLutador

    //MetodosEspeciais
    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoriaLutador().equals(l2.getCategoriaLutador()) && l1 != l2 ) {
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            System.out.println("A luta não poderá ser marcada.\n");
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void lutar(){
        if (this.aprovada){
            System.out.println("============== DESAFIADO ============== ");
            this.desafiado.aprensetar();
            System.out.println("==============  DESAFIANTE ============== ");
            this.desafiante.aprensetar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch (vencedor){
                case 0:
                    System.out.println("EMPATE!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;

                case 1:
                    System.out.println(this.desafiado.getNomeLutador() + " Ganhou a luta! Parabéns!! ");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println(this.desafiado.getNomeLutador() + " Ganhou a luta! Parabéns");
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            }
        } else {
            System.out.println("A luta não foi aprovada, logo não tem como lutar.");
        }
    }
    //FimMetodosEspeciais

    //MetodoGet|Set
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    //FimMetodoGet|Set
}
