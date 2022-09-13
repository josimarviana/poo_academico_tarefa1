package br.com.appdahora.poo.modelos;

import java.util.Objects;

public class Enturmacao {
    public static int getCodigo() {
        return codigo;
    }

    private static int codigo;
    private Turma turma;
    private Aluno aluno;

    public Enturmacao(Turma turma, Aluno aluno) {
        codigo++;
        this.turma = turma;
        this.aluno = aluno;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Turma getTurma() {
        return turma;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Enturmacao that = (Enturmacao) o;
        return turma.equals(that.turma) && aluno.equals(that.aluno);
    }

    @Override
    public int hashCode() {
        return Objects.hash(turma, aluno);
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    @Override
    public String toString(){

        return "Codigo: "+Enturmacao.getCodigo() + " Turma: "+this.turma.getNome() + " Aluno: "+this.aluno.getNome();
    }


}