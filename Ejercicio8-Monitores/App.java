
public class App
{
    public static void main (String args[]){
        Recurso recurso = new Recurso();
        
        Persona persona1 = new Persona(recurso);
        Persona persona2 = new Persona(recurso);
        Persona persona3 = new Persona(recurso);
        Persona persona4 = new Persona(recurso);
        Persona persona5 = new Persona(recurso);
        
        Thread hilo1 = new Thread(persona1,"Unicornio");
        Thread hilo2 = new Thread(persona1,"Dragon");
        Thread hilo3 = new Thread(persona1,"Capibara");
        Thread hilo4 = new Thread(persona1,"Jirafa");
        Thread hilo5 = new Thread(persona1,"Narval");
        
        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        hilo5.start();
    }
}