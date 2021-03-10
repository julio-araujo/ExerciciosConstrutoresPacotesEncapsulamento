
package questao4Att;

public class Casa {
    private String cor;
    private Porta[] listaPortas = new Porta[3];
    int quantasPortasEstaoAbertas(){
        int i, qtdPortaAberta=0;
        for (i=0;i<3;i++){
            if (getListaPortas()[i].estaAberta()==1){
                qtdPortaAberta++;
            }
        }
        return qtdPortaAberta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Porta[] getListaPortas() {
        return listaPortas;
    }

    public void setListaPortas(Porta[] listaPortas) {
        this.listaPortas = listaPortas;
    }
    
}