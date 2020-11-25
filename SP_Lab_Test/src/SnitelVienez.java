public class SnitelVienez implements Mancare{
    double pret;

    public SnitelVienez() {
        this.pret = 13;
    }

    @Override
    public double getPret() {
        return this.pret;
    }
}
