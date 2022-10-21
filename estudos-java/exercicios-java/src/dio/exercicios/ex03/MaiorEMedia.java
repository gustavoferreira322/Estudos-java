package dio.exercicios.ex03;

import java.util.Scanner;

/*Faça um programa que leia 5 números e informe o maior número e a média desses números */
public class MaiorEMedia {
  /**
   * @param args
   */
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int numero;
    int maior = 0;

    int soma = 0;

    int count = 0;
    do {
      System.out.println("Numero: ");
      numero = scan.nextInt();

      soma = soma + numero;

      if (numero > maior)
        maior = numero;

      count++;

    } while (count < 5);

    System.out.println("media: " + (soma / 5));
    System.out.println("Maior: " + maior);
    // vai mostrar qual é o resultado maior quando acabar o laço de repetição.

    /*
     * Meu maior valor começa com zero,
     * então quando estiver acontecendo o laço de repetição,
     * o ultimo valor digitado pode ser o maior ou o primeiro valor digitado possa
     * ser o maior.
     */
  }
}
