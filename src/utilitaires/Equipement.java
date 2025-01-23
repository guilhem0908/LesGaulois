package Equipement;

public enum Equipement {
    PLASTRON("Plastron"), CASQUE("Casque"), BOUCLIER("Bouclier");

    private String chaine;

    Equipement(String chaine) {
        this.chaine = chaine;
    }

    @Override
    public String toString() {
        return chaine;
    }
}