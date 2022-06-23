import javax.swing.*;

public class Produtos {
    private String preco;
    private String nome;
    private int valorProduto;
    private int valorRecebido;
    private float troco;
    public boolean escolha = true;
    private int vendas = 0;

    public void cadastrarProduto(){
        while (escolha == true) {
            this.nome = JOptionPane.showInputDialog("Digite o nome do produto");
            this.preco = JOptionPane.showInputDialog("Digite o preco");
            int escolha1 = JOptionPane.showInternalConfirmDialog(null,
                    "Deseja cadastar este produto?",
                    "CADASTRAR PRODUTO",
                    JOptionPane.YES_NO_OPTION,
                    0);
            if (escolha1 == 1){
                int escolha2 = JOptionPane.showInternalConfirmDialog(null,
                        "Deseja cadastrar o produto novamente? ",
                        "CADASTRO PRODUTO",
                        JOptionPane.YES_NO_OPTION,
                        0);
                escolha = true;
            }else {
                escolha = false;
            }
        }
        escolha = true;
    }

    public void venderProduto(){
        while (escolha = true) {
            String valor = JOptionPane.showInputDialog("Qual o valor do produto");
            this.valorProduto = Integer.parseInt(valor);
            String valorR = JOptionPane.showInputDialog("Valor recebido");
            this.valorRecebido = Integer.parseInt(valorR);

            if (valorRecebido > valorProduto) {
                String msgtroco = "A devolver: ";
                this.troco = valorProduto - valorRecebido;
                JOptionPane.showMessageDialog(null, msgtroco + troco);
                int escolha1 = JOptionPane.showInternalConfirmDialog(null,
                        "Deseja concluir esta venda? ",
                        "CONFIRMACAO DE VENDA",
                        JOptionPane.YES_NO_OPTION,
                        0);
                JOptionPane.showMessageDialog(null, "Venda confirmada");
                if (escolha1 == 0){
                    vendas = + 1;
                }
            } else {
                JOptionPane.showMessageDialog(null,
                        "O valor recebido nao pode ser menor que o valor do produto");
            }
            int escolha1 = JOptionPane.showInternalConfirmDialog(null,
                    "Deseja realizar nova venda?",
                    "",
                    JOptionPane.YES_NO_OPTION,
                    0);
            if (escolha1 == 1){
                escolha = false;
            }else {
                escolha = true;
            }

        }
        escolha = true;
    }
}
