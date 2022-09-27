package br.com.appdahora.poo.modelos;

import java.util.ArrayList;
import java.util.Objects;

public class Aluno extends Pessoa{

    private static int geradorCodigo;
    private int matricula;
    private ArrayList<Turma> turmas  = new ArrayList<Turma>();

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

    private SituacaoAluno situacaoAluno = SituacaoAluno.NaoMatriculado;

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
    public Aluno(String cpf, String nome, String telefone, String email){
        matricula = ++geradorCodigo;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
    }
    @Override
    public String toString(){

        return "Matricula: "+this.matricula + " Cpf: "+this.cpf+" Nome: "+this.nome+" Telefone: "+this.telefone+"  Email: "+this.email+"  Situacao: "+this.situacaoAluno;
    }

}

