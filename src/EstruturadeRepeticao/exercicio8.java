package EstruturadeRepeticao;

import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int idade;
        do {
            System.out.println("Digite sua idade: ");
          idade = leitor.nextInt();
          if ( idade < 18 ){
              System.out.println("Idade Invalida");
          }




        }while (idade< 18 );

        System.out.println("Maior que 18 anos");
    }
    }

