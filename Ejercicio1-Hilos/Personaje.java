public class Personaje implements Runnable{
    private String name;
    
    public Personaje(String name){
        this.name = name;
    }
    
    @Override
    public void run(){
        System.out.println(name + " Inició la subida de nivel");
        for (int nivel=1; nivel <=10; nivel++){
            System.out.println(name + " tiene un nivel: "+nivel);
            try{
                Thread.sleep((int)(Math.random()*5000)+1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
            
        }
        System.out.println(name + " Terminó la subida de nivel");
    }
}
