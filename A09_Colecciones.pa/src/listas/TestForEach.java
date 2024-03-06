package listas;

import java.util.ArrayList;
import java.util.List;

public class TestForEach {
	public static void main(String[] args) {
		List<String> palabras = new ArrayList<>();
		palabras.add("uno");
		palabras.add("dos");
		palabras.add("tres");
		palabras.add("cuatro");
		
		for (String palabra : palabras) {
			System.out.println(palabra.toUpperCase());
		}
		
	}
}
