public class DisplayOrderCmd implements Order{
    public DisplayOrderCmd() {
    }

    int apaMineralaCounter = 0, cartofiWedgesCounter = 0, fripturaPorcCounter = 0, salataRosiiCounter = 0 , snitelVienezCounter = 0,
            supaPuiCounter = 0;

    double supaPuiPret = 7.5, fripturaPorcPret = 15, snitelVienezPret = 13, cartofiWedgesPret = 6, salataRosiiPret = 5, apaMineralaPret = 3;

    @Override
    public int orderApaMinerala(ApaMinerala apaMinerala) {
        return apaMineralaCounter++;
    }

    @Override
    public int orderCartofiWedges(CartofiWedges cartofiWedges) {
        return cartofiWedgesCounter++;
    }

    @Override
    public int orderFripturaPord(FripturaPorc fripturaPorc) {
        return fripturaPorcCounter++;
    }

    @Override
    public int orderSalataRosii(SalataRosii salataRosii) {
        return salataRosiiCounter++;
    }

    @Override
    public int orderSnitelVienez(SnitelVienez snitelVienez) {
        return snitelVienezCounter++;
    }

    @Override
    public int orderSupaPui(SupaPui supaPui) {
        return supaPuiCounter++;
    }

    public void execute(){
        System.out.println("Comanda: ");
        System.out.println(supaPuiCounter + "x Supe pui x" +  supaPuiPret);
        System.out.println(fripturaPorcCounter + "x Friptura de porc la tava x" +  (int)fripturaPorcPret);
        System.out.println(snitelVienezCounter + "x Snitel vienez x" +  (int)snitelVienezPret);
        System.out.println(cartofiWedgesCounter + "x Cartofi Wedges x" +  (int)cartofiWedgesPret);
        System.out.println(salataRosiiCounter + "x Salata rosii x" +  (int)salataRosiiPret);
        System.out.println(apaMineralaCounter + "x Ape minerale x" +  (int)apaMineralaPret);
        double total = supaPuiCounter*supaPuiPret + fripturaPorcCounter*fripturaPorcPret +
                snitelVienezPret*snitelVienezCounter + cartofiWedgesPret*cartofiWedgesCounter +
                salataRosiiPret*salataRosiiCounter + apaMineralaPret*apaMineralaCounter;
        System.out.println("TOTAL: " + total + " RON");

    }
}
