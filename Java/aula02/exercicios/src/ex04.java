import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double base, altura, area;

        System.out.println("Diga a base do retângulo: ");
        base = ler.nextDouble();

        System.out.println("Diga a altura do retângulo: ");
        altura = ler.nextDouble();

        area = base* altura;
        System.out.printf("A área entre a base: %f e altura: %f é: %.2f\n", base, altura, area);
        if (area > 100)
            System.out.println("Terrno grande");

        ler.close();
    }
}
