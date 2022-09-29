package br.com.appdahora.academico.modelos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Aluno extends Pessoa{

    private static int geradorCodigo;
    private int matricula;

    private LocalDate dataNascimento;
    private ArrayList<Turma> turmas  = new ArrayList<Turma>();
    DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public void adicionarTurma(Turma turma){
        turmas.add(turma);
    }
    public SituacaoAluno getSituacaoAluno() {
        return situacaoAluno;
    }

    public int getQuantidadeTurmas(){
        return turmas.size();
    }

    public void setSituacaoAluno(SituacaoAluno situacaoAluno) {
        this.situacaoAluno = situacaoAluno;
    }

    private SituacaoAluno situacaoAluno = SituacaoAluno.NAOMATRICULADO;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Aluno(String cpf){

        this.cpf = cpf;
    }

    public Aluno(int matricula){

        this.matricula = matricula;
    }
    public Aluno(String cpf, String nome, String telefone, String email, LocalDate dataNascimento){
        matricula = ++geradorCodigo;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.dataNascimento = dataNascimento;
    }
    @Override
    public String toString(){

        return "Matricula: "+this.matricula + " Cpf: "+this.cpf+" Nome: "+this.nome+" Telefone: "+this.telefone+"  Email: "+this.email+" Data de Nascimento: "+this.dataNascimento.format(formatador)+"  Situacao: "+this.situacaoAluno;
    }

}

