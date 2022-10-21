public class Operadores4 {

  public static void main(String[] args) {
    boolean condicao1 = false;
    boolean condicao2 = true;

    if (condicao1 && condicao2) {
      System.out.println("as duas condições são verdadeiras");// as duas tem que ser verdadeira para realizar a operação
    }
    if (condicao1 || condicao2) {
      System.out.println("uma das condições é verdadeiras");// uma ou outra pode ser verdadeira a operação e excutada
    }

    System.out.println("fim");
  }
}
