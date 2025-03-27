package model;

public class StrategyBelgium implements FacturationStrategy {
    public double calculerFacture(double montant) {
        return montant * 1.21;
    }
}
