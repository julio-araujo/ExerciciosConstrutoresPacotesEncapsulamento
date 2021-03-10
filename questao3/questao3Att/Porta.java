
package questao3Att;

public class Porta {
    private double largura;
    private double altura;
    private String cor;
    private int estado=1; //por definição -1 é aberto e 1 é fechado
    void estaAberta(){
        if (getEstado()==1){
            System.out.print("está fechado\n");
        }
        else if (getEstado()==-1){
            System.out.print("está aberto\n");
        }
    }

    public double getLargura() {
        return largura;
    }
    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getEstado() {
        return estado;
    }
    public void setEstado(int estado) {
        this.estado = estado;
    }
}