package ecossitema;

public class Animal extends SerVivo {
	
 
    public Animal(String nome, int QTD_Animal, int idade, char sexo, boolean predador) {
        super(nome,QTD_Animal, idade, sexo, predador);
    }

   public void nome() {
        System.out.println(nome);
    }
   public void comer(int QTD_coelhos) {
	   
	   
	   int cont = QTD_coelhos;
	 
	   for(int i = 0; i < cont; i++) {
	   if (predador && QTD_coelhos >= 0) {
			System.out.println(nome + " comeu " + QTD_Animal + " coelho agora so resta " + (QTD_coelhos) + " coelho ");
			System.out.println("-----------------------");
			QTD_coelhos -= QTD_Animal;
			
	     } else if (QTD_coelhos <= 0) {
	    	 System.out.println(nome + " esta com fome mas nao tem mais coelhos ");
	    	 
	     }
	   }
	 }
   
   public void reproduzir(int QTD_coelhos) {
	   
	   int cont2 = QTD_coelhos;
		  
	   for(int i = 1; i < cont2;i++) {
		   if(predador == false) {
			   System.out.println(nome + " coelho esta se reproduzindo " + i);
			   QTD_coelhos++;
		   }
	   }
   }
}
		
    	