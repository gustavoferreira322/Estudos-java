package dio.exercicios.ex01;

import java.util.Scanner;

public class NomeIdade {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        String name;
        int age;

        while (true) {

            System.out.println("Nome: ");
            name = scan.next();
            if (name.equals("0"))
                break;

            System.out.println("Idade: ");
            age = scan.nextInt();
        }
        System.out.println("continua aqui...");
    }
}
