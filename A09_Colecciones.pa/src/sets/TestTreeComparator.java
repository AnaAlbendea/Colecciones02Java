package sets;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import agenda.modelo.Contacto;

public class TestTreeComparator {
	public static void main(String[] args) {
		Contacto c1 = new Contacto("M");
		c1.setIdContacto(1);
		
		Contacto c2 = new Contacto("D");
		c2.setIdContacto(15);
		
		Contacto c3 = new Contacto("P");
		c3.setIdContacto(50);
		
		Contacto c4 = new Contacto("S");
		c4.setIdContacto(10);
		
		//Orden Natural
		Set<Contacto> contactos = new TreeSet<>();
		contactos.add(c1);
		contactos.add(c2);
		contactos.add(c3);
		contactos.add(c4);
		
		System.out.println("Orden Natural (nombre):");
		for (Contacto contacto : contactos) {
			System.out.println(contacto);
		}
		System.out.println("------------");
		
		// 1 - Comparator con objeto anónimo "new ContatoIdComparator()"
		Set<Contacto> contactosComp = new TreeSet<Contacto>(new ContactoIdComparator());
		contactosComp.addAll(contactos);
		
		System.out.println("Orden con Comparator Objeto anónimo (id):");
		for (Contacto contacto : contactosComp) {
			System.out.println(contacto);
		}
		System.out.println("------------");
		
		
		// 2 - Comparator con clase anónima
		Set<Contacto> contactosComp2 = new TreeSet<Contacto>((con1, con2)->con1.getIdContacto()-con2.getIdContacto());
		contactosComp2.addAll(contactos);
		
		System.out.println("Orden con Comparator Clase anónima (id):");
		for (Contacto contacto : contactosComp2) {
			System.out.println(contacto);
		}
		System.out.println("------------");
		
		// 3 - Comparator desde un metodo estático de Contacto
		Set<Contacto> contactosComp3 = new TreeSet<Contacto>(Contacto.getIdComparator());
		contactosComp3.addAll(contactos);
		
		System.out.println("Orden con Comparator desde método estático en Contacto (id):");
		for (Contacto contacto : contactosComp3) {
			System.out.println(contacto);
		}
		System.out.println("------------");
		
		System.out.println("con metodo forEach");
		contactosComp3.forEach(System.out::println);
	}
}
