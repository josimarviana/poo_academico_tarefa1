package br.com.appdahora.poo.ficharios;
import br.com.appdahora.poo.modelos.Aluno;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class FicharioAluno {
    // private Aluno alunos[];
    private ArrayList<Aluno> alunos;
    private Scanner entrada;
    DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public FicharioAluno(ArrayList<Aluno> alunos){
        this.alunos = alunos;
        entrada = new Scanner(System.in);
    }

    public void cadastrar(){
        String nome, telefone, matricula, cpf, email, data;
        //TODO: Implementar o preenchimento da data de nascimento do aluno
        System.out.println(" === Cadastrar ALUNO ==== ");
        System.out.print("CPF: ");
        cpf = entrada.nextLine();

        Aluno alunoconsulta = new Aluno(cpf);
        if(alunos.contains(alunoconsulta)){
            System.out.println("Aluno já cadastrado!");
        }else{
            System.out.print("Nome: ");
            nome = entrada.nextLine();
            System.out.print("Telefone: ");
            telefone = entrada.nextLine();
            System.out.print("Email: ");
            email = entrada.nextLine();
            //TODO: Inserir tratamento exceção para formatação da data
            System.out.print("Data de Nascimento (dd/MM/yyyy): ");
            data = entrada.nextLine();
            LocalDate dataNascimento = LocalDate.parse(data, formatador);
            Aluno aluno = new Aluno(cpf, nome, telefone, email, dataNascimento);
            alunos.add(aluno);
        }

    }

    public void alterar() {
        String nome, telefone, cpf, email;

        System.out.println(" ==== Alterar ALUNO ==== ");

        Aluno aluno = buscar();
        //TODO: Ajustar busca para matricula ou cpf
        try{
            if (aluno != null) {

                System.out.println("CPF atual: " + aluno.getCpf()); //get_ pega valor do objeto
                System.out.print("Digite o novo CPF: ");
                cpf = entrada.nextLine();
                aluno.setCpf(cpf); // set_ coloca o valor no objeto

                System.out.println("Nome atual: " + aluno.getNome()); //get_ pega valor do objeto
                System.out.print("Digite o novo Nome: ");
                nome = entrada.nextLine();
                aluno.setNome(nome); // set_ coloca o valor no objeto

                System.out.println("Tefone atual: " + aluno.getTelefone()); //get_ pega valor do objeto
                System.out.print("Digite o novo Telefone: ");
                telefone = entrada.nextLine();
                aluno.setTelefone(telefone); // set_ coloca o valor no objeto

                System.out.println("Endereco email atual: " + aluno.getEmail()); //get_ pega valor do objeto
                System.out.print("Digite o novo Endereço email: ");
                email = entrada.nextLine();
                aluno.setEmail(email); // set_ coloca o valor no objeto

            } else {
                System.out.println(" Posicao inválida ");
            }
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("\nExceção alcançada, aluno não existe");
        }

    }

    public void excluir() {
        int resp;
        System.out.println(" --==[Excluir ALUNO]==-- ");
        //TODO: Inserir try/catch para lançar exceção de busca fora do índice
        Aluno aluno = buscar();

        if (aluno.getQuantidadeTurmas()==0) {
            System.out.println(aluno);
            System.out.println("Confirma a exclusão? (1-sim) e (2-não) ");
            resp = entrada.nextInt();
            entrada.skip("\n");

            if (resp == 1) {
                alunos.remove(aluno); // exclui um objeto do vetor
                System.out.println(" Exclusão efetuada com sucesso. ");

            } else {
                System.out.println(" Exclusão não efetuada. ");
            }

        } else {
            System.out.println(" Aluno não encontrado ou está enturmado. ");
        }
    }

    public void consultar() {

        System.out.println(" === Consultar ALUNO === ");
        Aluno aluno = buscar();

        if (aluno != null) {
            System.out.println(alunos.get(alunos.indexOf(aluno)));
        } else {
            System.out.println(" Aluno não encontrado ");
        }
    }

    public Aluno buscar(){
        //TODO: Inserir tratamento de erro para busca
        System.out.println("Qual o aluno deseja? Informe o critério de busca: ");
        System.out.println("Buscar por (1-cpf) e (2-matrícula) ");
        int resp = entrada.nextInt();
        entrada.skip("\n");

        if (resp == 1) {
            System.out.print("Informe o cpf do aluno: ");
            String cpfBusca = entrada.nextLine();
            return alunos.get(alunos.indexOf(new Aluno(cpfBusca)));
        } else {
            System.out.print("Informe a matricula do aluno: ");
            int matricula = entrada.nextInt();

            for(Aluno aluno: alunos){
                if(aluno.getMatricula()==matricula) {
                    return aluno;
                }
            }
        }
        return null;
    }
    public void relatorio() {

        System.out.println("[Relatório de ALUNOS]");

        for(Aluno aluno: alunos){
                System.out.println(aluno);
                System.out.println("---------------------");
            }

    }

}
