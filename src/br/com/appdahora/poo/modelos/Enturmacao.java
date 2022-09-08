package br.com.appdahora.poo.modelos;

import javax.xml.crypto.dom.DOMCryptoContext;
import java.util.Objects;
import java.util.function.ToDoubleBiFunction;

public class Enturmacao {
    private int codigo;
    private Turma turma;
    private Aluno aluno;

    public Enturmacao(Turma turma, Aluno aluno) {
        //TODO Automatizar geração código
        this.codigo = 0;
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

        return "Turma: "+this.turma.getNome() + " Aluno: "+this.aluno.getNome();
    }


}
