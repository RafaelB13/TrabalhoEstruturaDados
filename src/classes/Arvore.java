package classes;



public class Arvore<Artista extends Comparable<Artista>> {
	No raiz;
	
	public Arvore() {
		this.raiz = null;
	}
	
	public No inserirNo(Artista valor) {
		No n = new No(valor);
		return inserirNo(n, null);
		
	}
	public No inserirNo(No novo, No pai) {
		
		if(pai == null)
			pai = raiz;
		
		if(raiz == null) {
			raiz = novo;
		}else {
			//menor
			if( novo.obterValor().compareTo(pai.obterValor()) == -1) {
				
				if(pai.obterNoEsquerdo() == null)
					pai.inserirEsquerdo(novo);
				else
					inserirNo(novo, pai.obterNoEsquerdo());
				
			}else {
				
				if(pai.obterNoDireito() == null)
					pai.inserirDireito(novo);
				else
					inserirNo(novo, pai.obterNoDireito());
			}
		}
		
		return novo;
		
	}
	

	public No removerNo(Artista valor) {
		return removerNo(valor, null);
	}
	
	public No removerNo(Artista valor, No currentno) {
		
		No noret = null;
		
		if(currentno == null) 
			currentno = raiz;
		
		//igual
		if(currentno.obterValor().compareTo(valor) == 0) {
			//System.out.println(currentno.obterValor() + "� igual");
			//� um n� folha?
			if((currentno.obterNoDireito()== null) && (currentno.obterNoEsquerdo() == null)) {
				
				if(currentno == this.raiz)
					this.raiz = null;
				
				else if(currentno == currentno.pai.obterNoDireito() )
					currentno.pai.inserirDireito(null);
				else 
					currentno.pai.inserirEsquerdo(null);
			
			//tem apena sum filho � direita?
			}else if (currentno.obterNoDireito() == null){
				
				if(currentno == this.raiz)
					this.raiz = this.raiz.obterNoEsquerdo();
				
				else if(currentno == currentno.pai.obterNoDireito() )
					currentno.pai.inserirDireito( currentno.obterNoEsquerdo() );
				
				else 
					currentno.pai.inserirEsquerdo( currentno.obterNoEsquerdo() );
			
			//tem apena sum filho � esquerda?
			}else if (currentno.obterNoEsquerdo()== null){
				
				if(currentno == this.raiz)
					this.raiz = this.raiz.obterNoDireito();
				
				else if(currentno == currentno.pai.obterNoDireito() )
					currentno.pai.inserirDireito( currentno.obterNoDireito() );
				
				else 
					currentno.pai.inserirEsquerdo( currentno.obterNoDireito() );
			
			//tem dois filhos	
			}else {
				
				No sucessor = this.getSucessor(currentno, true);
				System.out.println("O sucessor �:" + sucessor+"\n");
				
				if(sucessor != currentno.obterNoDireito()) {
					
					sucessor.pai.inserirEsquerdo( sucessor.obterNoDireito() );
					sucessor.inserirDireito( currentno.obterNoDireito() );
				}
				
				
				//� a raiz
				if(currentno == this.raiz )
				   raiz = sucessor;
				
				//� o filho a esquerda
				else if(currentno == currentno.pai.obterNoDireito()) 
						currentno.pai.inserirDireito(sucessor);
				else 
						currentno.pai.inserirEsquerdo(sucessor);
			
				sucessor.inserirEsquerdo( currentno.obterNoEsquerdo() );
				
			}
			
			
			
		}else if( currentno.obterValor().compareTo(valor) == -1) {
			//System.out.println(currentno.obterValor() + "� menor que "+valor);
			removerNo(valor, currentno.obterNoDireito());
		}else {
			//System.out.println(currentno.obterValor() + "� mairo que "+valor);
			removerNo(valor, currentno.obterNoEsquerdo());
			
		}
	
		
		return null;
	}
	
	
	public No getSucessor(No atual, Boolean primeiraVez) {
		
		No sucessor  = null;
		
		if(primeiraVez)
			sucessor = atual.obterNoDireito();
		else
			sucessor = atual;
		
		if(sucessor.obterNoEsquerdo()!=null) {
			return getSucessor(sucessor.obterNoEsquerdo(), false);
		}
		    
		return sucessor; 
	}

	@Override
	public String toString() {

		return 	raiz+
		"\n" + raiz.direito +
		"\n" + raiz.direito.direito+
		"\n" + raiz.direito.esquerdo +
		"\n" + raiz.direito.direito.direito+
		"\n" + raiz.esquerdo +
		"\n" + raiz.esquerdo.direito +
		"\n" + raiz.esquerdo.esquerdo +
		"\n" + raiz.esquerdo.esquerdo.esquerdo;
		//"\n" + raiz.esquerdo.esquerdo.esquerdo.direito;



	}
}
