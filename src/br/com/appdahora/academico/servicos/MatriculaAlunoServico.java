package br.com.appdahora.academico.servicos;

import br.com.appdahora.academico.modelos.Aluno;

public class MatriculaAlunoServico {
    private Notificador notificador;
    public MatriculaAlunoServico(Notificador notificador){
        this.notificador = notificador;
    }
    public void avisar (Aluno aluno){
        this.notificador.notificar(aluno, "Sua matrícula foi realizada");
    }
}
