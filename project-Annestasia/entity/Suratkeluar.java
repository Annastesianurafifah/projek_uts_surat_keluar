package entity;

public class Suratkeluar {

    private String penerima;
    private String alamatpenerima;
    private String diterima;


    public Suratkeluar(String penerima, String alamatpenerima, String diterima) {
        this.penerima = penerima;
        this.alamatpenerima = alamatpenerima;
        this.diterima = diterima;
    }

    public boolean equals(Object object) {
        Suratkeluar sk = (Suratkeluar) object;
        return penerima.equals(sk.getPenerima());
    }

    public String getPenerima() {
        return penerima;
    }

    public void setPenerima(String penerima) {
        this.penerima = penerima;
    }

    public String getAlamatpenerima() {
        return alamatpenerima;
    }

    public void setAlamatpenerima(String alamatpenerima) {
        this.alamatpenerima = alamatpenerima;
    }

    public String getDiterima() {
        return diterima;
    }

    public void setDiterima(String diterima) {
        this.diterima = diterima;
    }
}