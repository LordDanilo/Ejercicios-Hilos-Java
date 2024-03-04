public class Main{
    public static void main(String args[]){
        Personaje per1 = new Personaje("Unicornio");
        Personaje per2 = new Personaje("Dragon");
        Personaje per3 = new Personaje("Sirena");
        
        Thread hilo1 = new Thread(per1);
        Thread hilo2 = new Thread(per2);
        Thread hilo3 = new Thread(per3);
        
        hilo1.start();
        hilo2.start();
        hilo3.start();
    }
}
