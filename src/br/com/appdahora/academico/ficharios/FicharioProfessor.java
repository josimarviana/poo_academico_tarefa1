package br.com.appdahora.academico.ficharios;

import br.com.appdahora.academico.modelos.Professor;

import java.util.ArrayList;
import java.util.Scanner;

public class FicharioProfessor implements Fichario{
    private ArrayList<Professor> professores;
    private Scanner entrada;

    public FicharioProfessor(ArrayList<Professor> professores){
        this.professores = professores;
        entrada = new Scanner(System.in);
    }
    public void cadastrar(){
        String nome, telefone, matricula, cpf, email;

        System.out.println(" === Cadastrar PROFESSOR ==== ");
        System.out.print("Registro: ");
        matricula = entrada.nextLine();
        System.out.print("CPF: ");
        cpf = entrada.nextLine();
        System.out.print("Nome: ");
        nome = entrada.nextLine();
        System.out.print("Telefone: ");
        telefone = entrada.nextLine();
        System.out.print("Email: ");
        email = entrada.nextLine();

        Professor professor = new Professor(matricula, cpf, nome, telefone, email);
        if(professores.contains(professor)){
            System.out.println("Professor já cadastrado!");
        }else{
            professores.add(professor);
        }


    }

    public void alterar() {
        String nome, telefone, cpf, email;
        int pos;

        System.out.println(" ==== Alterar PROFESSOR ==== ");
        //TODO: Buscas devem ser feitas pela posição e registro
        System.out.println("Qual a posição do vetor deseja alterar? ");
        pos = entrada.nextInt();
        entrada.skip("\n");
        //TODO: Inserir try/catch para lançar exceção de busca fora do índice
        if (professores.get(pos) != null) {

            System.out.println("CPF atual: " + professores.get(pos).getCpf()); //get_ pega valor do objeto
            System.out.print("Digite o novo CPF: ");
            cpf = entrada.nextLine();
            professores.get(pos).setCpf(cpf); // set_ coloca o valor no objeto

            System.out.println("Nome atual: " + professores.get(pos).getNome()); //get_ pega valor do objeto
            System.out.print("Digite o novo Nome: ");
            nome = entrada.nextLine();
            professores.get(pos).setNome(nome); // set_ coloca o valor no objeto

            System.out.println("Tefone atual: " + professores.get(pos).getTelefone()); //get_ pega valor do objeto
            System.out.print("Digite o novo Telefone: ");
            telefone = entrada.nextLine();
            professores.get(pos).setTelefone(telefone); // set_ coloca o valor no objeto

            System.out.println("Endereco email atual: " + professores.get(pos).getEmail()); //get_ pega valor do objeto
            System.out.print("Digite o novo Endereço email: ");
            email = entrada.nextLine();
            professores.get(pos).setEmail(email); // set_ coloca o valor no objeto

        } else {
            System.out.println(" Posicao inválida. ");
        }

    }

    public void excluir() {
        int pos, resp;

        System.out.println(" --==[Excluir PROFESSOR]==-- ");
        System.out.println("Qual a posição deseja excluir? ");
        pos = entrada.nextInt();
        entrada.skip("\n");

        if (professores.get(pos) != null) {
            System.out.println(professores.get(pos));
            System.out.println("Confirma a exclusão? (1-sim) e (2-não) ");
            resp = entrada.nextInt();
            entrada.skip("\n");

            if (resp == 1) {
                //TODO: Inserir try/catch para lançar exceção de busca fora do índice
                professores.remove(pos); // exclui um objeto do vetor
                System.out.println(" Exclusão efetuada com sucesso. ");

            } else {
                System.out.println(" Exclusão não efetuada. ");
            }

        } else {
            System.out.println(" Posicao inválida. ");
        }
    }

    public void consultar() {
        int pos;

        System.out.println(" === Consultar PROFESSOR === ");
        System.out.println("Qual a posição do vetor deseja consultar? ");
        pos = entrada.nextInt();
        entrada.skip("\n");

        if (professores.get(pos) != null) {
            System.out.println(professores.get(pos));
        } else {
            System.out.println(" Posicao inválida. ");
        }
    }

    public void relatorio() {

        System.out.println("[Relatório de PROFESSORES]");

        for(Professor professor: professores){
            System.out.println(professor);
            System.out.println("---------------------");
        }

    }
}
