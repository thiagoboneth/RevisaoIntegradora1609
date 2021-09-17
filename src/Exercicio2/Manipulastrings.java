package Exercicio2;


import java.util.Locale;

public class Manipulastrings {



    public String inverteString(String nome){
        StringBuilder sb = new StringBuilder(nome);
        sb.reverse();
        return sb.toString().toUpperCase(Locale.ROOT);

    }
    public void verificaPalindromo(String nome) {
            nome = nome.replaceAll("\\s+", "");
        if (nome.equals(inverteString(nome))) {
            System.out.println("É Palindromo ");
        } else {
            System.out.println("Não é Palindromo");
        }
    }
}
