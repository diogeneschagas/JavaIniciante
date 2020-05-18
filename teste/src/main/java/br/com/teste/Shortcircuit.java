package br.com.teste;

public class Shortcircuit {
    public static void main(String[] args) {
        boolean verdadeiro = true;
        boolean falso = false;

        boolean resultado1 = falso & verdadeiro;
        boolean resultado2 = falso && verdadeiro;
        
        System.out.println(resultado1);
        System.out.println(resultado2);

    }
}