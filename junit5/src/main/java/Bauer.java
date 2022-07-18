public class Bauer {
    private String spalte;
    private int zeile;

    public Bauer(String spalte, int zeile) {

        this.spalte = spalte;
        this.zeile = zeile;
    }

    public Bauer bewegtSich() {
        return new Bauer(spalte, zeile + 1);
    }

    public String getSpalte() {
        return spalte;
    }

    public int getZeile() {
        return zeile;
    }
}
