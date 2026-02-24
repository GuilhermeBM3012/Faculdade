import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double peso, altura, imc;

        System.out.println("Diga seu peso: ");
        peso = ler.nextDouble();

        System.out.println("Diga sua altura: ");
        altura = ler.nextDouble();

        imc = peso / (altura * altura);

        if (imc < 20)
            System.out.println("Você está ABAIXO DO PESO!");
        else if (imc <= 25)
            System.out.println("Você está no PESO IDEAL!");
        else System.out.println("Você está ACIMA DO PESO!");

        ler.close();
    }
}
