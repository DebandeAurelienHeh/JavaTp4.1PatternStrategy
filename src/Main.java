import model.*;

public class Main {
    public static void main(String[] args) {

        Facturation facturation = new Facturation(new StrategyEngland());
        System.out.println("England: ");
        System.out.println(facturation.calculerFacture(100));

        facturation = new Facturation(new StrategyGermany());
        System.out.println("Germany: ");
        System.out.println(facturation.calculerFacture(100));

        facturation = new Facturation(new StrategyBelgium());
        System.out.println("Belgium: ");
        System.out.println(facturation.calculerFacture(100));
    }
}
