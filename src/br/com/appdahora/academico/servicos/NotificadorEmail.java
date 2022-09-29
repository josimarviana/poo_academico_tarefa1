package br.com.appdahora.academico.servicos;

import br.com.appdahora.academico.modelos.Aluno;

public class NotificadorEmail implements Notificador {
    public void notificar (Aluno aluno, String mensagem){
        System.out.printf("Notificando %s através do e-mail %s: %s\n", aluno.getNome(), aluno.getEmail(), mensagem);
    }
}
