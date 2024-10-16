public class Mesa{
    private Palillo[] palillos;
    
    public Mesa(int numPalillos){
        palillos = new Palillo[numPalillos];
    }
    public void crearPalillos(){
        for (int i=0; i<palillos.length; i++){
            palillos[i] = new Palillo(i);
        }
    }
    
    public synchronized void tomarPalillos(int idFilosofo) throws InterruptedException{
        Palillo palilloDer = palillos[idFilosofo];
        Palillo palilloIzq = palillos[(idFilosofo+1)%palillos.length];
        while(palilloDer.estaEnUso() || palilloIzq.estaEnUso()){
            System.out.println("Filosofo "+idFilosofo+" Esta esperando palillos");
            wait();
        }
        System.out.println("Filosofo "+idFilosofo+" Tomando palillos "+palilloDer.getId()+" y "+palilloIzq.getId());
        palilloDer.usar();
        palilloIzq.usar();
    }
    
    public synchronized void soltarPalillos(int idFilosofo) throws InterruptedException{
        Palillo palilloDer = palillos[idFilosofo];
        Palillo palilloIzq = palillos[(idFilosofo+1)%palillos.length];
        System.out.println("Filosofo "+idFilosofo+" Soltando palillos "+palilloDer.getId()+" y "+palilloIzq.getId());
        palilloDer.soltar();
        palilloIzq.soltar();
        notify();
    }
}
