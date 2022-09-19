package br.com.appdahora.poo.ficharios;
import br.com.appdahora.poo.modelos.Aluno;

import java.util.ArrayList;
import java.util.Scanner;

public class FicharioAluno {
    // private Aluno alunos[];
    private ArrayList<Aluno> alunos;
    private Scanner entrada;

    public FicharioAluno(ArrayList<Aluno> alunos){
        this.alunos = alunos;
        entrada = new Scanner(System.in);
    }

    public void cadastrar(){
        String nome, telefone, matricula, cpf, email;

        System.out.println(" === Cadastrar ALUNO ==== ");
        System.out.print("Matrícula: ");
        matricula = entrada.nextLine();
        System.out.print("CPF: ");
        cpf = entrada.nextLine();
        System.out.print("Nome: ");
        nome = entrada.nextLine();
        System.out.print("Telefone: ");
        telefone = entrada.nextLine();
        System.out.print("Email: ");
        email = entrada.nextLine();

        Aluno aluno = new Aluno(matricula, cpf, nome, telefone, email);
        if(alunos.contains(aluno)){
            System.out.println("Aluno já cadastrado!");
        }else{
            alunos.add(aluno);
        }


    }

    public void alterar() {
        String nome, telefone, cpf, email;
        int pos;

        System.out.println(" ==== Alterar ALUNO ==== ");
        System.out.println("Qual a posição do vetor deseja alterar? ");
        pos = entrada.nextInt();
        entrada.skip("\n");

        try{
            if (alunos.get(pos) != null) {

                System.out.println("CPF atual: " + alunos.get(pos).getCpf()); //get_ pega valor do objeto
                System.out.print("Digite o novo CPF: ");
                cpf = entrada.nextLine();
                alunos.get(pos).setCpf(cpf); // set_ coloca o valor no objeto

                System.out.println("Nome atual: " + alunos.get(pos).getNome()); //get_ pega valor do objeto
                System.out.print("Digite o novo Nome: ");
                nome = entrada.nextLine();
                alunos.get(pos).setNome(nome); // set_ coloca o valor no objeto

                System.out.println("Tefone atual: " + alunos.get(pos).getTelefone()); //get_ pega valor do objeto
                System.out.print("Digite o novo Telefone: ");
                telefone = entrada.nextLine();
                alunos.get(pos).setTelefone(telefone); // set_ coloca o valor no objeto

                System.out.println("Endereco email atual: " + alunos.get(pos).getEmail()); //get_ pega valor do objeto
                System.out.print("Digite o novo Endereço email: ");
                email = entrada.nextLine();
                alunos.get(pos).setEmail(email); // set_ coloca o valor no objeto

            } else {
                System.out.println(" Posicao inválida. ");
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("\nExceção alcançada, índice não existe");
        }


    }

    public void excluir() {
        int pos, resp;
        //TODO: Inserir validação para não permitir excluir aluno que esteja numa turma ou excluir também a enturmação
        System.out.println(" --==[Excluir ALUNO]==-- ");
        System.out.println("Qual a posição deseja excluir? ");
        pos = entrada.nextInt();
        entrada.skip("\n");

        if (alunos.get(pos) != null) {
            System.out.println(alunos.get(pos));
            System.out.println("Confirma a exclusão? (1-sim) e (2-não) ");
            resp = entrada.nextInt();
            entrada.skip("\n");

            if (resp == 1) {
                alunos.remove(pos); // exclui um objeto do vetor
                System.out.println(" Exclusão efetuada com sucesso. ");

            } else {
                System.out.println(" Exclusão não efetuada. ");
            }

        } else {
            System.out.println(" Posicao inválida. ");
        }
    }

    public void consultar() {
        int pos, resp;
        String matricula;

        System.out.println(" === Consultar ALUNO === ");
        System.out.println("Como deseja procurar? (1-indice) ou (2-matricula) ");
        resp = entrada.nextInt();
        entrada.skip("\n");

        if(resp==1) {
            System.out.println("Qual a posição do vetor deseja consultar? ");
            pos = entrada.nextInt();
            entrada.skip("\n");
            procurar(pos);
        }else{
            System.out.println("Qual a matrícula que deseja consultar? ");
            matricula = entrada.nextLine();
            entrada.skip("\n");
            procurar(matricula);
        }

    }

    public void procurar(String chave) {
        Aluno aluno = new Aluno(chave);

        if (alunos.indexOf(aluno) >=0) {
            System.out.println(alunos.get(alunos.indexOf(aluno)));
        } else {
            System.out.println(" Aluno não encontrado ");
        }
    }
    public void procurar(int pos) {

        if (alunos.get(pos) != null) {
            System.out.println(alunos.get(pos));
        } else {
            System.out.println(" Posicao inválida. ");
        }
    }
    public void relatorio() {

        System.out.println("[Relatório de ALUNOS]");

        for(Aluno aluno: alunos){
                System.out.println(aluno);
                System.out.println("---------------------");
            }

    }

}
