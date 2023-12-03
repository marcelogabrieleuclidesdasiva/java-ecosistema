package ecossitema;

import java.util.Scanner;

public class Simulador {

	public static void main(String[] args) {
		Ecossistema ecossistema = new Ecossistema();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Quantos coelhos o lobo pode comer: ");
		int QTD_lobo = scanner.nextInt();
		
		System.out.println("Qual é a quantidade de coelhos: ");
		int QTD_coelhos = scanner.nextInt();
		
		Lobo lobo = new Lobo("lobo",QTD_lobo,10, 'M', true );
		ecossistema.ADDServivo(lobo);
		
		Coelho coelho = new Coelho("Coelho",QTD_coelhos , 5, 'F', false );
		ecossistema.ADDServivo(coelho);
		
		for(SerVivo serVivo : ecossistema.getSeresVivos()) {
			if(serVivo instanceof Animal) {
			Animal animal = (Animal) serVivo;
			
			animal.nome();
			animal.comer(QTD_coelhos);
			animal.reproduzir(QTD_coelhos);
		    
			}
		}
	}
}
