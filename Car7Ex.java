public class Car7Ex {
    public static void main(String[] args) {

        Car7[] car = new Car7[5];

        car[0] = new Car7("아반떼","검정",2024);
        car[1] = new Car7("소나타","흰색",1999);
        car[2] = new Car7("BMW","검정",2022);
        car[3] = new Car7("롤스로이스","빨강색",2023);
        car[4] = new Car7("벤츠","흰색",2018);

        for(int i = 0; i < car.length; i++) {
            System.out.println(
                    "브랜드 : "+ car[i].getBrand() + " ,색깔 : "+car[i].getColor()
                            +" ,연식 : "+ car[i].getYear());
        }


    }
}
