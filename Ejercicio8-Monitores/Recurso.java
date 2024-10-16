public class Recurso{
    public synchronized void usarRecurso(){
        try{
            System.out.println("Estoy usando el recurso "+Thread.currentThread().getName());
            Thread.sleep(3000);
            System.out.println("Terminaste de usar el recurso");
        }catch(InterruptedException e){
            System.out.println("Error");
        }
    }
}
