package questao8Att;

public class Celular {
    private int capacidadeBateria=100;
    private int nivelBateria=100;
    
    void ligar(int tempo){
        setNivelBateria(getNivelBateria() - (tempo/5));
    }
    void texto(){
        setNivelBateria(getNivelBateria() - 1);
    }
    void consultarNivel(){
        System.out.printf("a bateria ainda possui %.0f ",100*(1.0*getNivelBateria())/getCapacidadeBateria());
    }

    public int getCapacidadeBateria() {
        return capacidadeBateria;
    }

    public void setCapacidadeBateria(int capacidadeBateria) {
        this.capacidadeBateria = capacidadeBateria;
    }

    public int getNivelBateria() {
        return nivelBateria;
    }

    public void setNivelBateria(int nivelBateria) {
        this.nivelBateria = nivelBateria;
    }
}