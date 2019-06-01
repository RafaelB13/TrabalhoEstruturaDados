package estruturas.listaduplamente;

public class NoL<T extends Comparable<T>> {
	
	T valor;
	NoL<T> proximo;
        NoL<T> anterior;
	
	public NoL(T valor) {
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