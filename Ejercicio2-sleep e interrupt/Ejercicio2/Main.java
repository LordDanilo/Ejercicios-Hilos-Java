public class Main{
    public static void main (String args[]){
        Contador contador1 = new Contador();
        Thread hilo1 = new Thread(contador1);
        hilo1.start();
        try{
            Thread.sleep(5000);        
        }catch(InterruptedException e){
            System.out.println("Error");
        }
        
        for(int intento = 1; intento<=3; intento++){
            if(contador1.isWorking()){
                System.out.println("Esperando...");
                try{
                    Thread.sleep(2000);
                }catch(InterruptedException e){
                    System.out.println("Error");
                }
                if(intento==3){
                    hilo1.interrupt();    
                }
            }else{
                System.out.println("Hilo libre...");
            }
        }
    }
}
