class Contador {
    private int cuenta = 0;

    public synchronized void incrementar() {
        cuenta++;
        System.out.println("Cuenta actual: "+cuenta);
    }

    public int getCuenta() {
        return cuenta;
    }
}