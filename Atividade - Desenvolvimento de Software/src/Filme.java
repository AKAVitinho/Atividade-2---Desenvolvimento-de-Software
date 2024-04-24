// Autores: Victor Gabriel Purkott Coelho e Humberto Camargo de Castro

public class Filme extends ItemLocadora {
    private String diretor;
    private int duracao;

    public Filme() {}

    public Filme(String nome, double preco, int qtdItem, String diretor, int duracao) {
        super(nome, preco, qtdItem);
        this.diretor = diretor;
        this.duracao = duracao;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "\nFilme\n" +
                "nome: " + getNome() +
                ", preco: " + getPreco() +
                ", quantidade: " + getQtdItem() +
                ", diretor: " + diretor +
                ", duracao: " + duracao + " minutos";
    }
}
