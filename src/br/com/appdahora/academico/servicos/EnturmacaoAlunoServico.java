package br.com.appdahora.academico.servicos;

import br.com.appdahora.academico.modelos.Aluno;

public class EnturmacaoAlunoServico {
    private Notificador notificador;
    public EnturmacaoAlunoServico(Notificador notificador){
        this.notificador = notificador;
    }
    public void avisar(Aluno aluno){
        this.notificador.notificar(aluno, "Sua enturmacao foi realizada!");
    }
}
