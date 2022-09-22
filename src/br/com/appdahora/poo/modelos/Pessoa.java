package br.com.appdahora.poo.modelos;

import java.util.Date;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected String telefone;
    protected String email;
    //TODO: Implementar o preenchimento da data de nascimento das pessoas
    protected Date dataNascimento;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public Pessoa(){

    }
    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }



    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
