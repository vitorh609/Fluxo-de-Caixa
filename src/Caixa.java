import javax.swing.*;

public class Caixa {
    public static void main(String[] args) throws Exception {
        Produtos produtos = new Produtos();
        produtos.cadastrarProduto();
        
        produtos.venderProduto();
    }
}
