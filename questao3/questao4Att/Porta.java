package questao4Att;

public class Porta {
    private double largura=0;
    private double altura=0;
    private String cor = "preto";
    private int estado=1; //por definição 1 é aberto e -1 é fechado
    int estaAberta(){
        return getEstado();
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