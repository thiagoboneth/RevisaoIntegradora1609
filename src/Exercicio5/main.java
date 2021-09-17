package Exercicio5;

import java.util.Scanner;

public class main {
    private  static int id=0;
    public static void main(String[] args) {

        //String nome, String cpf, String endereco, String email, String telefone

        String nome;
        String cpf;
        String endereco;
        String email;
        String telefone;

        Scanner entraCliente = new Scanner(System.in);

        System.out.println("Entre com seu nome ");

        nome = entraCliente.nextLine();

        System.out.println("Entre com seu cpf ");

        cpf = entraCliente.nextLine();

        System.out.println("Entre com seu endereço ");

        endereco = entraCliente.nextLine();

        System.out.println("Entre com seu e-mail ");

        email = entraCliente.nextLine();

        System.out.println("Entre com seu telefone ");

        telefone = entraCliente.nextLine();

        Cliente cliente = new Cliente(nome,cpf,endereco,email,telefone);

        cliente.setId(id++);

        if(cliente.nomeValido(nome) && cliente.cpfValido(cpf) && cliente.emailValido(email) && cliente.telefoneValido(telefone)){
            System.out.println("Cliente Cadastrado com sucesso!");
        }else {
            System.out.println("Erro ao validar cliente");
        }
    }
}
