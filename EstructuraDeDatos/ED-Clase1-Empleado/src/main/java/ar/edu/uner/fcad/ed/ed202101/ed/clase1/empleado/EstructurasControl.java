package ar.edu.uner.fcad.ed.ed202101.ed.clase1.empleado;

/**
 *
 * @author Nacho
 */
public class EstructurasControl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //if-else
        System.out.println("if-else");
        int var1 = 240;
        int var2 = 120;

        if (var1 > var2) {
            System.out.println("var1: " + var1 + " > var2: " + var2);
        } else {
            System.out.println("var1: " + var1 + " < var2: " + var2);
        }

        //switch
        System.out.println("switch");
        int var3 = 1;
        switch (var1) {
            case 1:
                System.out.println("var3: " + var3 + " => case 1");
                break;
            case 2:
                System.out.println("var3: " + var3 + " => case 2");
                break;
            default:
                System.out.println("Se imprime siempre");
                break;
        }

        //Operador ternario
        int var4 = 1;
        System.out.println("var4: " + ((var4 == 1) ? "TRUE" : "FALSE"));

        //While
        System.out.println("while");
        int x = 0;
        while (x <= 10) {
            System.out.println("x: " + x);
            x++;
        }

        //For
        System.out.println("for");
        for (int i = 0; i < 10; i++) {
            System.out.println("i:" + i);
        }

        //break
        System.out.println("break");
        for (int i = 0; i < 10; i++) {
            if (i >= 5) {
                break;
            }
            System.out.println("i:" + i);
        }

        //continue
        System.out.println("continue");
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("i:" + i);
        }

    }
}
