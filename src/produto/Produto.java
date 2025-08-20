package produto;

public class Produto implements Exibivel{
    private String nome;
    private double preco;
    private String categoria;

    //Construtor
    public Produto(String nome, double preco, String categoria) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }

    //Encapsulamento
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Nome      : " + getNome());
        System.out.println("Preço     : " + getPreco());
        System.out.println("Categoria : " + getCategoria());
        System.out.println("-------------------------");
    }
}
