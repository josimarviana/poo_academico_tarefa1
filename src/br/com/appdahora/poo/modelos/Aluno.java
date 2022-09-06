package br.com.appdahora.poo.modelos;

import java.util.Objects;

public class Aluno extends Pessoa{
    private String matricula;
    public Aluno(){

    }

    public Aluno(String nome, String matricula){
        this.matricula = matricula;
        this.nome = nome;
    }
    @Override
    public String toString(){

        return this.nome + " "+this.matricula;
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
