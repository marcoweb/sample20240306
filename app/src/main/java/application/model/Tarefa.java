package application.model;

public class Tarefa extends AbstractAtividade {
    @Override
    public String getDetails() {
        return "[T] " + this.getDescricao();
    }

    public Tarefa(String descricao) {
        this.setDescricao(descricao);
    }
}
