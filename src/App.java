import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    
    Scanner scan = new Scanner(System.in);
        int numero;
        int quantosNumeros = 0;
        int count = 0;
        int quantPares = 0, quantImpares = 0;
        
        System.out.println("Quantidade de números: ");
        quantosNumeros = scan.nextInt();

        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            if(numero % 2 == 0) quantPares++;
            else quantImpares++;

            count ++;

        } while (count < quantosNumeros);
        System.out.println("Quantidade Par: " + quantPares);
        System.out.println("Quantidade Ímpar: "+ quantImpares);

    }
}
