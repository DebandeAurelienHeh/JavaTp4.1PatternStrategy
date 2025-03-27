package model;

public class StrategyGermany implements FacturationStrategy {
    public double calculerFacture(double montant) {
        return montant * 1.19;
    }
}
