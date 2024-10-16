import java.util.Queue;
import java.util.LinkedList;
public class Buffer{
    private Queue<Recurso> buffer;
    private int capacidad;
    
    public Buffer(){
        buffer = new LinkedList<>();
        capacidad = 4;
    }
    
    public synchronized void producir(Recurso rec) throws InterruptedException {
        while(buffer.size()==capacidad){
            System.out.println("Buffer esta lleno, Productor entra en espera");
            wait();
        }
        buffer.add(rec);
        System.out.println("Recurso producido "+rec.getId());
        notifyAll();
    }
    public synchronized Recurso consumir() throws InterruptedException{
        while(buffer.isEmpty()){
            System.out.println("Buffer esta vacio, Consumidor entra en espera");
            wait();
        }
        Recurso res = buffer.poll();
        System.out.println("Recurso consumido "+res.getId()+" consumido por "+Thread.currentThread().getName());
        notifyAll();
        return res;
    }
    
}
