package mercado;

public class Produto {
    
    private String nome;
    private int qtd_estoque;
    private double preco;

    public Produto(String nome, double preco, int qtd_estoque){
        this.nome = nome;
        this.preco = preco;
        this.qtd_estoque = qtd_estoque;
    }
    
    
    public String getNome() {
        return this.nome;
    }

    public int getQtd_estoque() {
        return this.qtd_estoque;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQtd_estoque(int qtd_estoque) {
        this.qtd_estoque = qtd_estoque;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public void atualizaEstoque(int saida){
        this.qtd_estoque = this.qtd_estoque - saida;
        
    }
    
}
