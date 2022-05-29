package ar.edu.uner.fcad.ed.clase1.arrayoo.ejercicio;

/**
 *
 * @author Nacho
 */
public class Clase1ArrayOOEjercicio {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		var objeto = new ArrayOO();
		objeto.add(1);
		objeto.add(2);
		objeto.add(3);
		objeto.add(4);
		objeto.add(5);
		objeto.add(6);
		objeto.add(7);
		objeto.add(8);
		objeto.add(9);

		System.out.println("toString(): " + objeto.toString());

		objeto.remove(2);
		System.out.println("remove(2): " + objeto.toString());

		objeto.set(4, 33);
		System.out.println("objeto.set(8, 33): " + objeto.toString());

		System.out.println("objeto.get(i): ");
		for (var i = 0; i < objeto.size(); i++) {
			System.out.println("[" + i + "]: " + objeto.get(i));
		}

		objeto.maximo();
		System.out.println("objeto.maximo(): " + objeto.maximo());

		objeto.minimo();
		System.out.println("objeto.minimo(): " + objeto.minimo());

		objeto.promedio();
		System.out.println("objeto.promedio(): " + objeto.promedio());

		objeto.set(0, 33);
		objeto.quitarRepetidos();
		System.out.println("objeto.quitarRepetidos(): " + objeto.toString());
	}

}
