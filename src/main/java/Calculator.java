public class Calculator {
    int numberOne = 25;
    int numberTwo = 356;

    public void SumNumberOneAndTwo() {
        int result1 = numberOne + numberTwo;
        System.out.println("Wnik dodawania : " + result1);
    }
    public void SubtractionNumberTwoAndOne(){
        int result2 = numberTwo - numberOne ;
        System.out.println("Wynik odejmowania : " + result2);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.SumNumberOneAndTwo();
        calculator.SubtractionNumberTwoAndOne();
    }
}
