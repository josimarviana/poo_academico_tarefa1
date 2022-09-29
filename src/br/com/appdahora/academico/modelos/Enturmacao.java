package br.com.appdahora.academico.modelos;

import java.time.LocalDate;
import java.util.Objects;

public class Enturmacao {
    public int getCodigo() {
        return codigo;
    }

    private static int geradorCodigo;

    @Override
    public String toString(){

        return "Codigo: "+this.getCodigo() + " Turma: "+
                this.getTurma().getNome() + " Aluno: "+
                this.getAluno().getNome();
    }
    private int codigo;

    private Turma turma;
    private Aluno aluno;

    //TODO: Implementar o preenchimento da data de enturmação do aluno
    private LocalDate dataEnturmacao;

    public Enturmacao(Turma turma, Aluno aluno) {
        codigo = ++geradorCodigo;
        this.turma = turma;
        this.aluno = aluno;
        this.aluno.setSituacaoAluno(SituacaoAluno.MATRICULADO);
        this.turma.adicionarAluno(aluno);
        this.aluno.adicionarTurma(turma);

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




}
