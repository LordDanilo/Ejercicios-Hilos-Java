
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String args[]){
        Contador recurso = new Contador();
        
        Persona persona1 = new Persona(recurso, 300000);
        Persona persona2 = new Persona(recurso, 500000);
        
        Thread hilo1 = new Thread(persona1);
        Thread hilo2 = new Thread(persona2);
        
        hilo1.start();
        hilo2.start();
        
        
        try{       
            Thread.sleep(1000);
            recurso.detener();
            
            hilo1.join();
            hilo2.join();        
        }catch(InterruptedException e){
            System.out.println("Interrupted "+e);
        }
        System.out.println("Final del metodo main");
    }
}
