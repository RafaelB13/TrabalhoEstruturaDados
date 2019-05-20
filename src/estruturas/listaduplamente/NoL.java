package estruturas.listaduplamente;

public class NoL<Album extends Comparable<Album>> {
	
	private Album valor;
	private NoL proximo;
        private NoL anterior;
	
	public NoL(Album valor) {
		this.valor = valor;
		proximo = null;
                
	}
	
	/**obt�m o pr�ximo n� */
	public NoL obterProximo() {
		return this.proximo;
	}
        
        public NoL obterAnterior() {
		return this.anterior;
	}
	/**inserir o pr�ximo n� */
	public void inserirProximo(NoL proximo) {
		this.proximo = proximo;
	}
        
        public void inserirAnterior(NoL anterior) {
		this.anterior = anterior;
	}
	/**inserir o valor no n� */
	public void inserirValor(Album valor) {
		this.valor= valor;
	}
	/**obter o valor do n� */
	public Album obterValor() {
		return this.valor;
	}
	
	//m�tod toString para exibir o n�
	public String toString() {
		return this.valor.toString();
	}
	
}