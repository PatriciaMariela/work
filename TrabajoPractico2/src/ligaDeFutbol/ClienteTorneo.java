package ligaDeFutbol;

public class ClienteTorneo {

	public static void main(String[] args) {

		Torneo torneo = new Torneo("Copa XXX", 2022);
		Torneo torneo2 = new Torneo("Copa X", 2021);
		
		
		var boca = new Equipo("Boca JR", new Ciudad("La Boca"));
		var banfield = new Equipo("Banfield", new Ciudad("Nuñez"));
		
		Equipo e1 = boca;
		Equipo e2 = new Equipo("River Plate", new Ciudad("Nuñez"));
		Equipo e3 = new Equipo("Racing", new Ciudad("La Boca"));
		Equipo e4 = new Equipo("San Lorenzo", new Ciudad("Simon Bolivar"));
		Equipo e5 = banfield;
		Equipo e6 = new Equipo("Huracan", new Ciudad("La Boca"));
		Equipo e7 = new Equipo("Talleres", new Ciudad("Nuñez"));
		Equipo e8 = new Equipo("Independiente", new Ciudad("La Boca"));
		Equipo e9 = new Equipo("Defensa y Justicia", new Ciudad("Nuñez"));
		Equipo e10 = new Equipo("Estudiantes", new Ciudad("La Boca"));
		Equipo e11 = new Equipo("Gimnasia y Esgrima de la PLata", new Ciudad("Nuñez"));
		Equipo e12 = new Equipo("Sarmiento", new Ciudad("La Boca"));

		TorneosAdmin torneos = new TorneosAdmin();

		torneos.agregar(new EquipoTorneo(e1, torneo2, 5, 5, 0, 0, 15, 2));
		torneos.agregar(new EquipoTorneo(e2, torneo, 5, 4, 1, 0, 15, 3));
		torneos.agregar(new EquipoTorneo(e3, torneo2, 5, 3, 4, 0, 8, 4));
		torneos.agregar(new EquipoTorneo(e4, torneo, 5, 5, 0, 0, 12, 6));
		torneos.agregar(new EquipoTorneo(e5, torneo, 5, 3, 1, 1, 2, 9));
		torneos.agregar(new EquipoTorneo(e6, torneo2, 5, 1, 4, 0, 3, 9));
		torneos.agregar(new EquipoTorneo(e7, torneo, 5, 0, 1, 4, 8, 6));
		torneos.agregar(new EquipoTorneo(e8, torneo2, 5, 4, 1, 0, 8, 4));
		torneos.agregar(new EquipoTorneo(e9, torneo, 5, 4, 1, 0, 10, 24));
		torneos.agregar(new EquipoTorneo(e10, torneo2, 5, 1, 0, 4, 2, 7));
		torneos.agregar(new EquipoTorneo(e11, torneo, 5, 4, 1, 0, 8, 5));
		torneos.agregar(new EquipoTorneo(e12, torneo, 5, 2, 0, 3, 5, 9));

		torneos.ordenar();

		System.out.println(torneos.toString());
		System.out.println(torneos.tablaPosiciones(torneo2));
		System.out.println(torneos.todosLosTorneos(e1));
		System.out.println("boca.compareTo(banfield): ");
		System.out.println(boca.compareTo(banfield));
		System.out.println("torneos.masGoleador()");
		System.out.println(torneos.masGoleador());
		System.out.println("torneos.vallaMenosVencida()");
		System.out.println(torneos.vallaMenosVencida());
	}

}
