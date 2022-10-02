package br.com.appdahora.academico.ficharios;

import br.com.appdahora.academico.modelos.Turma;

import java.util.ArrayList;
import java.util.Scanner;

public class FicharioTurma implements Fichario{

    private ArrayList<Turma> turmas;
    private final Scanner entrada;

    public FicharioTurma(ArrayList<Turma> turmas){
        this.turmas = turmas;
        entrada = new Scanner(System.in);
    }
    public void cadastrar(){
        String codigo, nome;

        System.out.println(" === Cadastrar TURMA ==== ");
        System.out.print("Codigo: ");
        codigo = entrada.nextLine();

        System.out.print("Nome: ");
        nome = entrada.nextLine();

        Turma turma = new Turma(codigo, nome);
        if(turmas.contains(turma)){
            System.out.println("Turma já cadastrada!");
        }else{
            turmas.add(turma);
        }


    }

    public void alterar() {
        String nome;
        int pos;

        System.out.println(" ==== Alterar TURMA ==== ");
        System.out.println("Qual a posição do vetor deseja alterar? ");
        pos = entrada.nextInt();
        entrada.skip("\n");
        //TODO: Inserir try/catch para lançar exceção de busca fora do índice
        //TODO: Buscas devem ser feitas pela posição e código
        if (turmas.get(pos) != null) {

            System.out.println("Nome atual: " + turmas.get(pos).getNome()); //get_ pega valor do objeto
            System.out.print("Digite o novo Nome: ");
            nome = entrada.nextLine();
            turmas.get(pos).setNome(nome); // set_ coloca o valor no objeto

        } else {
            System.out.println(" Posicao inválida. ");
        }

    }

    public void excluir() {
        int pos, resp;
        System.out.println(" --==[Excluir TURMA]==-- ");
        System.out.println("Qual a posição deseja excluir? ");
        pos = entrada.nextInt();
        entrada.skip("\n");


        if (turmas.get(pos) != null && turmas.get(pos).getQuantidadeAlunos()==0) {
            System.out.println(turmas.get(pos));
            System.out.println("Confirma a exclusão? (1-sim) e (2-não) ");
            resp = entrada.nextInt();
            entrada.skip("\n");

            if (resp == 1) {
                turmas.remove(pos); // exclui um objeto do vetor
                System.out.println(" Exclusão efetuada com sucesso. ");

            } else {
                System.out.println(" Exclusão não efetuada. ");
            }

        } else {
            System.out.println(" Posicao inválida ou turma possui alunos ");
        }
    }

    public void consultar() {
        int pos;

        System.out.println(" === Consultar TURMA === ");
        System.out.println("Qual a posição do vetor deseja consultar? ");
        pos = entrada.nextInt();
        entrada.skip("\n");

        if (turmas.get(pos) != null) {
            System.out.println(turmas.get(pos));
        } else {
            System.out.println(" Posicao inválida. ");
        }
    }

    public void relatorio() {

        System.out.println("[Relatório de TURMAs]");

        for(Turma turma: turmas){
            System.out.println(turma);
            System.out.println("---------------------");
        }

    }


}
