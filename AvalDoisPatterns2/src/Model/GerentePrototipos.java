package Model;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class GerentePrototipos {
	
	private static GerentePrototipos gerente;	
	private Map<String, PrototipavelIF> registros;	
	
	private GerentePrototipos() throws InstantiationException, IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		this.registros = new HashMap<String, PrototipavelIF>();		
	}

	public void catalogar(String nome, PrototipavelIF curso) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException {
		this.registros.put(nome, curso);		
	}
	
	public static GerentePrototipos getInstance() throws InstantiationException, IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		if(GerentePrototipos.gerente == null) {
			GerentePrototipos.gerente = new GerentePrototipos();
		}
		return GerentePrototipos.gerente; 
	}
	
	public Curso getCurso(String chave) {
		return (Curso) registros.get(chave).prototipar();
	}
}
