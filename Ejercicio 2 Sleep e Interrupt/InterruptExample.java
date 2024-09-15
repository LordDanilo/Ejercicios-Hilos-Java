public class InterruptExample {
    public static void main(String[] args) throws InterruptedException{
        Contador contador = new Contador();

        Thread hilo1 = new Thread(() -> {
                        for (int i = 0; i < 40; i++) {
                            System.out.println("Hilo 1");
                            contador.incrementar();
                        }
                });

        Thread hilo2 = new Thread(() -> {
                        for (int i = 0; i < 50; i++) {
                            System.out.println("Hilo 2");
                            contador.incrementar();
                        }
                });

        hilo1.start();
        hilo2.start();

        hilo1.join();
        hilo2.join();

        System.out.println("Cuenta final: " + contador.getCuenta());
    }
}