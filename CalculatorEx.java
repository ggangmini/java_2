public class CalculatorEx {
    public static void main(String[] args) {

        Calculator cal = new Calculator(10,20);

        System.out.println("두 수의 덧셈은 : " + cal.getAdd());
        System.out.println("두 수의 곱셈은 :" + cal.getmulti());
    }
}
