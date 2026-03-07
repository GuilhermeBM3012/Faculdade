import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int valor;

        System.out.println("Digite um valor positivo: ");
        valor = ler.nextInt();

        while(valor < 0){
            System.out.println("Não aceita nº negativo!");
            System.out.println("Digite um valor positivo: ");
            valor = ler.nextInt();
        }

        System.out.println("Nº aceito.\nPrograma encerrando...");

        ler.close();
    }
}
