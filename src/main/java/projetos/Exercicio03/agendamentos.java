package projetos.Exercicio03;

public class agendamentos {

    int totalagendamentos;
    String nome;
    String telefone;

    public agendamentos(int totalagendamentos, String nome, String telefone) {
        this.totalagendamentos = totalagendamentos;
        this.nome = nome;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Agendamento Nº " + totalagendamentos +
                " | Nome: " + nome +
                " | Telefone: " + telefone;
    }
}
