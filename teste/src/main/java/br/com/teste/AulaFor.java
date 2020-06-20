package br.com.teste;

import java.util.Scanner;

public class AulaFor {
   
    public static void main(String[] args) {
        
        // Com apenas uma variável
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        // Com duas variáveis
        for (int i = 0, j = 10; i < j; i++, j--) {
            System.out.println("i = " + i + " | j = " + j);
        }

        // 'For' sem corpo
        
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        System.out.println(">> Somar intervalos de números <<");

        // Número inicial
        System.out.println("Informe um número inicial: ");
        int inicio = scanner1.nextInt();
        
        // Número limite
        System.out.println("Informe um número limite: ");
        int limite = scanner2.nextInt();

        int soma = 0;
        for(; inicio < limite; soma += inicio++);
        System.out.println("O resultado da soma é " + soma);
    }
}