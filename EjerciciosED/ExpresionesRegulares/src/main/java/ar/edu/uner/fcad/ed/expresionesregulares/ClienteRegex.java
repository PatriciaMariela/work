/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.uner.fcad.ed.expresionesregulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author nacho
 */
public class ClienteRegex {
    private static final String STR1 = "Batman vigila ciudad g�tica";
    private static final String STR2 = "Man-Bat acecha ciudad g�tica";
    
    private static void prueba0(){
        String input = "ab456465";
        String input2 = "ab";
        String input3 = "ab123456";
        String input4 = "abashdashdlkasjk";
        String input5 = "xxxxasdasdabashdashdlkasjk";
        String regex = "ab.*";

        System.out.println("prueba0()");
        
        if(input.matches(regex)){   
            System.out.println("Matches: " + input );
        }
        if(input2.matches(regex)){   
            System.out.println("Matches: " + input2 );
        }
        if(input3.matches(regex)){   
            System.out.println("Matches: " + input3 );
        }
        if(input4.matches(regex)){   
            System.out.println("Matches: " + input4 );
        }
        if(input5.matches(regex)){   
            System.out.println("Matches: " + input5 );
        }
    }
    
    //Funciona únicamente para el String "Bat"
    private static void prueba1(){
        String regex = "Bat";
        
        System.out.println("prueba1()");
        
        if(STR1.matches(regex)){
            System.out.println("Matched: " + STR1);
        }
        
        if(STR2.matches(regex)){
            System.out.println("Matched: " + STR2);
        }
        
        if("Bat".matches(regex)){
            System.out.println("Matched: " + "Bat");
        }
    }
    
    //Cualquier cosa que comience con Bat
    private static void prueba2(){
        String regex = "Bat.";
        
        System.out.println("prueba2()");
        
        if("Batz".matches(regex)){
            System.out.println("Matched: " + "Batz");
        }
        
        if(STR1.matches(regex)){
            System.out.println("Matched: " + STR1);
        }
    }
    
    //Cualquier cosa que tenga Bat
    private static void prueba3(){
        String regex = ".*Bat.*";
        
        System.out.println("prueba3()");
        
        if(STR1.matches(regex)){
            System.out.println("Matched: " + STR1);
        }
        
        if(STR2.matches(regex)){
            System.out.println("Matched: " + STR2);
        }
    }
    
    //Case insensitive
    private static void prueba4(){
        String regex = "(?i).*bat.*";
        
        System.out.println("prueba4()");
        
        if(STR1.matches(regex)){
            System.out.println("Matched: " + STR1);
        }
        
        if(STR2.matches(regex)){
            System.out.println("Matched: " + STR2);
        }
    }
    
    //Case insensitive
    private static void prueba4Bis(){
        String regex = ".*bat.*";
        
        System.out.println("prueba4Bis()");
        
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher1 = pattern.matcher(STR1);
        if(matcher1.matches()){
            System.out.println("Matched: " + STR1);
        }
        
        Matcher matcher2 = pattern.matcher(STR2);
        if(matcher2.matches()){
            System.out.println("Matched: " + STR2);
        }
    }
    
    //Al inicio no tiene que tener man pero tiene que tener bat
    private static void prueba5(){
        String regex = "(?i)^[^man][bat].*";
        
        System.out.println("prueba5()");
        
        if(STR1.matches(regex)){
            System.out.println("Matched: " + STR1);
        }
        
        if(STR2.matches(regex)){
            System.out.println("Matched: " + STR2);
        }
    }
        
    //Valida y agrupa los valores de una fecha
    private static void pruebaFecha(){
        String input1 = "23/11/1984";
        String input2 = "7/9/2015";
        
        String regex = "(\\d{2})[-/](\\d\\d)[-/](\\d\\d\\d\\d)";
//        String regex = "(\\d)+[-/](\\d)+[-/](\\d{4})";
        
        System.out.println("pruebaFecha()");

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input1);
        
        if(matcher.matches()){
            System.out.println("Matches: " + input1);
            System.out.println("Día: " + matcher.group(1));
            System.out.println("Mes: " + matcher.group(2));
            System.out.println("Año: " + matcher.group(3));
        }
        
        matcher = pattern.matcher(input2);
        if(matcher.matches()){
            System.out.println("Matches: " + input2 );
            System.out.println("Día: " + matcher.group(1));
            System.out.println("Mes: " + matcher.group(2));
            System.out.println("Año: " + matcher.group(3));
        }
  
    }
            
    private static void pruebaReemplazo(){
        String regex = "(Batman)(.*)";
        
        System.out.println("pruebaReemplazo()");
        
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(STR1);
        
        if(matcher.matches()){
            System.out.println("Matched: " + STR1);
            String robin = matcher.replaceFirst("Robin$2");
            System.out.println(robin);
        }
    }
    
    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        prueba0();
        
        prueba1();
        
        prueba2();
        
        prueba3();
        
        prueba4();
        
        prueba4Bis();
        
        prueba5();
        
        pruebaFecha();
        
        pruebaReemplazo();
    }
}
