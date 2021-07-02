package mercado;
public class Item {
   
    private Produto produto;
    private int qdt_comprado;

    public Item(Produto produto, int qdt_comprado) {
        this.produto = produto;
        this.qdt_comprado = qdt_comprado;
        if(this.qdt_comprado>this.produto.getQtd_estoque()){
            this.qdt_comprado = this.produto.getQtd_estoque();
        }
        this.produto.atualizaEstoque(this.qdt_comprado);
    }

    
    public Produto getProduto() {
        return this.produto;
    }

    public int getQdt_comprado() {
        return this.qdt_comprado;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public void setQdt_comprado(int qdt_comprado) {
        this.qdt_comprado = qdt_comprado;
        
    }
    
            }
