package model;

public class Facturation {
    private FacturationStrategy strategy;

    public Facturation(FacturationStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculerFacture(double montant) {
        return strategy.calculerFacture(montant);
    }
}
