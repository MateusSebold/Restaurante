public class Entrada {

	private Nodo inicio = null;
	private Nodo fim=null;
	private int limite=0;
	private int tamanho=0;

	public Entrada (int limite) {
		this.limite=limite;
	}

	public int getTamanho() {
		return tamanho;
	}

	public boolean temEspašo() {
		return limite > tamanho;
		
	}

	public boolean estaVazio() {
		return tamanho ==0;
	}

	public void inserir(int dado) {
		if(temEspašo()) {
			Nodo novoItem = new Nodo(dado);
			System.out.println(novoItem.getDado()+" inserido na fila");
			
		
			if(estaVazio()) {
				inicio=novoItem;
				fim=novoItem;
			}else {
				fim.setProx(novoItem);
				fim=novoItem;
		}
			tamanho++;
		}
		
		else System.out.println("Fila Cheia");	
	}

	public void revover() {
		if(tamanho>0){
			System.out.println(inicio.getDado()+"removido da fila");
		
			if(getTamanho()==1) {
				inicio=null;
				fim=null;
			
			}else inicio=inicio.getProx();
				tamanho--;
		}else System.out.println("Fila vazia");
	}
	public int getInicio() {
		if(estaVazio())
			return inicio.getDado();
		else {
			System.out.println("Fila esta vazia");
			return -1;
		}
	}
}