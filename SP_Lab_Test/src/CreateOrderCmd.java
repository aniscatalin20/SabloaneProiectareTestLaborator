public class CreateOrderCmd implements Order{
    public CreateOrderCmd() {
    }


    @Override
    public void execute() {

    }

    @Override
    public int orderApaMinerala(ApaMinerala apaMinerala) {
        return 2;
    }

    @Override
    public int orderCartofiWedges(CartofiWedges cartofiWedges) {
        return 1;
    }

    @Override
    public int orderFripturaPord(FripturaPorc fripturaPorc) {
        return 1;
    }

    @Override
    public int orderSalataRosii(SalataRosii salataRosii) {
        return 2;
    }

    @Override
    public int orderSnitelVienez(SnitelVienez snitelVienez) {
        return 2;
    }

    @Override
    public int orderSupaPui(SupaPui supaPui) {
        return 2;
    }

}
