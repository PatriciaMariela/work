package ar.edu.uner.fcad.ed.ed202101.ed.clase1.empleado;

/**
 *
 * @author Nacho
 */
public class ClienteEmpleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        var e1 = new Empleado("31679157", "Agüero", "Sergio Leonel", 1988);

        System.out.println(e1.toString());

        var e2 = new Empleado("31654879", "Messi", "Lionel", 1987);

        System.out.println(e2.toString());

        System.out.println("Diferencia: " + e1.diferenciaEdad(e2));

    }

}
