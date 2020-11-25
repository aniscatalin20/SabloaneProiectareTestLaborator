public class FripturaPorc implements Mancare{
    double pret;

    public FripturaPorc() {
        this.pret = 15;
    }

    @Override
    public double getPret() {
        return this.pret;
    }
}
