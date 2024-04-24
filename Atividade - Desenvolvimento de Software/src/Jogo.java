// Autores: Victor Gabriel Purkott Coelho e Humberto Camargo de Castro

public class Jogo extends ItemLocadora {
    private String plataforma;

    public Jogo() {}

    public Jogo(String nome, double preco, int qtdItem, String plataforma) {
        super(nome, preco, qtdItem);
        this.plataforma = plataforma;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    @Override
    public String toString() {
        return "\nJogo\n" +
                "nome: " + getNome() +
                ", preco: " + getPreco() +
                ", quantidade: " + getQtdItem() +
                ", plataforma: " + plataforma;
    }
}
