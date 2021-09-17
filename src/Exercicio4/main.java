package Exercicio4;

import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {

        ManipulaArquivos manipulaArquivos = new ManipulaArquivos();

        Pessoa pessoa1 = new Pessoa("Thiago","Boneth");
        Pessoa pessoa2 = new Pessoa("Viviane","Lopes");

        manipulaArquivos.adicionaLista(pessoa1);
        manipulaArquivos.adicionaLista(pessoa2);


        //=== NÃO PRECISA ESCREVER NO ARQUIVO DE NOVO ===//
        //manipulaArquivos.escreveNoArquivo(pessoa1);
        //manipulaArquivos.escreveNoArquivo(pessoa2);

        //=== RETORNA VALORES DO ARQUIVO SEPADOS POR INDICE ===//
        manipulaArquivos.leObjetoConsultas();
        manipulaArquivos.retornaObjetoConsultas();
    }
}
