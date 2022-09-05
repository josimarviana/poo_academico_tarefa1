package br.com.appdahora.poo.modelos;

public class Aluno extends Pessoa{
    private String matricula;
    public Aluno(){

    }

    public Aluno(String nome){
        this.nome = nome;
    }
    public String toString(){
        return this.nome;
    }

}
