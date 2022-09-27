package br.com.appdahora.poo.modelos;

import java.util.Objects;

public class Professor extends Pessoa{

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

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }


}
