package dio.exercicios.ex02;

import java.util.Scanner;

/*Faça um programa que peça uma nota, entre zero e dez.
 * mostre uma mensagem caso o valor seja invalido
 * e continue pedindo
 * Ate que o usuário informe um valor valido.
 */
public class Nota {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int nota;

    System.out.println("Nota: ");
    nota = scan.nextInt();

    while (nota < 0 || nota > 10) {
      System.out.println("Nota Invalida! Digite novamente: ");
      nota = scan.nextInt();
      /*
       * Para parar essa expressão temos que colocar a nota que esta dentro do laço de
       * repetição
       * ex. de 0 a 10 esses numero vão parar a operação se a nota for maior que 10 o
       * laço continua e se for menos 0 o laço
       */
    }
  }
}
