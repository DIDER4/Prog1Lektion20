package opgave03.model;

public class Car {
    private String no;
    private String year;
    private int pricePerDay;

    public Car (String no, String year, int pricePerDay){
        this.no = no;
        this.year = year;
        this.pricePerDay = pricePerDay;
    }

    public void setPricePerDay(int pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public int getPricePerDay() {
        return pricePerDay;
    }

    public String getNo() {
        return no;
    }

    public String getYear() {
        return year;
    }
}
