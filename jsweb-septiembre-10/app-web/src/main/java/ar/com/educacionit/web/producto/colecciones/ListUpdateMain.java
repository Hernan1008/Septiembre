package ar.com.educacionit.web.producto.colecciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListUpdateMain {

	public static void main(String[] args) {
	
		//interfaz nombre = new clase
		List<Integer> numerosList =  new ArrayList<Integer>();
		List<Integer> numerosListUpdated =  new ArrayList<Integer>();
		
		System.out.println("Lista creada");
		System.out.println("Tamanio: " + numerosList.size());
		//agregar?
		for(int i=1;i<=10;i++) {
			numerosList.add(i);
		}
		
		//recorrdio sobre coleccion con Iterator
		Iterator<Integer> itNumeros = numerosList.iterator();
		
		//muevo sobre el iterator
		while(itNumeros.hasNext()) {
			//obtengo el elemento de la nuemerosList
			Integer numeroEnLista = itNumeros.next();
			
			numeroEnLista+=10;
			
			numerosListUpdated.add(numeroEnLista);
			
			itNumeros.remove();
			System.out.println(numeroEnLista);
		}
		
	}

}