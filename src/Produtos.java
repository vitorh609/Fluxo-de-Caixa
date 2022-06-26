import javax.swing.*;

public class Produtos implements Funcoes{
    private String preco;
    private String nome;
    private int valorProduto;
    private int valorRecebido;
    private float troco;
    private boolean escolha = true;
    private boolean escolha1;
    private int vendas = 0;
    private int cont = 0;

    String [] produto = new String[]{
    };

    public void cadadastrarProduto() {
        while (escolha == true) {
            setNome(JOptionPane.showInputDialog("Digite o nome do produto"));
            setPreco(JOptionPane.showInputDialog("Digite o preco"));
            int dialogButton = JOptionPane.showInternalConfirmDialog(null,
                    "Deseja cadastar este produto?",
                    "CADASTRAR PRODUTO",
                    JOptionPane.YES_NO_OPTION);
            if (dialogButton == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Produto cadastrado");
            } else {
                JOptionPane.showMessageDialog(null, "Produto nao cadastrado");
            }
            int confirm = JOptionPane.showConfirmDialog(null,
                    "Deseja cadastrar um novo produto? ",
                    "Confrimação",
                    JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION){
                setEscolha(true);
            }else if(confirm ==  JOptionPane.NO_OPTION){
                this.escolha = false;
            }
        }
    }

    public void venderProduto() {
        while (getEscolha() == true) {
            String valor = JOptionPane.showInputDialog("Qual o valor do produto");
            setValorProduto(Integer.parseInt(valor));
            String valorR = JOptionPane.showInputDialog("Valor recebido");
            setValorRecebido(Integer.parseInt(valorR));

                if (getValorRecebido() > getValorProduto()) {
                String msgtroco = "A devolver: ";
                setTroco(valorProduto - valorRecebido);
                JOptionPane.showMessageDialog(null, msgtroco + troco);
                int dialogbutton = JOptionPane.showInternalConfirmDialog(null,
                        "Deseja concluir esta venda? ",
                        "CONFIRMACAO DE VENDA",
                            JOptionPane.YES_NO_OPTION);
                    if (dialogbutton == JOptionPane.YES_OPTION)
                    {
                    setVendas(vendas + 1);
                    JOptionPane.showMessageDialog(null, "Venda confirmada");
                    }
                    if (dialogbutton == JOptionPane.NO_OPTION){
                    JOptionPane.showMessageDialog(null, "ERRO");
                    }

                } else {
                    JOptionPane.showMessageDialog(null,
                    "O valor recebido nao pode ser menor que o valor do produto");
                }
                int confirm = JOptionPane.showConfirmDialog(null, "Deseja realizar uma nova venda",
                    "",
                    JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.NO_OPTION){
                setEscolha(false);
            }
        }
    }
    public void mostrarVendas(){
        if(getVendas() > 0){
            JOptionPane.showMessageDialog(null, getVendas());
        }else if (getVendas() == 0){
            JOptionPane.showMessageDialog(null,
                    "Você não realizou nenhuma venda");
        }
    }
    public void mostrarProdutos() {
        JOptionPane.showMessageDialog(null, getNome());
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(int valorProduto) {
        this.valorProduto = valorProduto;
    }

    public int getValorRecebido() {
        return valorRecebido;
    }

    public void setValorRecebido(int valorRecebido) {
        this.valorRecebido = valorRecebido;
    }

    public float getTroco() {
        return troco;
    }

    public void setTroco(float troco) {
        this.troco = troco;
    }

    public boolean isEscolha() {
        return escolha;
    }

    public void setEscolha(boolean escolha) {
        this.escolha = escolha;
    }
    public boolean getEscolha() {
        return escolha;
    }


    public boolean isEscolha1() {
        return escolha1;
    }

    public void setEscolha1(boolean escolha1) {
        this.escolha1 = escolha1;
    }

    public int getVendas() {
        return vendas;
    }

    public void setVendas(int vendas) {
        this.vendas = vendas;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }
}
