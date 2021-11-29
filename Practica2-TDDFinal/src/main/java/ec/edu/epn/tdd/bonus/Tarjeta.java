package ec.edu.epn.tdd.bonus;

public class Tarjeta {
    private int numTarjeta;
    private int cvv;

    public Tarjeta(int numTarjeta, int cvv) {
        this.numTarjeta = numTarjeta;
        this.cvv = cvv;
    }

    public int getNumTarjeta() {
        return numTarjeta;
    }

    public void setNumTarjeta(int numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }
}
