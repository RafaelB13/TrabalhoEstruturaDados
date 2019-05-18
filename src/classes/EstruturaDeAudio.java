
package classes;


public class EstruturaDeAudio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Testes
        Musica m1 = new Musica("Can't Stop", "C:/Users");
        Musica[] songs = new Musica[10];
        songs[0] = m1;
        
        Artista a1 = new Artista("Red Hot Chili Peppers", "Rock");
        
        
        Album album = new Album(songs, a1);
    }
    
}
