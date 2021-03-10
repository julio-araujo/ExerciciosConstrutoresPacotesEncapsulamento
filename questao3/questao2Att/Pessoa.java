
package questao2Att;

public class Pessoa {

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDiaMes() {
        return diaMes;
    }

    public void setDiaMes(String diaMes) {
        this.diaMes = diaMes;
    }
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    private String nome;
    private String diaMes;
    private int idade=0;
    void aniverssario(String data){
        if (getDiaMes()==data){
            setIdade(getIdade() + 1);
        }
    }
}