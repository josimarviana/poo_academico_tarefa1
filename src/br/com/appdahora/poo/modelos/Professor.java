package br.com.appdahora.poo.modelos;

import java.util.Objects;

public class Professor extends Pessoa{
    // deve ter os metodos toString, equals e hashCode
    private String registro;

    public Professor(String registro, String cpf, String nome, String telefone, String email){
        this.registro = registro;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
    }
    @Override
    public String toString(){

        return "Registro: "+this.registro + " Cpf: "+this.cpf+" Nome: "+this.nome+" Telefone: "+this.telefone+"  Email: "+this.email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Professor professor = (Professor) o;
        return Objects.equals(registro, professor.registro);
    }

    @Override
    public int hashCode() {
        return Objects.hash(registro);
    }
    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }


}
