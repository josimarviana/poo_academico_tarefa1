package br.com.appdahora.poo.modelos;

public enum SituacaoAluno{
    NAOMATRICULADO{
        public String toString(){
            return "Não Matriculado";
        }
    }, MATRICULADO, FORMADO, CANCELADO, DESISTENTE;
}
