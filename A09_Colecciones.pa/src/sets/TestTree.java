package sets;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

import agenda.modelo.Contacto;

public class TestTree {
	public static void main(String[] args) {
//		Set<String> dias = new TreeSet<>();
//		dias.add("Lunes");
//		dias.add("martes");
//		dias.add("Miercoles");
//		dias.add("Jueves");
//		dias.add("Viernes");
//		
//		for (String dia : dias) {
//			System.out.println(dia);
//		}
//		System.out.println("-----");
		
		Contacto c1 = new Contacto("M");
		c1.setIdContacto(1);
		
		Contacto c2 = new Contacto("D");
		c2.setIdContacto(15);
		
		Contacto c3 = new Contacto("P");
		c3.setIdContacto(50);
		
		Contacto c4 = new Contacto("S");
		c4.setIdContacto(10);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		
		Set<Contacto> contactos = new TreeSet<>();
		contactos.add(c1);
		contactos.add(c2);
		contactos.add(c3);
		contactos.add(c4);
		
		for (Contacto contacto : contactos) {
			System.out.println(contacto);
		}

		System.out.println("------------");
		
		Contacto[] arrCon = {c1, c2, c3, c4};
		for (Contacto contacto : arrCon) {
			System.out.println(contacto);
		}
		
		System.out.println("------------");
		Arrays.sort(arrCon);
		for (Contacto contacto : arrCon) {
			System.out.println(contacto);
		}

	}
}
