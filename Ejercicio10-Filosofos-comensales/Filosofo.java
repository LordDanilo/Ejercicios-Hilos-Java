public class Filosofo implements Runnable{
    private int id;
    private Mesa mesa;
    public Filosofo(int id, Mesa mesa){
        this.id = id;
        this.mesa = mesa;
    }
    
    @Override
    public void run(){
        try{
            while(true){
                pensar();
                mesa.tomarPalillos(id);
                comer();
                mesa.soltarPalillos(id);
            }
        }catch(InterruptedException e){
            Thread.currentThread().interrupted();
        }
    }
    private void pensar() throws InterruptedException {
        System.out.println("Filosofo "+id+ " estoy pensando");
        Thread.sleep((long)(Math.random()*10000));
    }
    private void comer() throws InterruptedException {
        System.out.println("Filosofo "+id+ " estoy comiendo");
        Thread.sleep((long)(Math.random()*10000));
    }
}
