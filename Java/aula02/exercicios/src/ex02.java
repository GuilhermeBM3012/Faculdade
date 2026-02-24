import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double num1, num2;

        System.out.println("Diga um número: ");
        num1 = ler.nextDouble();

        System.out.println("Diga um número: ");
        num2 = ler.nextDouble();

        if (num1 < num2)
            System.out.printf("O número %f é o menor", num1);
        else
            System.out.printf("O número %f é o menor", num2);

        ler.close();
    }
}
