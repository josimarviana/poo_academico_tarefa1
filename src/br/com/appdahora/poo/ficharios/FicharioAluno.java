package br.com.appdahora.poo.ficharios;
import br.com.appdahora.poo.modelos.Aluno;

import java.util.ArrayList;
import java.util.Scanner;
// adicionar os metodos alterar, excluir e consultar
// não permitir exclusão de alunos vinculados a turmas
public class FicharioAluno {
    // private Aluno alunos[];
    private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
    private Scanner entrada;

    public FicharioAluno(ArrayList<Aluno> alunos){
        this.alunos = alunos;
        entrada = new Scanner(System.in);
    }

    public void cadastrar(){
        String nome, telefone, matricula, cpf;

        System.out.println(" === Cadastrar ALUNO ==== ");
        System.out.print("Nome: ");
        nome = entrada.nextLine();
        System.out.print("Matrícula: ");
        matricula = entrada.nextLine();

        Aluno aluno = new Aluno(nome, matricula);
        if(alunos.contains(aluno)){
            System.out.println("Aluno já cadastrado!");
        }else{
            alunos.add(aluno);
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
