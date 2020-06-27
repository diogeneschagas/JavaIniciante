package br.com.teste;

import java.io.Console;
import java.util.Scanner;

public class QuestoesPt3 {
    public static void main(String[] args) {
        
        
        System.out.println(">> EXERCÍCIOS DAS AULAS 16-17 (COMANDOS: FOR, WHILE E do WHILE) <<"); // Título dos programas

        Scanner scanner = new Scanner(System.in); // Inicializando o 'Scanner' para capturar a entrada do usuário
        Console console = System.console();       // referenciando a classe 'Console' para capturar a cadeia de caracteres 'char[]'

        System.out.println(">> Questão 02 <<  Cadsatro de Login"); // Título do exercício

        String username;        // usuário
        char[] password;        // senha no tipo 'char'
        String pwordAsString;   // senha no tipo 'String'

        do {        // Aqui eu digo: "Execute este bloco de código enquanto... ('while')"
            System.out.println("Informe um login: ");
            username = scanner.nextLine();                              // Captura do usuário como String
            password = console.readPassword("Informe uma senha: \n"); // Captura da senha em cadeia de caracteres
            

            pwordAsString = String.copyValueOf(password);               // Conversão de 'char[]' para 'String' possibilitando a comparação de valores
            
            if (username.equals(pwordAsString)) {       // verifica se login == senha 
                                                            // OBS: para comparação entre valores do tipo 'String', utilizamos o 'equals()'
                System.out.println("A senha não pode ser igual ao nome de usuário.");   //resposta se caso a senha for igual ao login
            }
        } while (username.equals(pwordAsString));           // Condição de verificação: Enquanto a condição for verdadeira, o programa será executado.

        System.out.println("Usuário criado com sucesso!");          // Caso a condição seja falsa, ele imprimime esta mensagem e encerra a execução

        scanner.close();        // IMPORTANTE: FECHAR O SCANNER AO FIM DE CADA EXECUÇÃO!!!!
    }
}