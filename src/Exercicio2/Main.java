package Exercicio2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Manipulastrings manipulastrings = new Manipulastrings();
        Scanner input = new Scanner(System.in);

        String nome;

        //============== Inversor =================//
        System.out.println("===== Inversor de nome =====");
        System.out.println("Entre com seu nome");
        nome = input.next();

        System.out.println("===== Seu nome invertido é =====");
        System.out.println(manipulastrings.inverteString(nome));
        System.out.println("===== Fim! Engraçado né? haha! Fim =====");

        //============== Palindromo =================//

        System.out.println("===== Verificador de Palíndromos =====");

        manipulastrings.verificaPalindromo("roma e amor");

    }
}
