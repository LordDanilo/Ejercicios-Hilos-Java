
public class Persona implements Runnable
{
    private Recurso recursoActual;

    public Persona(Recurso recurso)
    {
        this.recursoActual = recurso;
    }
    
    @Override
    public void run(){
        recursoActual.usarRecurso();
    }
}
