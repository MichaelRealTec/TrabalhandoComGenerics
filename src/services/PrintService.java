package services;

import java.util.ArrayList;
import java.util.List;

public class PrintService {
	// Atributos
	List<Integer> list = new ArrayList<>();
	
	// Método Construtor
	public PrintService() {
		
	}
	
	// Métodos
	public void addValue(Integer value) {
		list.add(value);
	}
	
	public Integer first() {
		if(list.isEmpty()) {
			throw new IllegalStateException("List is empty");
		}
		return list.get(0);
	}
	
}
