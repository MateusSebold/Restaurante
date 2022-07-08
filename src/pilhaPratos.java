
public class pilhaPratos {

	private Nodo topo;
	private int tamanho = 0;
	private int limite = 0;

	public pilhaPratos(int limite) {
		this.limite = limite;
	}
	
	public boolean estaVazio() {
		return tamanho == 0;
	}
	
	public boolean temEspaco() {
		return limite > tamanho;
	}
	public void push(int dado) {
		if(temEspaco()) {
		Nodo novoItem = new Nodo(dado);
		novoItem.setProx(topo);
		topo = novoItem;
		tamanho++;
		}else 
			System.out.println("Pilha cheia");
	}
	public void pop(){
		if (!estaVazio()) {
			System.out.println(topo.getProx()+" foi retirado da pilha");
			topo = topo.getProx();
			tamanho--;
		}else {
			System.out.println("Pilha está vazia");
		}
	}
	public int top() {
		return topo.getDado();
	}
	
	public int numeroPratos() {
		Nodo aux = topo;
		int quantidade = 0;
		while (aux!=null) {
			quantidade = quantidade+1;
			aux=aux.getProx();
		}
		return quantidade;
	}
}
