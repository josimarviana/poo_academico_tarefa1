import br.com.appdahora.poo.ficharios.FicharioAluno;
import br.com.appdahora.poo.modelos.Aluno;

import java.util.ArrayList;
import java.util.Scanner;
// completar os menus
// todos devem ter os metodos cadastrar, alterar, excluir, consultar e relatorio

public class Main {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        ArrayList<Aluno> alunos  = new ArrayList<Aluno>();
        FicharioAluno ficharioAluno = new FicharioAluno(alunos);

        int operacaoGeral, operacaoCadastro;
        do {
            System.out.println(" === ACADEMICO === ");
            System.out.println("1 - Aluno ");
            System.out.println("2 - Professor ");
            System.out.println("3 - Turmas ");
            System.out.println("4 - Sair ");
            operacaoGeral = entrada.nextInt();
            entrada.skip("\n");

            switch (operacaoGeral){
                case 1: // cadastro de aluno
                    do {
                        System.out.println(" === ALUNO === ");
                        System.out.println("1 - Cadastrar Aluno ");
                        System.out.println("2 - Alterar Aluno ");
                        System.out.println("3 - Excluir Aluno ");
                        System.out.println("4 - Consultar Aluno ");
                        System.out.println("5 - Relatório do Aluno ");
                        System.out.println("6 - Voltar ao menu principal");
                        System.out.println("Opção: ");
                        operacaoCadastro = entrada.nextInt();
                        entrada.skip("\n");

                        switch (operacaoCadastro) {
                            case 1:
                                ficharioAluno.cadastrar();
                                break;
                            case 5:
                                ficharioAluno.relatorio();
                                break;
                            default:
                                if (operacaoCadastro != 6) {
                                    System.out.println("Opção inválida.");
                                }
                        }

                    } while (operacaoCadastro != 6);

                    break; // fim do case aluno
                default:
                    if (operacaoGeral != 4) {
                        System.out.println("Opção inválida.");
                    }
            }
        } while ( operacaoGeral != 4);

    }
}
