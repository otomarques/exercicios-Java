package EstruturadeRepeticao;

public class Exemplo3 {

    public static void main(String[] args)throws InterruptedException {
        String[] nomesCarros = { "Fusca","Uno","Opala","Corsa"};
        for (String cadaCarro: nomesCarros) {
            System.out.println("      ");
            System.out.println(cadaCarro);

            System.out.println("___________________________________");
            System.out.println("      ");
            Thread.sleep(1000);

            
        }

    }
}
