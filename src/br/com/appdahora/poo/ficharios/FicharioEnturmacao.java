package br.com.appdahora.poo.ficharios;

import br.com.appdahora.poo.modelos.Aluno;
import br.com.appdahora.poo.modelos.Enturmacao;
import br.com.appdahora.poo.modelos.Turma;

import java.util.ArrayList;
import java.util.Scanner;

public class FicharioEnturmacao {
    private ArrayList<Turma> turmas;
    private ArrayList<Aluno> alunos;
    private ArrayList<Enturmacao> enturmacoes;

    private final Scanner entrada;

    public FicharioEnturmacao(ArrayList<Enturmacao> enturmacoes, ArrayList<Turma> turmas, ArrayList<Aluno> alunos){
        this.turmas = turmas;
        this.alunos = alunos;
        this.enturmacoes = enturmacoes;
        entrada = new Scanner(System.in);
    }

    public void cadastrar() {
        int posicaoTurma, posAluno;

        System.out.println(" === Cadastrar ENTURMAÇÃO === ");

        System.out.println("Qual a posição da turma no vetor? ");
        posicaoTurma = entrada.nextInt();
        entrada.skip("\n");

        System.out.println("Qual a posição do aluno no vetor? ");
        posAluno = entrada.nextInt();
        entrada.skip("\n");

        Enturmacao enturmacao; //objeto para cada posição
        enturmacao = new Enturmacao(turmas.get(posicaoTurma), alunos.get(posAluno));

        if(enturmacoes.contains(enturmacao)){
            System.out.println("Enturmação já realizada!");
        }else{
            enturmacoes.add(enturmacao);
        }



    }

    public void excluir() {
        int pos, resp;

        System.out.println(" --==[Excluir Enturmação]==-- ");
        //TODO: Buscas devem ser feitas pela posição e código
        System.out.println("Qual a posição do vetor deseja excluir? ");
        pos = entrada.nextInt();
        entrada.skip("\n");

        if (enturmacoes.get(pos) != null) {
            System.out.println(enturmacoes.get(pos));
            System.out.println("Confirma a exclusão? (1-sim) e (2-não) ");
            resp = entrada.nextInt();
            entrada.skip("\n");

            if (resp == 1) {
                //TODO: Inserir try/catch para lançar exceção de busca fora do índice
                enturmacoes.remove(pos); // exclui um objeto do vetor
                System.out.println(" Exclusão efetuada com sucesso. ");

            } else {
                System.out.println(" Exclusão não efetuada. ");
            }
        } else {
            System.out.println(" Posição inválida. ");
        }
    }

    public void consultar() {
        int pos;

        System.out.println(" --==[Consultar Enturmação]==-- ");
        System.out.println("Qual a posição do vetor deseja consultar? ");
        pos = entrada.nextInt();
        entrada.skip("\n");
        //TODO: Inserir try/catch para lançar exceção de busca fora do índice
        // testa se existe uma enturmação na posição escolhida pelo usuário
        if (enturmacoes.get(pos) != null) {
            System.out.println(enturmacoes.get(pos));
        } else {
            System.out.println(" Posição inválida. ");
        }
    }


    public void relatorio() {

        System.out.println("[Relatório de ENTURMACOES]");

        for(Enturmacao enturmacao: enturmacoes){
            System.out.println(enturmacao);
            System.out.println("---------------------");
        }

    }
}
