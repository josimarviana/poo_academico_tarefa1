package br.com.appdahora.poo.modelos;

import java.util.Objects;

public class Aluno extends Pessoa{
    private String matricula;

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
