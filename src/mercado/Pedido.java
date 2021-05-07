package mercado;

public class Pedido {
   
    private Cliente cliente;
    private Item itens[] = new Item[10];
    private double valor_total;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
    }
    
    private int controle = 0;
    
    public void adicionarItem(Item item) {
        this.itens[this.controle] = item;
        this.valor_total = this.valor_total + (item.getQdt_comprado() * item.getProduto().getPreco());
        this.controle++;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getValor_total() {
        return valor_total;
    }

    public Item[] getItens() {
        return itens;
    }

    public int getControle() {
        return controle;
    }
    
    
        }
