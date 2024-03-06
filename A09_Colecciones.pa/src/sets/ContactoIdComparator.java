package sets;

import java.util.Comparator;

import agenda.modelo.Contacto;

public class ContactoIdComparator implements Comparator<Contacto> {

	@Override
	public int compare(Contacto c1, Contacto c2) {
		return c1.getIdContacto() - c2.getIdContacto();
	}

}
