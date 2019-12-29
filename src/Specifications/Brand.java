package Specifications;

public class Brand {
    private int yearOfFoundation;
    private String brandName;
    private int workersNumber;
    private int countriesNumber;

    public int getYearOfFoundation() {
        return yearOfFoundation;
    }

    public void setYearOfFoundation(int yearOfFoundation) {
        this.yearOfFoundation = yearOfFoundation;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getWorkersNumber() {
        return workersNumber;
    }

    public void setWorkersNumber(int workersNumber) {
        this.workersNumber = workersNumber;
    }

    public int getCountriesNumber() {
        return countriesNumber;
    }

    public void setCountriesNumber(int countriesNumber) {
        this.countriesNumber = countriesNumber;
    }

    public Brand(int yearOfFoundation, String brandName, int workersNumber, int countriesNumber) {
        this.yearOfFoundation = yearOfFoundation;
        this.brandName = brandName;
        this.workersNumber = workersNumber;
        this.countriesNumber = countriesNumber;
    }
}
