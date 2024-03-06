package sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import agenda.modelo.Contacto;

public class TestHash {
	public static void main(String[] args) {
		
		Set<String> set1 = new LinkedHashSet<>();
		set1.add("uno");
		set1.add("dos");
		set1.add("tres");
		set1.add("cuatro");
		set1.add("cinco");
		set1.add("seis");
		set1.add("tres");
	
		System.out.println("uno".hashCode());
		
		System.out.println(set1.size());
		
		for (String nros : set1) {
			System.out.println(nros);
		}
		System.out.println("-------");
		
		List<String> lista = new ArrayList<>(set1);
		
		for (String elem : lista) {
			System.out.println(elem);
		}
		
		System.out.println("-----------");
		
		Contacto c1 = new Contacto("Pepe");
		c1.setIdContacto(1);
		
		Contacto c2 = new Contacto("Ariel");
		c2.setIdContacto(50);
		
		Contacto c3 = new Contacto("Susana");
		c3.setIdContacto(80);
		
		Contacto c4 = new Contacto("Marta");
		c4.setIdContacto(40);
		
		Set<Contacto> contactos = new HashSet<>();
		contactos.add(c1);
		contactos.add(c2);
		contactos.add(c3);
		contactos.add(c4);
		
		for (Contacto contacto : contactos) {
			System.out.println(contacto);
		}
		
	}
}
