public class App{
    public static void main(String args[]){
        Recurso recursoComun = new Recurso();
        Persona persona1 = new Persona(recursoComun);
        Persona persona2 = new Persona(recursoComun);
        Persona persona3 = new Persona(recursoComun);
        
        Thread hilo1 = new Thread(persona1,"Unciornio");
        Thread hilo2 = new Thread(persona2,"Dragon");
        Thread hilo3 = new Thread(persona3,"Capibara");
        
        hilo1.start();
        hilo2.start();
        hilo3.start();
    }
}
