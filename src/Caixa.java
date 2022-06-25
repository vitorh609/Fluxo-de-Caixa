import javax.swing.*;

public class Caixa {
    public static void main(String[] args) throws Exception {
        Produtos produtos = new Produtos();
        produtos.cadadastrarProduto();
        produtos.venderProduto();
        int buttonDialog = JOptionPane.showConfirmDialog(null,
                "Deseja visualizar a quantidade de vnedas?",
                "",
                JOptionPane.YES_NO_OPTION);
        if (buttonDialog == JOptionPane.YES_OPTION) {
            produtos.mostrarVendas();
        }
    }
}
