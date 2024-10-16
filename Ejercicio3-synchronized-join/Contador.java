public class Contador{
    // instance variables - replace the example below with your own
    private int valorActual;
    private boolean detenido;
    /**
     * Constructor for objects of class Contador
     */
    public Contador()
    {
        // initialise instance variables
        valorActual = 0;
        detenido = false;
    }

    public synchronized void incrementar(){
        if(!detenido){
            valorActual++; 
        }else{
            System.out.println("El contador fue detenido");
        }
                   
        System.out.println("Valor actual: "+valorActual);
    }
    
    public int getValorActual(){
        return valorActual;
    }
    
    public void detener(){
        detenido = true;
    }
}
