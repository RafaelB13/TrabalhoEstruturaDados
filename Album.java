
package estruturadeaudio;


public class Album {
    
    public Musica[] songs;// corrigir o vetor para receber musicas 
    //o album recebe 10 musicas
    public Artista compositor;
    private int i=0;
    
    public void incluirsong(Musica music){
        songs[i]=music;
        i++;
    }

    public Album(Musica[] songs, Artista compositor) {
        this.songs = songs;
        this.compositor = compositor;
    }
    
    
}
