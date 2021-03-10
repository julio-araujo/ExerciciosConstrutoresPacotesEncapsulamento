package questao5Att;

public class Televisao {
    private boolean ligada=false;
    private boolean silencioso=false;
    private int volume=0;
    private int canal=0;
    void onOff(){
        if (isLigada()==false){
            setLigada(true);
        }
        else{
            setLigada(false);
        }
    }
    void mute(){
        if (isSilencioso()==false){
            setSilencioso(true);
        }
        else{
            setSilencioso(false);
        }
    }
    void mudaCanalEspecifico(int canalNovo){
        if (canalNovo>99 | canalNovo<0){
            System.out.print("canal invalido\n");
        }
        else{
            setCanal(canalNovo);
        }
    }
    void mudaProximoCanal(){
        if (getCanal()!=99){
            setCanal(getCanal() + 1);
        }
        else{
            System.out.print("comando invalido\n");
        }
    }
    void mudaAnteriorCanal(){
        if (getCanal()!=0){
            setCanal(getCanal() - 1);
        }
        else{
            System.out.print("comando invalido\n");
        }
    }
    void aumentaVol(){
        if (getVolume()!=10){
            setVolume(getVolume() + 1);
        }
        else{
            System.out.print("comando invalido\n");
        }
    }
    void diminuiVol(){
        if (getVolume()!=0){
            setVolume(getVolume() - 1);
        }
        else{
            System.out.print("comando invalido\n");
        }
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public boolean isSilencioso() {
        return silencioso;
    }

    public void setSilencioso(boolean silencioso) {
        this.silencioso = silencioso;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }
    
}