package Exercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Agenda{

    ArrayList<Pessoa> agenda = new ArrayList<>();

    public void armazenarPessoa(Pessoa pessoa){

        agenda.add(pessoa);

    }
    public void removerPessoa(String nome){

        for(int i = 0; i < agenda.size(); i++){
            if (agenda.get(i).getNome().equals(nome)){
                agenda.remove(agenda.get(i));
            }
        }
        System.out.println(nome + " Foi removido(a), o restante de sua agenda é " + Collections.singletonList(agenda));
    }

    public void buscarPessoa(String nome){

        for(int i = 0; i < agenda.size(); i++){
            if (agenda.get(i).getNome().equals(nome)){
                System.out.println("Informações do nome buscado " + agenda.get(i));
            }
        }
    }

    public void exibirTodaAgenda(){

        System.out.println(Collections.singletonList(agenda));

    }
    public void exibirPessoa(int index){

        agenda.get(index);
        System.out.println(agenda.get(index));

    }


    public void listaPessoaEmOrdemAlfabeticaDeNome() {
        Collections.sort(agenda, new Comparator<Pessoa>() {
            @Override
            public int compare(Pessoa o1, Pessoa o2) {
                return o1.getNome().compareTo(o2.getNome());
            }
        });
        agenda.forEach(System.out::println);
    }

    public void listaPessoaEmOrdemAlfabeticaDeEndereco() {
        Collections.sort(agenda, new Comparator<Pessoa>() {
            @Override
            public int compare(Pessoa o1, Pessoa o2) {
                return o1.getEndereco().compareTo(o2.getEndereco());
            }
        });
        agenda.forEach(System.out::println);
    }

    public void listaPessoasPorIdade() {
        Collections.sort(agenda, new Comparator<Pessoa>() {
            @Override
            public int compare(Pessoa o1, Pessoa o2) {
                return o2.getIdade().compareTo(o1.getIdade());
            }
        });
        agenda.forEach(System.out::println);
    }
}
