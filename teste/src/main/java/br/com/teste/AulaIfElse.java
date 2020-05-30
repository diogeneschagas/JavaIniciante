package br.com.teste;

import java.util.Scanner;

public class AulaIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Aula de Operadores lógicos e IF's e ELSE
        
        /* 
        System.out.println(">> TESTE DE MAIORIDADE <<");

        int idade;
        System.out.println("Informe sua idade: ");
        idade = scanner.nextInt();
        if (idade >= 18) {
            System.out.println("Você é maior de idade");
        } else {
            System.out.println("Você ainda é menor de idade");
        } */

        System.out.println(">> PESQUISA DE PREÇOS <<");
        
        String nomeProduto;
        double valor;

        System.out.println("Informe o nome do produto: ");
        nomeProduto = scanner.nextLine();
        System.out.println("Informe seu valor: ");
        valor = scanner.nextDouble();

        if(valor < 20){
            System.out.println(nomeProduto + " está com bom preço. Compre imediatamente!");
        } else if (valor >= 20 && valor < 50){
            System.out.println(nomeProduto + " está razoavelmente caro. Pesquise um pouco mais. ;D ");
        } else {
            System.out.println("O produto " + nomeProduto + " está muito caro. Corre, que é assalto! XP ");
        }

        scanner.close();
    }
}