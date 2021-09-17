package Exercicio2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Manipulastrings manipulastrings = new Manipulastrings();
        Scanner input = new Scanner(System.in);

        String nome;
        String palindromo;

        //============== Inversor =================//
        System.out.println("===== Inversor de nome =====");
        System.out.println("Entre com seu nome");
        nome = input.nextLine();

        System.out.println("===== Seu nome invertido é =====");
        System.out.println(manipulastrings.inverteString(nome));
        System.out.println("===== Fim! Engraçado né? haha! Fim =====");

        //============== Palindromo =================//

        System.out.println("===== Verificador de Palíndromos =====");
        System.out.println("===== Insira uma palavra palindroma =====");

        palindromo = input.nextLine();

        manipulastrings.verificaPalindromo(palindromo);

    }
}
