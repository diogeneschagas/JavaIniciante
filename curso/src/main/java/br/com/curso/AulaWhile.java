package br.com.curso;

import java.util.Scanner;

public class AulaWhile {
    public static void main(String[] args) {
        // Alternativas para IF's e ELSE aninhados

        Scanner scanner = new Scanner(System.in);
        System.out.println(">>AULA DE SWITCH CASE<<");

        int diaDaSemana;
        System.out.println("Informe um dia da semana: (1-7): ");
        diaDaSemana = scanner.nextInt();

        while (diaDaSemana < 1 || diaDaSemana > 7) {
            System.out.println("Dia inválido. Por favor, informe um dia da semana: (1-7): ");
            diaDaSemana = scanner.nextInt();
        }

        switch (diaDaSemana) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            case 1:
            case 7:
                System.out.println("Final de semana");
                break;
            default:
                System.out.println("O dia escolhido não é válido.");
                break;
        }

        scanner.close();
    }

}