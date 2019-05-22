
package classes;


public class Musica {
    private String nome;
    private String local;

    public Musica(String nome, String local) {
        this.nome = nome;
        this.local = local;

    }







    // eu não entendo necassári colocar sets se temos o construtor
    public String getNome() {
        return nome;
    }

    public String getLocal() {
        return local;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    @Override
    public String toString() {
        return "\n    " + nome + ", Local: " + local ;
    }
    
    

   
    
    
}
