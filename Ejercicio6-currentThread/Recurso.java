public class Recurso{
    public synchronized void usarRecurso(){
        Thread hiloActual = Thread.currentThread();
        System.out.println("El hilo actual es: "+hiloActual.getName());
        try{
            Thread.sleep(3000);
        }catch(InterruptedException e){
            System.out.println("Error "+e);
        }
    }
}
