import java.util.Scanner;

// QUANDO O RESULTADO FOR APENAS UMA LINHA DENTRO DE UM IF/ELSE AS "{}" SÃO OPCIONAIS

public class ex01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double num1, num2;

        System.out.println("Diga um número: ");
        num1 = ler.nextDouble();

        System.out.println("Diga um número: ");
        num2 = ler.nextDouble();

        if (num1 > num2)
            System.out.printf("O número %f é o maior", num1);
        else
            System.out.printf("O número %f é o maior", num2);

        ler.close();
    }
}
