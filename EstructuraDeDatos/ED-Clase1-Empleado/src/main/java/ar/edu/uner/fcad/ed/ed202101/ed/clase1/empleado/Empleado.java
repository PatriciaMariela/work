package ar.edu.uner.fcad.ed.ed202101.ed.clase1.empleado;

import java.util.Objects;

/**
 *
 * @author Nacho
 */
public class Empleado {
    
    private static final int ANIO_ACTUAL = 2021;

    private String dni;
    private String apellido;
    private String nombre;
    private int anioNacimiento;
    
    public Empleado(String dni, String apellido, String nombre, int anioNacimiento) { // throws Exception {
//        String validacion = validar(dni, apellido, nombre, anioNacimiento);
//        
//        if (!validacion.equals("OK")) {
//            throw new Exception (validacion);
//        }
        
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.anioNacimiento = anioNacimiento;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public int calcularEdad(){
        return ANIO_ACTUAL - anioNacimiento;
    }
    
    public int diferenciaEdad(Empleado e) {
        return this.anioNacimiento - e.getAnioNacimiento();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.dni);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        
        final Empleado other = (Empleado) obj;       
        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Empleado{" + "dni=" + dni + ", apellido=" + apellido + ", nombre=" + nombre + ", anioNacimiento=" + anioNacimiento + ", " + calcularEdad() + '}';
    }

//    private String validar(String dni, String apellido, String nombre, int anioNacimiento) {
//        String resultado = "";
//        if (dni == null) {
//            resultado += "DNI inválido. ";
//        }
//        if (apellido == null) {
//            resultado += "Apellido inválido. ";
//        }
//        
//        if (resultado.isEmpty()) {
//            resultado = "OK";
//        }
//        
//        return resultado;
//    }
}
