package model;

public class StrategyEngland implements FacturationStrategy {
    public double calculerFacture(double montant) {
        return montant * 1.2;
    }
}
