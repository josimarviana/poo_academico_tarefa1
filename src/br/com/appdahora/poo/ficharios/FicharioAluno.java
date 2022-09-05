package br.com.appdahora.poo.ficharios;
import br.com.appdahora.poo.modelos.Aluno;

import java.util.Scanner;
// adicionar os metodos alterar, excluir e consultar
// não permitir exclusão de alunos vinculados a turmas
public class FicharioAluno {
    private Aluno alunos[];
    private Scanner entrada;

    public FicharioAluno(Aluno alunos[]){
        this.alunos = alunos;
        entrada = new Scanner(System.in);
    }

    public void cadastrar(){
        String nome, telefone, matricula, cpf;
        int contador = 0;

        while (alunos[contador] != null){
            contador++;
        }

        if(contador < 40){
            System.out.println(" === Cadastrar ALUNO ==== ");
            System.out.print("Nome: ");
            nome = entrada.nextLine();
            System.out.print("Matrícula: ");
            matricula = entrada.nextLine();

            Aluno aluno;
            aluno = new Aluno(nome);
            alunos[contador] = aluno;
        } else {
            System.out.println("Cadastros esgotados!");
        }

    }
    public void relatorio() {

        System.out.println("[Relatório de ALUNOS]");
        for (int j = 0; j < alunos.length; j++) {
            if (alunos[j] != null) {
                System.out.println(alunos[j]);
                System.out.println("---------------------");
            }

        }

    }

}
