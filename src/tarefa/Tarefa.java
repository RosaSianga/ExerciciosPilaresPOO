package tarefa;

public class Tarefa implements Concluivel{
    private String descricao;
    private boolean concluida;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }


    @Override
    public void concluir() {
        setConcluida(true);

    }

    @Override
    public boolean estaConcluida() {
        concluir();
        exibirStatus(concluida);
        return false;
    }

    public void exibirStatus(Boolean concluida){

        String status;
        if (concluida==true) {
            status = "Concluida";
        } else {
            status = "Pendente";
        }


        System.out.println("Descrição: " + descricao+ " Status: " + status);

    }

}
