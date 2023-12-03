package ecossitema;

public class Lobo extends Animal {

	public Lobo(String nome,int QTD_Animal, int idade, char sexo, boolean predador) {
		super(nome,QTD_Animal, idade, sexo, predador);
	}
	
	@Override
	public void nome() {
		System.out.println("Lobo faminto");
	}
}
