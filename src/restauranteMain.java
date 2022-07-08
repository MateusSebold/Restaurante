import java.util.Scanner;
public class restauranteMain {

	public static void main(String[] args) {
		Scanner imput = new Scanner(System.in);
		
		Entrada e1 = new Entrada(20);
		pilhaPratos p1 = new pilhaPratos(50);
		listaMesas m1 = new listaMesas(1);
		Pagamento pg = new Pagamento(25);	
		e1.inserir(1);
		e1.inserir(2);
		e1.inserir(3);
		e1.inserir(4);
		e1.inserir(5);
		e1.inserir(6);
		e1.inserir(7);
		e1.inserir(8);
		m1.setTotalMesas(25);
		m1.inseririnicio(1);
		m1.inseririnicio(2);
		m1.inseririnicio(3);
		m1.inseririnicio(4);
		m1.inseririnicio(5);
		m1.inseririnicio(6);
		m1.inseririnicio(7);
		m1.inseririnicio(8);
		pg.inserir(120);
		pg.inserir(150);
		pg.inserir(321);
		pg.inserir(50);
		pg.inserir(73);
		p1.push(1);
		p1.push(1);
		p1.push(1);
		p1.push(1);
		p1.push(1);
		p1.push(1);
		p1.push(1);
		p1.push(1);
		p1.push(1);
		p1.push(1);
		p1.push(1);
		p1.push(1);
		p1.push(1);
		p1.push(1);
		p1.push(1);
		p1.push(1);
		p1.push(1);
		p1.push(1);
		p1.push(1);
		p1.push(1);
		p1.push(1);
		p1.push(1);
		p1.push(1);
		
		System.out.println("Você quer entrar na fila do Restarante? Responda com Yes e No!");
	    String resposta = imput.nextLine();
	    	
	    if(resposta.length()==3) {
	    	e1.inserir(72);
	    	int i=1;
	    	e1.getTamanho();
	    	for(i=10; i>e1.getTamanho();i--) {
	    		System.out.println("O tamanho da fila é: "+e1.getTamanho());
	    		e1.revover(); //retira da fila da entrada 
	    		p1.pop();  //retira um prato da pilha para os clientes que entraram antes
	    		m1.inseririnicio(m1.quantPessoas()+1); //adiciona mais uma mesa na lista de mesas ocupadas
	    		System.out.println(m1.quantPessoas());
	    	}
	    	if(p1.numeroPratos()!=0) { //validação se existe pratos na pliha 
	    		p1.pop(); //usuario pega um prato
	    		System.out.println("Sirva-se");
	    	}
	    	else {
	    		System.out.println("Requisite pratos a algum funconario");
	    		for(i=0; i<10;i++) { // adição de prato por parte dos funcionarios 
	    			p1.push(i);
	    		}
	    		p1.pop(); //usuario pega um prato
	    		System.out.println("Sirva-se");
	    	}
	    	System.out.println("Escolha uma mesa!");
	    	m1.inseririnicio(m1.quantPessoas()+1); //usuario escolhe uma mesa
	    	
	    	while (resposta.length()!=2) {
	    		System.out.println("Ainda esta comendo?");
	    		resposta=imput.nextLine();
	    	}
	    	
	    	for(i=0; i<17;i++) { //inserindo os clientes que entraram antes! 
	    		pg.inserir(150);;
	    	}
	    	
	    	System.out.println("Entre na fila do caixa! (digite qualquer coisa)"); 
	    	resposta = imput.nextLine();
	    	pg.inserir(129);// Usuario entra na fila do caixa
	    	
	    	float total =0;
	    	int contador = 0;
	    	while(pg.getTamanho()!=0) {
	    		total=pg.valorPagar()+total; //contagem do valor movimentado pelo caixa
	    		m1.deletarUltimo(); //esvaziando a lista de mesas ocupadas
	    		
	    		contador = contador +1;
	    		pg.revover();		
	    	}
	    	
	    	pg.setMovimentoCaixa(total);
	    	/*
	    	for(i=1;i<=7;i++) //novas pessoas que chegaram enquanto o uruario almoçava 
	    		e1.inserir(i);
	    	for(i=1;i<=9;i++)
	    		m1.inseririnicio(i);//novas pessoas que começaram a comer enquanto o uruario almoçava
	    	*/
	    	System.out.println("Obrigado por almoçar conosco");
	    	
	    	System.out.println("Deseja ver o Relatorio do dia?");
	    	resposta = imput.nextLine();
	    	
	    	if(resposta.length()==2) {
	    		System.out.println("Ate a próxima");
	    	}
	    	else {
	    		System.out.println("tamanho da fila de entrada: "+e1.getTamanho());
				System.out.println("tamanho da fila de pagamento: "+pg.getTamanho());
				System.out.println("quantidade de pessoas almoçando: "+m1.quantPessoas());
				System.out.println("quantidade de pessoas atendidas: "+contador);
				System.out.println("quantidade de pratos na pilha: "+p1.numeroPratos());
				System.out.println("quantidade de mesas vazias: "+m1.quantMesas());
				System.out.println("quantidade total de movimento de caixa: "+pg.getMovimentoCaixa());
	    	}
	    }
	    else System.out.println("Tenha um bom dia Usario");
		imput.close();
	}
}
