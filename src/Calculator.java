public class Calculator {
    public static void main(String[] args) {
        new Calculator();
    }
    public Calculator(){}

    public int intBetween(int min, int max){
        return (int)Math.floor(doubleBetween(min, max));
    }
    public double doubleBetween(int min, int max){
        return (Math.random() * (Math.abs(max - min) + 1)) + min;
    }
}
