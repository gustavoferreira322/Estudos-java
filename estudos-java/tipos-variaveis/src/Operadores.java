import java.util.Date;

import javax.xml.crypto.Data;

public class Operadores {

  public static void main(String[] args) {

    String nome = "Gustavo"; // o operador = lemos assim "recebe"
    int idade = 22;
    double peso = 68.5;// usamos o ponto para representar a casa decimal
    char sexo = 'M';
    boolean doadorOrgao = false;
    Date dataNascimento = new Date(); // usando new para criar um novo objeto

    double soma = 10.5 + 15.7;
    int subtracao = 113 - 25;
    int mutiplicacao = 20 * 7;
    int divisao = 15 / 3;
    int modulo = 18 % 3;
    double resultado = (10 * 7) + (20 / 4);

    // concatenação

    String nomeCompleto = "linguagem" + "java";

    String Concatenacao = "?";

    Concatenacao = 1 + 1 + 1 + "1;"; // valor 31 porque esse resultado? o motivo ele fez a soma e quanto chegou na
                                     // string ele parou
    Concatenacao = 1 + "1" + 1 + 1; // valor 1111 aqui quando leu a string parou o contador então não fez a soma
    Concatenacao = 1 + "1" + 1 + "1"; // valor 1111
    Concatenacao = "1" + 1 + 1 + 1; // valor 1111
    Concatenacao = "1" + (1 + 1 + 1); // valor 13 aqui leu o primeiro valor e depois leu o outro valor

    // operadores únarios

    // (+) operadores unario de valor positivo - números são positivos sem esse
    // operador explicitamente;
    // (-) operadores unario de valor negativo - nega um número ou expressão
    // aritmética;
    // (++) operador unário de incremento de valor - incrementa o valor em 1
    // unidade;
    // (--) operador unário de decremento de valor - decrementa o valor 1 unidade;
    // (!) operador unário lógico de negação - nega o valor de uma expressão
    // booleana;

  }

}
