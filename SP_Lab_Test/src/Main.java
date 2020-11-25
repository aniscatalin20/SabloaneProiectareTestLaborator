import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Element> order = new ArrayList<Element>();
        SupaPui supaPui = new SupaPui();
        SupaPui supaPui2 = new SupaPui();
        FripturaPorc fripturaPorc = new FripturaPorc();
        SnitelVienez snitelVienez = new SnitelVienez();
        CartofiWedges cartofiWedges = new CartofiWedges();
        CartofiWedges cartofiWedges2 = new CartofiWedges();
        SalataRosii salataRosii = new SalataRosii();
        SalataRosii salataRosii2 = new SalataRosii();
        ApaMinerala apaMinerala = new ApaMinerala();
        ApaMinerala apaMinerala2 = new ApaMinerala();

        order.add(supaPui);
        order.add(supaPui2);
        order.add(fripturaPorc);
        order.add(snitelVienez);
        order.add(cartofiWedges);
        order.add(cartofiWedges2);
        order.add(salataRosii);
        order.add(salataRosii2);
        order.add(apaMinerala);
        order.add(apaMinerala2);


        new DisplayOrderCmd().execute();
    }
}
