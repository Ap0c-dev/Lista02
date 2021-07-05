public class App {

    private int idade;   
    private String nome;
   
    public App(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void apresentacao (){
       System.out.println("Nome " + this.nome + " idade " + this.idade + " anos.");
    }
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return this.idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
}