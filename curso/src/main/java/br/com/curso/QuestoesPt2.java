package br.com.curso;

import java.util.Scanner;

public class QuestoesPt2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Questão 04
        System.out.println(">> QUESTÃO 4 <<");
        double nota1;
        double nota2;
        double nota3;
        double nota4;
        int quantNotas = 4;

        System.out.println("Informe a nota 1: ");
        nota1 = scanner.nextDouble();
        System.out.println("Informe a nota 2: ");
        nota2 = scanner.nextDouble();
        System.out.println("Informe a nota 3: ");
        nota3 = scanner.nextDouble();
        System.out.println("Informe a nota 4: ");
        nota4 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / quantNotas;
        System.out.println("Sua média foi: " + media);

        // ---------------------------------------------------------//

        // Questão 05
        System.out.println(">> QUESTÃO 5 - Conversor de metro para cm <<");

        double entrada;
        double metroCm = 100;

        System.out.println("Olá, este é um conversor de unidades (metros para cm)");
        System.out.println("Informe uma medida em metros que deseja converter: ");

        entrada = scanner.nextDouble();
        double resultadoConversao = entrada * metroCm;

        System.out.println("O resultado da conversão foi: " + resultadoConversao + " cm");

        // ---------------------------------------------------------//

        // Questão 06

        System.out.println(">> QUESTÃO 6 - Área de um círculo << \n");
        double raio;
        double pi = 3.14;

        System.out.println("Informe o raio do círculo: ");
        raio = scanner.nextDouble();
        double area = pi * Math.pow(raio, 2);
        System.out.println("A área do círculo é de: " + area);

        // ---------------------------------------------------------//

        // Questão 07
        System.out.println(">> QUESTÃO 7 - Área de um quadrado << \n");
        double lado;
        System.out.println("Informe um dos lados do quadrado: ");
        lado = scanner.nextDouble();
        double areaQuadrado = Math.pow(lado, 2);
        double dobroArea = areaQuadrado * 2;

        System.out.println("A área do quadrado é: " + areaQuadrado + ". E o dobro da sua área é: " + dobroArea);

        // ---------------------------------------------------------//

        // Questão 08
        System.out.println(">> QUESTÃO 8 - Calcular salário << \n");
        double valorHora = 10;

        System.out.println("Digite quantas horas você trabalhou este mês");
        int horasDoMes = scanner.nextInt();

        double salario = horasDoMes * valorHora;

        System.out.println("Você receberá R$ " + salario);

        // ---------------------------------------------------------//

        // Questão 09
        System.out.println(">> QUESTÃO 9 - Converter F --> °C << \n");
        double temperaturaF;

        System.out.println("Informe a temperatura: ");
        temperaturaF = scanner.nextDouble();
        double temperaturaC = (5 * (temperaturaF - 32) / 9);

        System.out.println(temperaturaF + "F equivale à " + temperaturaC + "°C");

        // ---------------------------------------------------------//

        // Questão 10
        System.out.println(">> QUESTÃO 10 - Converter °C --> F << \n");
        double temperaturaC2;
        System.out.println("Digite a temperatura: ");
        temperaturaC2 = scanner.nextDouble();

        double temperaturaF2 = ((temperaturaC2 * 9 / 5) + 32);

        System.out.println("A temperatura " + temperaturaC2 + "°C equivale à " + temperaturaF2 + "F");

        // ---------------------------------------------------------//

        // Questão 13
        System.out.println(">> QUESTÃO 13 - Salário com descontos --> F << \n");
        double salarioBruto;

        // Percentual dos Impostos
        double ir = 0.11;
        double inss = 0.08;
        double sindicato = 0.05;

        System.out.println("Digite a o seu salário bruto: ");
        salarioBruto = scanner.nextDouble();

        // Valor dos impostos
        double valorIr = ir * salarioBruto;
        double valorInss = inss * salarioBruto;
        double valorSindicato = sindicato * salarioBruto;

        double totalDescontos = valorIr + valorInss + valorSindicato;

        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("Salário bruto: R$ " + salarioBruto + " - IR(11%): R$ " + valorIr + " - INSS(8%): R$ "
                + valorInss + " - Sindicato (5%): R$ " + valorSindicato + " = Salario líquido: R$ " + salarioLiquido);

        scanner.close();
    }
}