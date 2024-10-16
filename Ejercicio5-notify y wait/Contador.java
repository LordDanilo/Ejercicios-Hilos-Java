
public class Contador{
    private volatile boolean preparado;
    
    public Contador(){
        preparado = false;
    }
    public synchronized void esperar(){
        while(!preparado){
            try{
                System.out.println("Estoy Esperando");
                wait();           
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
        System.out.println("Listo, deje de esperar");
    }
    public synchronized void preparar(){
        preparado = true;
        notifyAll();
    }
}
