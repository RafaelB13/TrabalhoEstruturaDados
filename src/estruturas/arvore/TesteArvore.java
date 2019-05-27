package estruturas.arvore;

import classes.Artista;
import classes.Arvore;
import estruturas.listaduplamente.ListaDuplamente;

/**
 *
 * @author Rafael Borges
 * github.com/RafaelB13
 */
public class TesteArvore {
    
    
    
    public static void main(String[] args) {
        Arvore<Artista> n = Arvore.getInstancia();
        Artista as = new Artista("Rafael", "Rock", new ListaDuplamente());
        
        
        
        
        n.inserirNo(as);
        
        System.out.println(n.buscaNo(as));
        
    }

}
