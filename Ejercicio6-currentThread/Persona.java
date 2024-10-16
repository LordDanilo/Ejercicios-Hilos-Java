public class Persona implements Runnable{
    private Recurso recurso;
    public Persona(Recurso recurso){
        this.recurso = recurso;
    }
    @Override
    public void run(){
        recurso.usarRecurso();
    }
}
