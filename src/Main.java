import br.com.appdahora.poo.ficharios.FicharioAluno;
import br.com.appdahora.poo.ficharios.FicharioProfessor;
import br.com.appdahora.poo.ficharios.FicharioTurma;
import br.com.appdahora.poo.modelos.Aluno;
import br.com.appdahora.poo.modelos.Professor;
import br.com.appdahora.poo.modelos.Turma;

import java.util.ArrayList;
import java.util.Scanner;
// completar os menus
// todos devem ter os metodos cadastrar, alterar, excluir, consultar e relatorio

public class Main {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        ArrayList<Aluno> alunos  = new ArrayList<Aluno>();
        FicharioAluno ficharioAluno = new FicharioAluno(alunos);
        ArrayList<Professor> professores  = new ArrayList<Professor>();
        FicharioProfessor ficharioProfessor = new FicharioProfessor(professores);
        ArrayList<Turma> turmas  = new ArrayList<Turma>();
        FicharioTurma ficharioTurma = new FicharioTurma(turmas);

        int operacaoGeral, opCadastroAluno, opCadastroProfessor, opCadastroTurma;
        do {
            System.out.println(" === ACADEMICO === ");
            System.out.println("1 - Aluno ");
            System.out.println("2 - Professor ");
            System.out.println("3 - Turmas ");
            System.out.println("0 - Sair ");
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
                        System.out.println("0 - Voltar ao menu principal");
                        System.out.println("Opção: ");
                        opCadastroAluno = entrada.nextInt();
                        entrada.skip("\n");

                        switch (opCadastroAluno) {
                            case 1:
                                ficharioAluno.cadastrar();
                                break;
                            case 2:
                                ficharioAluno.alterar();
                                break;
                            case 3:
                                ficharioAluno.excluir();
                                break;
                            case 4:
                                ficharioAluno.consultar();
                                break;
                            case 5:
                                ficharioAluno.relatorio();
                                break;
                            default:
                                if (opCadastroAluno != 0) {
                                    System.out.println("Opção inválida.");
                                }
                        }

                    } while (opCadastroAluno != 0);

                    break; // fim do case aluno
                case 2: // cadastro de professor
                    do {
                        System.out.println(" === PROFESSOR === ");
                        System.out.println("1 - Cadastrar Professor ");
                        System.out.println("2 - Alterar Professor ");
                        System.out.println("3 - Excluir Professor ");
                        System.out.println("4 - Consultar Professor ");
                        System.out.println("5 - Relatório do Professor ");
                        System.out.println("0 - Voltar ao menu principal");
                        System.out.println("Opção: ");
                        opCadastroProfessor = entrada.nextInt();
                        entrada.skip("\n");

                        switch (opCadastroProfessor) {
                            case 1:
                                ficharioProfessor.cadastrar();
                                break;
                            case 2:
                                ficharioProfessor.alterar();
                                break;
                            case 3:
                                ficharioProfessor.excluir();
                                break;
                            case 4:
                                ficharioProfessor.consultar();
                                break;
                            case 5:
                                ficharioProfessor.relatorio();
                                break;
                            default:
                                if (opCadastroProfessor != 0) {
                                    System.out.println("Opção inválida.");
                                }
                        }

                    } while (opCadastroProfessor != 0);

                    break; // fim do case professor
                case 3: // cadastro de turma
                    do {
                        System.out.println(" === TURMAS === ");
                        System.out.println("1 - Cadastrar Turma ");
                        System.out.println("2 - Alterar Turma ");
                        System.out.println("3 - Excluir Turma ");
                        System.out.println("4 - Consultar Turma ");
                        System.out.println("5 - Relatório da Turma ");
                        System.out.println("6 - Matricular alunos ");
                        System.out.println("7 - Desmatricular alunos ");
                        System.out.println("0 - Voltar ao menu principal");
                        System.out.println("Opção: ");
                        opCadastroTurma = entrada.nextInt();
                        entrada.skip("\n");

                        switch (opCadastroTurma) {
                            case 1:
                                ficharioTurma.cadastrar();
                                break;
                            case 2:
                                ficharioTurma.alterar();
                                break;
                            case 3:
                                ficharioTurma.excluir();
                                break;
                            case 4:
                                ficharioTurma.consultar();
                                break;
                            case 5:
                                ficharioTurma.relatorio();
                                break;
                            case 6:
                                System.out.println("em desenvolvimento ...");
                                break;
                            case 7:
                                System.out.println("em desenvolvimento ...");
                                break;
                            default:
                                if (opCadastroTurma != 0) {
                                    System.out.println("Opção inválida.");
                                }
                        }

                    } while (opCadastroTurma != 0);

                    break; // fim do case aluno
                default:
                    if (operacaoGeral != 0) {
                        System.out.println("Opção inválida.");
                    }
            }
        } while ( operacaoGeral != 0);

    }
}
