
package classes;


public class Musica {
    public String nome;
    public  String local;
    
    

    public Musica(String nome, String local) {
        
        this.nome = nome;
        this.local = local;
        

    }

    public Musica() {
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
        return local; //+ ", Local: " + local
    }
    
    

   
    
    
}
