package mercado;


public class Mercado {

    
    public static void main(String[] args) {
        
        Cliente c1 = new Cliente("Bruno Campos", "122.133.455-09");
        Cliente c2 = new Cliente("Iani Vargas", "126.130.958-90");
        Cliente c3 = new Cliente("Laryssa Angeli", "100.193.555-22");
        Cliente c4 = new Cliente("Maria Lopes", "765.190.975-87");
        
        Produto p1 = new Produto("Papel", 2.50, 230);
        Produto p2 = new Produto("Lápis", 1.50, 200);
        Produto p3 = new Produto("Régua", 0.50, 300);
        Produto p4 = new Produto("Giz", 1.00, 250);
        
        Item i1 = new Item(p2, 1);
        Item i2 = new Item(p3, 2);
        Item i3 = new Item(p4, 3);
        Item i4 = new Item(p1, 4);
        
        Pedido pd1 = new Pedido(c1);
        pd1.adicionarItem(i1);
        pd1.adicionarItem(i2);
        pd1.adicionarItem(i3);
           
        System.out.println("Nome Cliente: " + pd1.getCliente().getNome());
        System.out.println ("Total: " + pd1.getValor_total()); 
        
        Item itens[] = pd1.getItens();
        
        for(int i = 0; i< pd1.getControle(); i++){
            System.out.print("Produto: " + itens[i].getProduto().getNome());
            System.out.print("| Quantidade: " + itens[i].getQdt_comprado());
            System.out.println("| Valor Unidade: " + itens[i].getProduto().getPreco());
        }
            System.out.println("-----------------------------------------------------");
            System.out.println("Qtd. Produto no Estoque: " + p1.getQtd_estoque());
            System.out.println("Qtd. Produto no Estoque: " + p2.getQtd_estoque());
            System.out.println("Qtd. Produto no Estoque: " + p3.getQtd_estoque());
            System.out.println("Qtd. Produto no Estoque: " + p4.getQtd_estoque());
  
      
        
    }
    
}
