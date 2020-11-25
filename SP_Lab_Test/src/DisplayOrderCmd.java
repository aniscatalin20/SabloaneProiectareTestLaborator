public class DisplayOrderCmd implements Order{
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

    public void printStatistics(){
        System.out.println("Comanda: ");
        System.out.println(supaPuiCounter + "x Supe pui x" +  supaPuiPret);
        System.out.println(supaPuiCounter + "x Friptura de porc la tava x" +  fripturaPorcPret);
        System.out.println(supaPuiCounter + "x Snitel vienez x" +  snitelVienezPret);
        System.out.println(supaPuiCounter + "x Cartofi Wedges x" +  cartofiWedgesPret);
        System.out.println(supaPuiCounter + "x Salata rosii x" +  salataRosiiPret);
        System.out.println(supaPuiCounter + "x Ape minerale x" +  apaMineralaPret);

    }
}
