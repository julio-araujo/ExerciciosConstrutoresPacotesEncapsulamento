package questao6Att;
import java.util.Random;
/* obs: perceba que não foi utilizado nomes especiais (AS,Rei,...). 
a utizização delas será feina no main, atravez de um if.
*/
public class Baralho {
    private Carta []cards = new Carta[52];
    void ordenaBaralho(){
        int i;
        for (i=0;i<13;i++){
            cards[i].setNaipe("copas");
            cards[i].setValor(i%13);
        }
        for (i=13;i<26;i++){
            cards[i].setNaipe("espadas");
            cards[i].setValor(i%13);
        }
        for (i=26;i<39;i++){
            cards[i].setNaipe("ouros");
            cards[i].setValor(i%13);
        }
        for (i=39;i<52;i++){
            cards[i].setNaipe("paus");
            cards[i].setValor(i%13);
        }
    }
    void embaralha(){
        Random num = new Random();
        int i;
        for (i=0;i<52;i++){
            int j = num.nextInt(52);
            Carta temp=getCards()[i];
            getCards()[i]=getCards()[j];
            getCards()[j]=temp;
        }
    }
    void iniciaBaralho(){
        int i;
        for (i=0;i<52;i++){
            Carta novaCarta = new Carta();
            getCards()[i]=novaCarta;
        }
        for (i=0;i<13;i++){
            cards[i].setNaipe("copas");
            cards[i].setValor(i%13);
        }
        for (i=13;i<26;i++){
            cards[i].setNaipe("espadas");
            cards[i].setValor(i%13);
        }
        for (i=26;i<39;i++){
            cards[i].setNaipe("ouros");
            cards[i].setValor(i%13);
        }
        for (i=39;i<52;i++){
            cards[i].setNaipe("paus");
            cards[i].setValor(i%13);
        }
    }

    public Carta[] getCards() {
        return cards;
    }

    public void setCards(Carta[] cards) {
        this.cards = cards;
    }
}