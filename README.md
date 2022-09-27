# poo_academico_tarefa1
## Atividade da aula de OO

### Critérios

Vamos praticar? As instruções do trabalho prático 01, estão abaixo - Sistema Acadêmico.

Você deve implementar em java ou c++:
1) As classes de modelo Pessoa (com atributos comuns a qualquer pessoa, como nome, cpf, telefone e email), Aluno e Professor (com seus atributos específicos. (1 ponto). As classes também devem ter os métodos getters e setters. (1 ponto) As classes devem ter os construtores apropriados. (1 ponto). Aluno e Professor devem ser classes especializadas (que herdam) de Pessoa.(1 ponto). Use os modificadores de acesso apropriados (1 ponto). Total do item (5 pontos)
2) As classes de modelo Turma e Enturmação. A classe Turma (deve ter seus atributos específicos, seus modificadores de acesso e métodos getters e setters (1 ponto). A classe de Enturmação deve ter como atributos, uma Turma e um Aluno. Ela é como se fosse uma matrícula, um aluno é associada a uma turma. Use os modificadores de acesso e métodos getters e setters apropriados (1 ponto). Total do item (2 pontos)
3) Desenvolva classes Ficharios para maninulação dos dados. Um Fichario de Alunos, outro para professor e assim respectivamente. Os fichários devem ter, cada um, os seguintes métodos: cadastrar, alterar, consultar, excluir e relatório. (3 pontos) Não deve ser possível cadastrar objetos repetidos (Alunos, Enturmações, Turmas ou Professor).(1 ponto). Deve ser possível consultar cada Objeto pelo índice do ArrayList ou pelo código/matrícula/registro. (1 ponto).Total do item (5 pontos)
4) Desenvolva uma classe Main contendo os menus que acionarão os fichários. (1 ponto) A classe main deve criar os ArrayLists apropriados para armazenar os objetos de cada modelo. (1 ponto). Use static para gerar sequenciais para os campos de matrícula, registro, código. (1 ponto). Total do item (3 pontos)
5) Tratar exceções, trabalhar com datas, sobreescrever métodos e construtores valem pontos extras nesta atividade. (2 pontos). Comentar código, implementar código limpo, legível, como declarar corretamente nomes de variáveis vale ponto extra. (1 ponto).
6) Essas duas regras de negócio valem pontos extras. Ao excluir uma Turma, no FicharioTurma.java, verificar se a turma tem enturmações cadastradas e não permitir exclusão (1 ponto). Ao excluir um Aluno, no FicharioAluno.java, verificar se o aluno está enturmado e não permitir exclusão (1 ponto).

