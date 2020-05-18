package br.com.teste;

import java.util.Scanner;

public class LeituraDados {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scan.next();
        System.out.println("Olá, " + nome + "! Queremos te desejar as boas vindas!");

        System.out.println("Informe sua idade: ");
        int idade = scan.nextInt();
        if (idade >= 50) {
            System.out.println("Uau, " + nome + "! Tá precisando fazer um check-up, né?! :P");
        } else if (idade <= 18) {
            System.out.println("Uau, " + nome + "! Você precisa de mais experiência, muito jovem ainda.");
        } else {
            System.out.println("Está na flor da idade," + nome + "!");
        }
        scan.close();

    }
}