public class Palillo{
    private int id;
    private boolean enUso;
    public Palillo(int id){
        this.id = id;
        enUso = false;
    }
    public int getId(){
        return id;
    }
    public boolean estaEnUso(){
        return enUso;
    }
    public void usar(){
        enUso = true;
    }
    public void soltar(){
        enUso = false;
    }
}
