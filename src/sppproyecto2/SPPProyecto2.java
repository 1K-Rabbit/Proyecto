//Nombre: Roberto Alain Rivera Bravo
//Matrícula: A01411516
//Carrera: IMT11

package sppproyecto2;
import java.util.Scanner;

public class SPPProyecto2 {

    public static void main(String[] args) {
        menú();   
    }
    
    //Método menú
    public static void menú(){
        Scanner teclado = new Scanner (System.in);
        String option;
        
        System.out.println("\n//Calculadora de conversiones// \n");
        System.out.println("\nSeleccione una opción para realizar conversiones \n  ");
        System.out.println("1. Líquidos");
        System.out.println("2. Distancias");
        System.out.println("3. Temperaturas");
        System.out.println("4. Pesos");
        System.out.println("5. Salir");
        option = teclado.nextLine(); 
        
        switch(option){
            case "1":
                System.out.println("\nConversión de líquidos:");
                //manda método líquidos
                líquidos();
                //manda método salir
                salir();
                break;
            case "2":
                System.out.println("\nConversión de distancias:");
                //manda método distancias
                distancias();
                //manda método salir
                salir();
                break;
            case "3":
                System.out.println("\nConversión de temperaturas:");
                //manda método temperaturas
                temperaturas();
                //manda método salir
                salir();
                break;
            case "4":
                System.out.println("\nConversión de pesos:");
                pesos();
                salir();
                break;
            case "5":
                salir();
                break;
            default:
                System.out.println("\nUsted ha puesto una opción incorrecta, favor de verificar opción deseada");
                menú();   
        }
  
    }
    
    //método salir: da opción de terminar o mandar a menú
    public static void salir(){
        Scanner teclado = new Scanner (System.in);
        String letra;
        
        System.out.println("\n¿Desea continuar?");
        System.out.println("No: Presione E");
        System.out.println("Sí: Presione cualquier otra tecla\n");
        letra = teclado.nextLine();
        if(letra.equals("E")){
            System.exit(0);
        }
        
        menú();   
    }

    
    public static void líquidos (){
        Scanner teclado = new Scanner (System.in);
        double litro, galon;
        String o;
        
        System.out.println("1. Litros a Galones");
        System.out.println("2. Galones a litros");
        o = teclado.nextLine();
        
        if(o.equals("1")){
            System.out.println("\nIntroduzca un valor de litros");
            litro = teclado.nextDouble();
            galon = (litro * 0.26417);
            System.out.println("\n"+litro+" litros equivalen a "+galon+" galones");
        }
        else 
            if(o.equals("2")){
            System.out.println("\nIntroduzca un valor de galones");
            galon = teclado.nextDouble();
            litro = (galon/ 0.26417);
            System.out.println("\n"+galon+" galones equivalen a "+litro+" litros");
        }
            else{
            System.out.println("\nOpción no válida");
            }

    }

    
    public static void distancias(){
        Scanner teclado = new Scanner (System.in);
        String option;
        
        System.out.println("1. Centímetro (cm) a pulgada (in) ");
        System.out.println("2. Metros (m) a pies (ft) ");
        System.out.println("3. Kilómetros (km) a millas (mi)");
        option = teclado.nextLine();
        
        switch(option){
            case "1":
                centimetroPulgada();
                break;
            case "2":
                metroPie();
                break;
            case "3":
                kilometroMilla();
                break;
            default:
                System.out.println("\nOpción no válida");       
        }
    }
    
    public static void centimetroPulgada(){
        Scanner teclado = new Scanner (System.in);
        double centimetro, pulgada;
        String o;
        
        System.out.println("\n1. Centímetro a Pulgada");
        System.out.println("2. Pulgada a Centímetro");
        o = teclado.nextLine();
        
        if(o.equals("1")){
            System.out.println("\nIntroduzca un valor de centímetros (cm)");
            centimetro = teclado.nextDouble();
            pulgada = (centimetro/2.54);
            System.out.println("\n"+centimetro+" cm equivalen a "+pulgada+" in");
        }
        else if(o.equals("2")){
            System.out.println("\nIntroduzca un valor de pulgadas (in)");
            pulgada = teclado.nextDouble();
            centimetro = (pulgada*2.54);
            System.out.println("\n"+pulgada+" pulgadas equivalen a "+centimetro+" centímetro");
        }else{
            System.out.println("\nOpción no válida");
        }
    }
    
    public static void metroPie(){
        Scanner teclado = new Scanner (System.in);
        double metro, pie;
        String o;
        
        System.out.println("\n1. Metro a Pie");
        System.out.println("2. Pie a Metro");
        o = teclado.nextLine();
        
        if(o.equals("1")){
            System.out.println("\nIntroduzca un valor de metros (m)");
            metro = teclado.nextDouble();
            pie = (metro/.3048);
            System.out.println("\n"+metro+" m equivalen a "+pie+" ft");
        }
        else if(o.equals("2")){
            System.out.println("\nIntroduzca un valor de pies (ft)");
            pie = teclado.nextDouble();
            metro = (pie*.3048);
            System.out.println("\n"+pie+" ft equivalen a "+metro+" m");
        }else{
            System.out.println("\nOpción no válida");    
        }
        
    }
 
    public static void kilometroMilla(){
        Scanner teclado = new Scanner (System.in);
        double kilometro, milla;
        String o;
        
        System.out.println("\n1. Kilómetro a Milla");
        System.out.println("2. Milla a Kilómetro");
        o = teclado.nextLine();
        
        if(o.equals("1")){
            System.out.println("\nIntroduzca un valor de kilómetros (Km)");
            kilometro = teclado.nextDouble();
            milla = (kilometro/1.609344);
            System.out.println("\n"+kilometro+" km equivalen a "+milla+" mi");
        }
        else if(o.equals("2")){
            System.out.println("\nIntroduzca un valor de pies (ft)");
            milla = teclado.nextDouble();
            kilometro = (milla*1.609344);
            System.out.println("\n"+milla+" mi equivalen a "+kilometro+" km");
        }else{
            System.out.println("\nOpción no válida");
        }
           
    }

    
    public static void temperaturas(){
        Scanner teclado = new Scanner (System.in);
        double cent, fahr;
        String o;
        
        System.out.println("1. Centígrados a Fahrenheit");
        System.out.println("2. Fahrenheit a Centígrados");
        o = teclado.nextLine();
        
        if(o.equals("1")){
            System.out.println("\nIntroduzca un valor en grados centígrados (°C)");
            cent = teclado.nextDouble();
            fahr = ((cent*9/5)+32);
            System.out.println("\n"+cent+" °C equivalen a "+fahr+" °F");
        }
        else if(o.equals("2")){
            System.out.println("\nIntroduzca un valor en grados fahrenheit (°F)");
            fahr = teclado.nextDouble();
            cent = ((fahr-32)*5/9);
            System.out.println("\n"+fahr+" °F equivalen a "+cent+" °C");   
        }else{
            System.out.println("\nOpción no válida");
        }
        
    }

    
    public static void pesos(){
        Scanner teclado = new Scanner (System.in);
        double o, gramos, libras;
        
        System.out.println("1. Gramos a Libras");
        System.out.println("2. Libras a Gramos");
        o = teclado.nextDouble();
        
        if(o==1){
            System.out.println("\nIntroduzca un valor en gramos");
            gramos = teclado.nextDouble();
            libras = (gramos/453.59237);
            System.out.println("\n"+gramos+" gramos equivalen a "+libras+" libras");       
        }
        else if(o==2){
            System.out.println("\nIntroduzca un valor en libras");
            libras = teclado.nextDouble();
            gramos = (libras*453.59237);
            System.out.println("\n"+libras+" libras equivalen a "+gramos+" gramos");
        }else{
            System.out.println("\nOpción no válida");
        }
        
    }

           
}


