public interface Order extends Element{
    default void execute () { throw new UnsupportedOperationException(); }

    int orderApaMinerala(ApaMinerala apaMinerala);
    int orderCartofiWedges(CartofiWedges cartofiWedges);
    int orderFripturaPord(FripturaPorc fripturaPorc);
    int orderSalataRosii(SalataRosii salataRosii);
    int orderSnitelVienez(SnitelVienez snitelVienez);
    int orderSupaPui(SupaPui supaPui);

}
