package musicas;

import jaco.mp3.player.MP3Player;

/**
 *
 * @author Rafael Borges
 * github.com/RafaelB13
 */
public class LinkinPark {
    
    MP3Player player;
    String diretorio;
    String path;
    
    public static LinkinPark m;
    
    static public LinkinPark getInstanciaLinkinPark(){
        if(m == null){
            m = new LinkinPark();
        }
        
        
        return m;
    }

}
