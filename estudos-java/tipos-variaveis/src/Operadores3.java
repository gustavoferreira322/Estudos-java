public class Operadores3 {

  public static void main(String[] args) {
    // operador relacionais

    int numero1 = 1;
    int numero2 = 2;

    boolean simNao = numero1 == numero2;

    if (numero1 < numero2) {// se a expressão for true
      System.out.println("a nossa condição é verdadeira");
    }

    System.out.println("numeroum é igual a numerodois? " + simNao);

    simNao = numero1 != numero2;

    System.out.println("numeroum é diferente do numerodois? " + simNao);

    simNao = numero1 > numero2;

    System.out.println("numeroum é maior a numerodois? " + simNao);

  }
}
