
package questao7Att;

public class Pedido {
    private int qtdLoja = 0;
    private int qtdCliente = 0;
    private Produto[] loja = new Produto[100];
    private Produto[] compra = new Produto[100];
    
    void addLoja(double custo,int quantidade, int cod){
        getLoja()[getQtdLoja()]=new Produto();
        getLoja()[getQtdLoja()].setCodigoProd(cod);
        getLoja()[getQtdLoja()].setPreco(custo);
        getLoja()[getQtdLoja()].setQtd(quantidade);
        setQtdLoja(getQtdLoja() + 1);
    }
    void carrinho(int cod, int quantidade){
        getCompra()[getQtdCliente()]=new Produto();
        getCompra()[getQtdCliente()].setCodigoProd(cod);
        getCompra()[getQtdCliente()].setQtd(quantidade);
        setQtdCliente(getQtdCliente() + 1);
    }
    void finalizaCompra(){
        int i,j;
        double total=0;
        for (i=0;i<getQtdCliente();i++){
            for (j=0;j<getQtdLoja();j++){
                if (getLoja()[j].getCodigoProd()==getCompra()[i].getCodigoProd()){
                    total+= getLoja()[j].getPreco()*getCompra()[i].getQtd();
                }
            }
        }
        System.out.printf("total da compra: %.2f\n",total);
    }

    public int getQtdLoja() {
        return qtdLoja;
    }

    public void setQtdLoja(int qtdLoja) {
        this.qtdLoja = qtdLoja;
    }

    public int getQtdCliente() {
        return qtdCliente;
    }

    public void setQtdCliente(int qtdCliente) {
        this.qtdCliente = qtdCliente;
    }

    public Produto[] getLoja() {
        return loja;
    }

    public void setLoja(Produto[] loja) {
        this.loja = loja;
    }

    public Produto[] getCompra() {
        return compra;
    }

    public void setCompra(Produto[] compra) {
        this.compra = compra;
    }
}