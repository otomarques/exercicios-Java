package EstruturasDecicao;

import java.util.Scanner;

public class Exemplo1 {

    public static void main(String[] args) {


        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o salario: ");
      //  double salario = Double.parseDouble(leitor.nextLine());
        double salario = leitor.nextDouble();

        if (salario < 1000){
            double salarioReajustado= salario*1.1;
            System.out.println( salarioReajustado);
        }else {
            System.out.println("Salario sem reajuste");
        }
    }
}
