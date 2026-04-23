package structural_patterns.adapter;

public class App {
    public static void main(String[] args) {
        Advertisement adv1 = new Advertisement();
        adv1.title = "Vendo marcador preto";
        adv1.description = "Estado de são paulo";
        adv1.price = 20.0;
        System.out.println(adv1);
        adv1.publish();
        adv1.inactivate();
        adv1.activate();
        adv1.delete();

        Ad ad = new Ad();
        ad.description = "Bicicleta seminova";
        ad.price = 2000.0;
        ad.status = "reviewed";

        Advertisement adv2 = new Advertisement();
        adv2.title = "Vendo marcador rosa (la ele)";
        adv2.description = "Estado de minas gerais";
        adv2.price = 30.0;
    }
}
