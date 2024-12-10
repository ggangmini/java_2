public class Car4 {

   private String brand ;
    private String color;
    private int year;
public Car4(){}
    public Car4(String brand, String color, int year) {
        this.brand = brand;
        this.color = color;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {   // set은 저장하기 위한것이라 외부에 돌려줄게 없기 때문에 void
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

}
