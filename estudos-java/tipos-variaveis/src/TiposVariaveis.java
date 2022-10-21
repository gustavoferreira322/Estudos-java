public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        int idade; // tipo "int", nome "idade", com nenhm valor atribido pode vir a ser zero
        int anoFabricacao = 2021; // tipo "int", nome "anoFabricacao", com o valor 2021
        double salarioMinimo = 2500.33;// tipo "double", nome "salarioMinimo", valor 2.500 nao é 2.500 é dois 2.5 a
                                       // maneira correta 2500.00

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        // tipo de dados

        byte age = 123;
        short ano = 2022;
        int cep = 21070000; // se começar com zero, talvez tenha que ser outro tipo
        long cpf = 77777777777L; // se começar com zero, talvez tenha que ser outro tipo
        float pi = 3.14F;
        double salario = 1275.33;

        // constantes

        final double VALOR_DE_PI = 3.14; // para que a variavel não seja alterada temos que colocar "final" e escrever a
                                         // variavel em caixa ALTA
    }
}
