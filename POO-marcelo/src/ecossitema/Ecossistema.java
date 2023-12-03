package ecossitema;

import java.util.ArrayList;
import java.util.List;

public class Ecossistema {

	private List<SerVivo> SeresVivos = new ArrayList<>();
	
	public void ADDServivo(SerVivo serVivo) {
		SeresVivos.add(serVivo);
	}
	
	public List<SerVivo> getSeresVivos(){
		return SeresVivos;
	}
}
