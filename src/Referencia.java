public class Referencia {

    public static void main(String[] args) throws Exception {

        String[] nomes = new String[]{"Lucy","Gabriel", "Carla"};

        System.out.println("Nomes: ");
        for (int i = 0; i < nomes.length; i++){
            System.out.println("O nome é: " + nomes[i]);
        }

        System.out.println("\nNomes do método");
        testar(nomes);

        System.out.println("\nNomes modificados");
        for (int i = 0; i < nomes.length; i++){
            System.out.println("O nome é: " + nomes[i]);
        }

        System.out.println("\nNomes do método modificado novamente");
        modificacaoDoTestar(nomes);

        System.out.println("\nNomes modificados");
        for (int i = 0; i < nomes.length; i++){
            System.out.println("O nome é: " + nomes[i]);
        }

        
        nomeAlterar.apresentacao();
        modificacaoDoObjeto(60);
        segundaModificacaoDoObjeto(11);


        System.out.println("\nMetodo sem Parametro\n");
        metodoSemParametro();
    }

static App nomeAlterar = new App("Carlos", 60);

    public static void testar(String[] nomes){
        for (int i = 0; i < nomes.length; i++){
            nomes[i] = nomes[i] + " Alcantara";
            System.out.println("O nome é: " + nomes[i]);
        }
    }

    public static void modificacaoDoTestar(String[] nomes){
        for (int i = 0; i < nomes.length; i++){
            nomes[i] = nomes[i] + " Barros";
            System.out.println("O nome é: " + nomes[i]);
        }
    }
    public static void modificacaoDoObjeto(int idade){  
        nomeAlterar.setIdade(idade);      
        nomeAlterar.apresentacao();     
    }
    public static void segundaModificacaoDoObjeto(int idade){
        modificacaoDoObjeto(idade);
        nomeAlterar.setNome("Julio");
        nomeAlterar.apresentacao();
    }
    public static void metodoSemParametro(){
        App pessoa1 = new App("Lucas", 17);
        App pessoa2 = new App("Lucy", 32);

        pessoa1.apresentacao();
        pessoa2.apresentacao();

        pessoa1.setIdade(120);
        pessoa2.setIdade(-80);

        System.out.println("Nome: "+ pessoa1.getNome()+" idade: " + pessoa1.getIdade() + " anos.");
        System.out.println("Nome: "+pessoa2.getNome()+" idade: " + pessoa1.getIdade() + " anos.");

    }
}