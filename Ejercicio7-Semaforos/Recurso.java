import java.util.concurrent.Semaphore;

public class Recurso{
    private final Semaphore semaforo = new Semaphore(2);
    
    public void usarRecurso(){
        try{
            semaforo.acquire();
            System.out.println("Estoy usando el recurso "+Thread.currentThread().getName());
            Thread.sleep(3000);
            System.out.println("Terminaste de usar el recurso");
        }catch(InterruptedException e){
            System.out.println("Error");
        } finally{
            semaforo.release();
        }
    }
}
