package br.com.appdahora.poo.modelos;

import java.util.Objects;

public class Turma {

    private String codigo;
    private String nome;

    public Turma(String codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
    }
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    @Override
    public String toString(){

        return "Codigo: "+this.codigo + " Nome: "+this.nome ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Turma turma = (Turma) o;
        return Objects.equals(codigo, turma.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

}
