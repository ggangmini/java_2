public class Car4Ex {
    public static void main(String[] args) {

        Car4 cal = new Car4();
        cal.setBrand("BMW");
        cal.setColor("Red");
        cal.setYear(2020);

        System.out.println("브랜드 : "+cal.getBrand());
        System.out.println("색상 : "+cal.getColor());
        System.out.println(" 연식 : " +cal.getYear());
    }
}
