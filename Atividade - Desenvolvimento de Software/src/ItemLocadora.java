// Autores: Victor Gabriel Purkott Coelho e Humberto Camargo de Castro

public class ItemLocadora {
    protected String nome;
    protected double preco;
    protected int qtdItem;

    public ItemLocadora() {}

    public ItemLocadora(String nome, double preco, int qtdItem) {
        this.nome = nome;
        this.preco = preco;
        this.qtdItem = qtdItem;
    }

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

    public int getQtdItem() {
        return qtdItem;
    }

    public void setQtdItem(int qtdItem) {
        this.qtdItem = qtdItem;
    }
}
