package br.com.appdahora.academico.servicos;

import br.com.appdahora.academico.modelos.Aluno;

public class NotificadorWhatsapp implements Notificador{
    public void notificar (Aluno aluno, String mensagem){
        System.out.printf("Notificando %s através do Whatsapp %s: %s\n", aluno.getNome(), aluno.getTelefone(), mensagem);
    }
}
