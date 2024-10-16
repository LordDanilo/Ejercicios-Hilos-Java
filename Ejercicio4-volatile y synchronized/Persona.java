public class Persona implements Runnable{
    private Contador contador;
    private int limite;
    /**
     * Constructor for objects of class Persona
     */
    public Persona(Contador contador, int limite)
    {
        this.contador = contador;
        this.limite = limite;
    }
    
    @Override
    public void run(){
        contar();
    }
    
    public void contar()
    {
        for(int i=0; i<limite; i++){
            contador.incrementar();
        }
    }
}
