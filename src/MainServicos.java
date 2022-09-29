import br.com.appdahora.academico.modelos.Aluno;
import br.com.appdahora.academico.servicos.MatriculaAlunoServico;
import br.com.appdahora.academico.servicos.Notificador;
import br.com.appdahora.academico.servicos.NotificadorEmail;

import java.time.LocalDate;

public class MainServicos {
    public static void main(String[] args) {
        Aluno maria = new Aluno("026", "Maria", "3231", "maria@gmail.com", LocalDate.now());
        Aluno joao = new Aluno("027", "João", "3232", "joao@gmail.com", LocalDate.now());

        Notificador notificador = new NotificadorEmail();
        MatriculaAlunoServico matriculaAluno = new MatriculaAlunoServico(notificador);
        matriculaAluno.avisar(joao);
        matriculaAluno.avisar(maria);
    }
}
