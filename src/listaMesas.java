public class listaMesas {

	private Nodo inicio;
	private int totalMesas;

	public listaMesas(int dado) {
		inicio = new Nodo(dado);
	}

	public Nodo getInicio() {
		return inicio;
	}

	public void inseririnicio(int dado) {
		Nodo novoNodo = new Nodo(dado);
		novoNodo.setProx(inicio);
		inicio = novoNodo;
	}

	public String mostraLista() {
		String lista = "";
		Nodo aux = inicio;
		while (aux!=null) {
			lista += aux.getDado();
			aux=aux.getProx();
		}
		return lista;
	}

	public void deleteComValor(int valor) {
		if(inicio == null) return;
		if(inicio.getDado()==valor) {
			inicio=inicio.getProx();
			return;
		}
		
		Nodo aux = inicio;
		while (aux.getProx()!=null) {
			if(aux.getProx().getDado()==valor) {
			aux.setProx(aux.getProx().getProx());
			return;
		}
			aux=aux.getProx();
		}
		
		}
	
		public void deletarUltimo() {
			Nodo aux = inicio;
			Nodo anterior = null;
			if (inicio == null) return;
			if(inicio.getProx() == null) {
				inicio = null;
				return;
			}
			while (aux.getProx()!=null) {
				anterior = aux;
				aux=aux.getProx();
			}
			anterior.setProx(null);
		}
		
		public int  quantPessoas() { //contagem de mesas ocupadas 
			int quantidade = 0;
			Nodo aux = inicio;
			while (aux!=null) {
				quantidade = quantidade+1;
				aux=aux.getProx();
			}
			return quantidade;
		}
		
		public int getTotalMesas() {
			return totalMesas;
		}

		public void setTotalMesas(int totalMesas) {
			this.totalMesas = totalMesas;
		}

		public int quantMesas() {
			return getTotalMesas()-quantPessoas();
		}	
}
