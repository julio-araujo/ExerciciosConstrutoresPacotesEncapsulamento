package questa1Att;

public class Agenda {
    private Contato agenda[] = new Contato[100];
    private int qtdContato=0;
    void dicionarContato(Contato nome){
        if (getQtdContato()>100){
            System.out.print("lista cheia");
        }
        else{
            getAgenda()[getQtdContato()]=nome;
            setQtdContato(getQtdContato() + 1);
        }
    }
    void consultarContato(String nomeConsul){
        for (int i = 0;i<100;i++){
            if(getAgenda()[i].getNome() == null){
                System.out.print("erro, o nome não esta na lista\n");
            }
            else if (nomeConsul == null){
                System.out.print("erro, digite um nome valido\n");
            }
            else{
                System.out.printf("o numero de "+getAgenda()[i].getNome()+" é "+getAgenda()[i].getNumero());
            }
        }
    }

    public Contato[] getAgenda() {
        return agenda;
    }

    public void setAgenda(Contato[] agenda) {
        this.agenda = agenda;
    }

    public int getQtdContato() {
        return qtdContato;
    }

    public void setQtdContato(int qtdContato) {
        this.qtdContato = qtdContato;
    }
}