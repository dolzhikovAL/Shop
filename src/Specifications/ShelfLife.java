package Specifications;

public class ShelfLife {
    private String wasMade;
    private int temperature;
    private int termsOfUse;

    public ShelfLife(String wasMade, int temperature, int termsOfUse) {
        this.wasMade = wasMade;
        this.temperature = temperature;
        this.termsOfUse = termsOfUse;
    }

    public String getWasMade() {
        return wasMade;
    }

    public void setWasMade(String wasMade) {
        this.wasMade = wasMade;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getTermsOfUse() {
        return termsOfUse;
    }

    public void setTermsOfUse(int termsOfUse) {
        this.termsOfUse = termsOfUse;
    }
}
