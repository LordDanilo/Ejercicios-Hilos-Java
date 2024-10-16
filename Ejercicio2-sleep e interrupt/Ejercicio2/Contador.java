public class Contador implements Runnable{
    private boolean trabajando;
    
    /**
     * Constructor for objects of class Contador
     */
    public Contador()
    {
        this.trabajando = false;
    }
    @Override
    public void run(){
        iniciarContador();
    }
    public void iniciarContador(){
        System.out.println("Iniciando el conteo");
        try{
            this.trabajando = true;
            for(int i=0; i<50000; i++){     
                System.out.println("Contando "+i);
                Thread.sleep(1000);
            }
            this.trabajando = false;
        }catch(InterruptedException e){
            System.out.println("Hilo Interrumpido "+e);
        }
        
    }
    public boolean isWorking(){
        return trabajando;
    }
}
