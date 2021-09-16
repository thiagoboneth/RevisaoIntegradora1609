package Exercicio4;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ManipulaArquivos extends Pessoa{

    ArrayList<Pessoa> arquivo = new ArrayList<>();
    ArrayList<String> consulta = new ArrayList<>();


    public void adicionaLista(Exercicio4.Pessoa pessoa){

        arquivo.add(pessoa);
    }


    public void escreveNoArquivo(Pessoa pessoa) throws IOException {

        FileOutputStream escrevePessoa = new FileOutputStream("Pessoa.txt", true);
        OutputStreamWriter gerarArquivo = new OutputStreamWriter(escrevePessoa);
        BufferedWriter bw = new BufferedWriter(gerarArquivo);

        bw.append(pessoa.toString());
        bw.newLine();
        bw.close();

    }

    public void leObjetoConsultas() throws IOException {
        Scanner scanner1 = new Scanner(new FileReader("Pessoa.txt")).useDelimiter("\\n");
        while (scanner1.hasNext()) {
            consulta.add(scanner1.next());
        }
    }

    public void retornaObjetoConsultas() {
        consulta.forEach(System.out::println);
        consulta.forEach(x -> System.out.println(mapearParaConsultas(x).toString()));
    }

    public Pessoa mapearParaConsultas(String linha) {
        String[] valores = linha.replaceAll("\"","").split(",");
        Pessoa pessoa = new Pessoa(valores[0],valores[1]);
        return pessoa;
    }


}
