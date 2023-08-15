package UFC.Lutador;

public class Lutador {
    private String nome;
    private Boolean idadePermitido = false;
    public int idade;
    private int vitorias;
    private int derrotas;
    private boolean lutaMarcado;

    public Lutador(String nome, int idade) {
        setNome(nome);
        setIdade(idade);
        consultarLutador();
    }
    public void consultarLutador(){
        System.out.println("===========================");
        System.out.println("Nome do lutador: "+getNome());
        System.out.println("Idade do lutador: "+getIdade());

        System.out.println("Luta marcado: "+isLutaMarcado());
        System.out.println("Vitorias: "+getVitorias());
        System.out.println("Derrotas: "+getDerrotas());
        System.out.println("===========================");
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        if(this.idade < 18){
            return this.idade;
        }else{
            this.idadePermitido =false;
            return this.idade;
        }

    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias += vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas -= derrotas;
    }

    public boolean isLutaMarcado() {
        return lutaMarcado;
    }

    public void setLutaMarcado(boolean lutaMarcado) {
        this.lutaMarcado = lutaMarcado;
    }

    public Boolean getIdadePermitido() {
        if(this.idade < 18){
            System.out.println("\u001b[40m "+getNome()+" é Menor de idade \u001b[m");
            this.idadePermitido = true;
        }else{
            System.out.println("Pode lutar: "+ getNome());
            this.idadePermitido = false;
        }
        return this.idadePermitido;
    }

}
