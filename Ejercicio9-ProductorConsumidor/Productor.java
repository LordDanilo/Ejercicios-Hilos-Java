public class Productor implements Runnable{
    private Buffer buffer;
    public Productor(Buffer buffer){
        this.buffer = buffer;
    }
    
    @Override
    public void run(){
        try{
            for(int i=0; i<=21; i++){
                Recurso nuevo = new Recurso(i);
                buffer.producir(nuevo);
                Thread.sleep(4000);
            }
        }catch(InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }
}
