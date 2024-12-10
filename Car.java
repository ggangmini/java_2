public class Car {
    // 문제 1 Car라는 클래스를 만들어 brand color year 을 속성으로 추가
    // 객체를 생성하여 브랜드 색상 연식을 출력


    String brand ;
    String color;
    int year;

    public Car(){

    }
    public Car(String brand){
        this.brand = brand;
    }
    public Car(String brand, String color){
        this.brand = brand;
        this.color = color;
    }
    public Car(String brand, String color, int year){
        this.brand = brand;
        this.color = color;
        this.year = year;
    }
}
