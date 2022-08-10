
public class AddConTryCatch2 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i < args.length; i++) {
			try {
			sum += Integer.parseInt(args[i]);
			}catch(NumberFormatException nfe) {
				System.err.println("Uno de los argumentos ingresados por linea de comandos " + "["+args[i]+"]"+" no es un Entero");
			}
		
		
		}
		System.out.println("Sum: " + sum);
	}

}
