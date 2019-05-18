package estruturas.listaduplamente;

public class No<T extends Comparable<T>> {
	
	private T valor;
	private No proximo;
        private No anterior;
	
	public No(T valor) {
		this.valor = valor;
		proximo = null;
                
	}
	
	/**obt�m o pr�ximo n� */
	public No<T> obterProximo() {
		return this.proximo;
	}
        
        public No<T> obterAnterior() {
		return this.anterior;
	}
	/**inserir o pr�ximo n� */
	public void inserirProximo(No proximo) {
		this.proximo = proximo;
	}
        
        public void inserirAnterior(No anterior) {
		this.anterior = anterior;
	}
	/**inserir o valor no n� */
	public void inserirValor(T valor) {
		this.valor= valor;
	}
	/**obter o valor do n� */
	public T obterValor() {
		return this.valor;
	}
	
	//m�tod toString para exibir o n�
	public String toString() {
		return this.valor.toString();
	}
	
}