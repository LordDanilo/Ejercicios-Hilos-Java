public class Main
{
    public static void vaid (String args[]){
        Contador recurso = new Contador();
        Persona persona1 = new Persona(recurso,"esperar");
        Persona persona2 = new Persona(recurso,"esperar");
        Persona persona3 = new Persona(recurso,"esperar");
        Persona persona4 = new Persona(recurso,"esperar");
        Persona persona5 = new Persona(recurso,"esperar");
        Persona persona6 = new Persona(recurso,"esperar");
        Persona persona7 = new Persona(recurso,"activar");
        
        Thread hilo1 = new Thread(persona1);
        Thread hilo2 = new Thread(persona2);
        Thread hilo3 = new Thread(persona3);
        Thread hilo4 = new Thread(persona4);
        Thread hilo5 = new Thread(persona5);
        Thread hilo6 = new Thread(persona6);
        Thread hilo7 = new Thread(persona7);
        
        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        hilo5.start();
        hilo6.start();
        hilo7.start();
    }
}