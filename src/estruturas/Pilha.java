package estruturas;

import java.util.ArrayList;

/**
 * 
 * @author luis araujo
 * Implementa��o de uma pilha baseada em vetor gen�rico
 * @param <T> Tipo do array
 */
public class Pilha<Musica> {

	/**
	 * Array da Pilha 
	 */
	private Musica[] arrayPilha;
	/**
	 * Atributo para armazenar o indice do topo da pilha
	 */
    private int topo;
    
    /**
     * Contrutor da Pilha
     * @param max Tamanho da pilha
     */
	public Pilha(int max){
		//instanciando um vetor gen�rico (cria um vetor do tipo Objetc e faz o cast (convers�o) para o tipo T
		arrayPilha = (Musica[]) new Object[max];
		topo = -1;
	}
	
	/**
	 * Insere um elemento se a pilha n�o estiver cheia
	 * @param elemento Elemento a ser inserido na pilha
	 * @return retora true se a opera��o foi bem sucedida
	 */
	public boolean inserir(Musica elemento) {

		if(!this.estaCheia()) {
			topo++;
			arrayPilha[topo] = elemento;
			return true;
		}
	    
		return false;
	}

	/**
	 * Remove um elemento da pilha, se ela n�o esiver vazia
	 * @return retorna o elemento se a opera��o foi bem sucedida
	 */
	public Musica remover() {
		
		
		if(!this.estaVazia()) {			
			return arrayPilha[topo--];
			
		}
		
		return null;

	}
	
	/**
	 * Verifica se a pilha est� vazia
	 * @return retorna true se a pilha estiver vazia
	 */
	public boolean estaVazia() {		
	    return topo == -1;
	}
	
	/**
	 * Verifica se a pilha est� cheia
	 * @return retorna true se a pilha estiver cheia
	 */
	public boolean estaCheia() {		
	    return topo == arrayPilha.length-1;

	}
        
        @Override
    public String toString() {

        String s ="";
        for (int i = 0; i <= topo; i++) {
            s+= arrayPilha[i];
            if (i < topo)
                s+= ", ";
        }
        return s;
    }

	
	
	
}
