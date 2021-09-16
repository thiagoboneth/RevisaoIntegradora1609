package Exercicio1;

public class Main {

    public static void main(String[] args) {

        Agenda agenda = new Agenda();

        Pessoa pessoa1 = new Pessoa("Thiago","Rua Sol nascente","(48)98840-6595",28,1.75);
        Pessoa pessoa2 = new Pessoa("Luis","Rua Loris Clodovil","(48)98840-6595",25,1.75);
        Pessoa pessoa3 = new Pessoa("Santos","Rua Avenida Brasil","(48)98840-6595",29,1.75);
        Pessoa pessoa4 = new Pessoa("Carlos","Rua Sol poente","(48)98840-6595",15,1.75);
        Pessoa pessoa5 = new Pessoa("Oliveira","Rua Judas Thadeu","(48)98840-6595",16,1.75);
        Pessoa pessoa6 = new Pessoa("Camila","Rua Sandro Maia","(48)98840-6595",26,1.75);
        Pessoa pessoa7 = new Pessoa("Fernanda","Rua Timbô","(48)98840-6595",35,1.75);
        Pessoa pessoa8 = new Pessoa("Beatriz","Rua Das almas","(48)98840-6595",32,1.75);
        Pessoa pessoa9 = new Pessoa("Emilia","Rua Beco do Barata","(48)98840-6595",48,1.75);
        Pessoa pessoa10 = new Pessoa("Viviane","Rua Tancredo Neves","(48)98840-6595",17,1.75);

        System.out.println("==== Armazenando pessoa======");// ok

        agenda.armazenarPessoa(pessoa1);
        agenda.armazenarPessoa(pessoa2);
        agenda.armazenarPessoa(pessoa3);
        agenda.armazenarPessoa(pessoa4);
        agenda.armazenarPessoa(pessoa5);
        agenda.armazenarPessoa(pessoa6);
        agenda.armazenarPessoa(pessoa7);
        agenda.armazenarPessoa(pessoa8);
        agenda.armazenarPessoa(pessoa9);
        agenda.armazenarPessoa(pessoa10);

        System.out.println("==== Removendo pessoa======");

        agenda.removerPessoa("Viviane");

        System.out.println("==== Buscando pessoa======");

        agenda.buscarPessoa("Emilia");

        System.out.println("==== Exibindo toda agenda =====");

        agenda.exibirTodaAgenda();

        System.out.println("==== Exibindo dados agenda =====");

        agenda.exibirPessoa(3);

        System.out.println("==== Agenda em ordem alfabética de nome =====");

        agenda.listaPessoaEmOrdemAlfabeticaDeNome();

        System.out.println("==== Endereço em ordem alfabética =====");

        agenda.listaPessoaEmOrdemAlfabeticaDeEndereco();

        System.out.println("==== Pessoas por Idade =====");

        agenda.listaPessoasPorIdade();



        System.out.println("  \\  <   ");

    }
}
