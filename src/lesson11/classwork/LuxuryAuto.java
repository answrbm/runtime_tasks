package lesson11.classwork;

public class LuxuryAuto {

    private String model;
    private int manufactureYear;
    private int dollarPrice;

    public LuxuryAuto(String model, int manufactureYear, int dollarPrice) {
        this.model = model;
        this.manufactureYear = manufactureYear;
        this.dollarPrice = dollarPrice;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;

        LuxuryAuto auto = (LuxuryAuto) o;
        if(dollarPrice != auto.dollarPrice) return false;
        if(manufactureYear != auto.manufactureYear) return false;
        return model != null ? model.equals(auto.model) : auto.model == null;
    }

    @Override
    public int hashCode() {
        int result = model != null ? model.hashCode() : 0;
        result = 31 * result + manufactureYear;
        result = 31 * result + dollarPrice;
        return result;
    }
}
