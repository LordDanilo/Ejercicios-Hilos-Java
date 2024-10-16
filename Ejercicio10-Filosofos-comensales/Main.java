public class Main
{
    public static void main(String args[]){
        int numFilosofos = 5;
        Mesa mesa = new Mesa(numFilosofos);
        mesa.crearPalillos();
        for (int i = 0; i < numFilosofos; i++) {
            new Thread(new Filosofo(i, mesa)).start();
        }
    }
}
