package br.com.appdahora.poo.modelos;

import java.util.ArrayList;
import java.util.Objects;

public class Aluno extends Pessoa{
    private String matricula;
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

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Aluno(String matricula){
        this.matricula = matricula;
    }
    public Aluno(String matricula, String cpf, String nome, String telefone, String email){
        this.matricula = matricula;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
    }
    @Override
    public String toString(){

        return "Matricula: "+this.matricula + " Cpf: "+this.cpf+" Nome: "+this.nome+" Telefone: "+this.telefone+"  Email: "+this.email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(matricula, aluno.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula);
    }
}

