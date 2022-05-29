package ar.edu.uner.fcad.ed.clase1.arrayoo.ejercicio;

import java.util.Arrays;

/**
 * 
 * @author Nacho
 */
public class ArrayOO {
	private int[] array;

	/**
	 * Inicializa un array sin posiciones.
	 */
	public ArrayOO() {
		this.array = new int[0];
	}

	/**
	 * Incrementa en uno la longitud del array e inserta en la última posición el
	 * valor pasado por parámetro
	 * 
	 * @param valor
	 */
	public void add(int valor) {
		// Crear nuevoArray con length = array.length + 1
		int[] nuevoArray = new int[array.length + 1];
		// Copiar los valores de array en otro array nuevoArray
		for (int i = 0; i < array.length; i++) {
			nuevoArray[i] = array[i];
		}
		// Poner el nuevo valor en nuevoArray
		nuevoArray[nuevoArray.length - 1] = valor;
		// Sobreescribir el valor de array
		this.array = nuevoArray;
	}

	/**
	 * Quita el elemento ubicado en la posición especificada por el parámetro y
	 * disminuye en uno la longitud del array.
	 * 
	 * @param indice
	 */
	public void remove(int indice) {
		// Crear nuevoArray con length = array.length - 1
		int[] nuevoArray = new int[array.length - 1];

		// Copiar todos los valores menos indice
		int indiceAux = 0;
		for (int i = 0; i < array.length; i++) {
			if (i != indice) {
				nuevoArray[indiceAux] = array[i];
				indiceAux++;
			}
		}

		// Sobreescribir el array con nuevoArray
		this.array = nuevoArray;
	}

	/**
	 * Obtiene el valor especificado por índice
	 * 
	 * @param indice
	 * @return
	 */
	public int get(int indice) {
		return array[indice];
	}

	/**
	 * Establece el valor pasado por parámetro en la posición especificada por
	 * indice
	 * 
	 * @param indice
	 * @param valor
	 */
	public void set(int indice, int valor) {
		this.array[indice] = valor;
	}

	/**
	 * Devuelve la cantidad de posiciones actual de la estructura.
	 * 
	 * @return
	 */
	public int size() {
		return this.array.length;
	}

	/**
	 * Concatena en un único String todos los valores de la estructura
	 * 
	 * @return
	 */
	@Override
	public String toString() {
		String resultado = "";

		for (int actual : array) {
			resultado += actual + ",";
		}

		if (resultado.length() > 0) {
			resultado = resultado.substring(0, resultado.length() - 1) + ".";
		}

		return resultado;
	}

	/**
	 * Determina el valor m�ximo almacenado en el array.
	 */
	public int maximo() {

		// Ordenar el array para busqueda eficiente
		Arrays.sort(this.array);
		int valorMaximo = this.array[this.array.length - 1];
		return valorMaximo;

	}

	/**
	 * Determina el valor m�nimo almacenado en el array.
	 */
	public int minimo() {
		// Ordenar el array para busqueda eficiente
		Arrays.sort(this.array);
		int valorMinimo = this.array[0];
		return valorMinimo;

	}

	/**
	 * Devuelve el promedio calculado a partir de los valores almacenados en el
	 * array.
	 */
	public double promedio() {
		double sumaArray = 0;
		double promedio = 0;
		for (int i = 0; i < array.length; i++) {
			sumaArray = sumaArray + this.array[i];
		}

		promedio = (sumaArray / this.array.length);
		return promedio;

	}

	/**
	 * Quita del array las m�ltiples ocurrencias de elementos de forma que todos
	 * ellos aparecen una �nica vez
	 */
	public void quitarRepetidos() {
		// Ordenar el array para busqueda eficiente
		Arrays.sort(this.array);

		int tamanioArray = this.array.length;
		int j = 0;
		// Compara el primer elemento con el siguiente, si es diferente lo guarda
		for (int i = 0; i < (tamanioArray - 1); i++) {
			if (this.array[i] != this.array[i + 1]) {
				this.array[j++] = this.array[i];
			}
		}
		this.array[j++] = this.array[(tamanioArray - 1)];
		int[] nuevoArray = new int[j];
		for (int k = 0; k < j; k++) {
			nuevoArray[k] = this.array[k];
		}

		// Sobreescribir el array con nuevoArray
		this.array = nuevoArray;
	}
}
