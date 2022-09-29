package br.com.appdahora.academico.servicos;

import br.com.appdahora.academico.modelos.Aluno;

public interface Notificador {
    void notificar (Aluno aluno, String mensagem);
}
