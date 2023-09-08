package UFCSimulator;

public class Lutador {

    //AtributosLutador
    private String nomeLutador, nacionalidadeLutador, categoriaLutador;
    private int idadeLutador;
    private float alturaLutador;
    private float pesoLutador;
    private int vitoriasLutador;
    private int derrotasLutador;
    private int empatesLutador;
    //FimAtributosLutador


    //MetodoConstrutor

    public Lutador(String nomeLutador, String nacionalidadeLutador, int idadeLutador, float alturaLutador,
                   float pesoLutador, int vitoriasLutador, int derrotasLutador, int empatesLutador) {
        this.nomeLutador = nomeLutador;
        this.nacionalidadeLutador = nacionalidadeLutador;
        this.idadeLutador = idadeLutador;
        this.alturaLutador = alturaLutador;
        this.setPesoLutador(pesoLutador);
        this.vitoriasLutador = vitoriasLutador;
        this.derrotasLutador = derrotasLutador;
        this.empatesLutador = empatesLutador;
    }


    //FimMetodoConstrutor

    //MetodosEspeciais
    public void aprensetar(){
        System.out.println("============== APRESENTAÇÃO ============== ");
        System.out.println("CHEGOU A HORA! Apresentamos o lutador: " + this.getNomeLutador());
        System.out.println("De origem: " + this.getNacionalidadeLutador());
        System.out.println("Com a idade: " + this.getIdadeLutador());
        System.out.println("Com a altura de: : " + this.getAlturaLutador());
        System.out.println("Pesando:: " + this.getPesoLutador() + " KG");
        System.out.println("Já Ganhou: " + this.getVitoriasLutador() + " Lutas");
        System.out.println("Já Perdeu: " + this.getDerrotasLutador() + " Lutas");
        System.out.println("Já empatou: " + this.getEmpatesLutador() + " Lutas");
        System.out.println("============== FIM-APRESENTAÇÃO ============== \n");
    }

    public void status(){
        System.out.println("============= STATUS =============");
        System.out.println(this.getNomeLutador() + " é um peso: " + this.getCategoriaLutador());
        System.out.println("Vitorias: " + this.getVitoriasLutador());
        System.out.println("Derrotas: " + this.getDerrotasLutador());
        System.out.println("Empates: " + this.getEmpatesLutador());
        System.out.println("============= FIM-STATUS =============");
    }

    public void ganharLuta(){
        this.setVitoriasLutador(this.getVitoriasLutador() + 1);
    }

    public void perderLuta(){
        this.setDerrotasLutador(this.getDerrotasLutador() + 1);
    }

    public void empatarLuta(){
        this.setEmpatesLutador(this.getEmpatesLutador() + 1);
    }
    //FimMetodosEspeciais


    //MetodoGet|Set

    public String getNomeLutador() {
        return nomeLutador;
    }

    public void setNomeLutador(String nomeLutador) {
        this.nomeLutador = nomeLutador;
    }

    public String getNacionalidadeLutador() {
        return nacionalidadeLutador;
    }

    public void setNacionalidadeLutador(String nacionalidadeLutador) {
        this.nacionalidadeLutador = nacionalidadeLutador;
    }

    public int getIdadeLutador() {
        return idadeLutador;
    }

    public void setIdadeLutador(int idadeLutador) {
        this.idadeLutador = idadeLutador;
    }

    public float getAlturaLutador() {
        return alturaLutador;
    }

    public void setAlturaLutador(float alturaLutador) {
        this.alturaLutador = alturaLutador;
    }

    public float getPesoLutador() {
        return pesoLutador;
    }

    public void setPesoLutador(float pesoLutador) {
        this.pesoLutador = pesoLutador;
        this.setCategoriaLutador();
    }

    public String getCategoriaLutador() {
        return categoriaLutador;
    }

    private void setCategoriaLutador() {
        if (this.pesoLutador < 52.2){
            this.categoriaLutador = "Invalido";
        } else if (this.pesoLutador <= 70.3){
            this.categoriaLutador = "Leve";
        } else if (this.pesoLutador <= 89.9 ){
            this.categoriaLutador = "Medio";
        } else if (this.pesoLutador <= 120.2){
            this.categoriaLutador = "Pesado";
        } else {
            System.out.println("Peso invalido.");
        }
    }

    public int getVitoriasLutador() {
        return vitoriasLutador;
    }

    public void setVitoriasLutador(int vitoriasLutador) {
        this.vitoriasLutador = vitoriasLutador;
    }

    public int getDerrotasLutador() {
        return derrotasLutador;
    }

    public void setDerrotasLutador(int derrotasLutador) {
        this.derrotasLutador = derrotasLutador;
    }

    public int getEmpatesLutador() {
        return empatesLutador;
    }

    public void setEmpatesLutador(int empatesLutador) {
        this.empatesLutador = empatesLutador;
    }
    //FimMetodoGet|Set
}
