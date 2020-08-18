import java.util.InputMismatchException;
import java.util.Scanner;

public class QuestoesPt1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Informe dois numeros: A e B ");
            int a= scan.nextInt();
            int b = scan.nextInt();
            int soma = a + b;
            System.out.println("O valor de A foi: "+ a + ". E o valor de B foi: " + b);
            System.out.println("O resultado da soma foi: " + soma);
        
        } catch (InputMismatchException e) {
            System.out.println("Valor inválido! Só aceitamos números! Tente novamente!");
        }

        scan.close();
                
    }
}