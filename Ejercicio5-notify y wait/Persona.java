public class Persona implements Runnable{
    // instance variables - replace the example below with your own
    private Contador recurso;
    private String accion;
    /**
     * Constructor for objects of class Persona
     */
    public Persona(Contador recurso, String accion)
    {
        this.recurso = recurso;
        this.accion = accion;
    }

    @Override
    public void run(){
        if(accion.equals("esperar")){
            recurso.esperar();
        }else{
            try{
                System.out.println("Estoy usando el recurso");
                Thread.sleep(5000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
            recurso.preparar();
        }
    }
}
