package br.com.appdahora.poo.modelos;

public enum SituacaoAluno{
    NaoMatriculado{
        public String toString(){
            return "Não Matriculado";
        }
    }, Matriculado, Formado, Cancelado, Desistente;
}
