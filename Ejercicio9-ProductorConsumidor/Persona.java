
public class Persona implements Runnable
{
    private Buffer buffer;

    public Persona(Buffer buffer)
    {
        this.buffer = buffer;
    }
    
    @Override
    public void run(){
        try{
            buffer.consumir();
            Thread.sleep(6000);
        }
        catch (InterruptedException ie)
        {
            Thread.currentThread().interrupt();
        }
    }
}
