import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double num1, num2;

        System.out.println("Diga um número: ");
        num1 = ler.nextDouble();

        System.out.println("Diga um número: ");
        num2 = ler.nextDouble();

        if (num1 > num2)
            System.out.printf("O número %f é o mario", num1);
        else if (num2 > num1)
            System.out.printf("O número %f é o mario", num2);
        else
            System.out.println("Os números são iguais");

        ler.close();
    }
}
