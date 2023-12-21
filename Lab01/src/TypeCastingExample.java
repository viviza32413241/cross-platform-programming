public class TypeCastingExample {
    public static void main(String[] args) {
        double doubleNumber = 10.5;
        int intNumber = (int) doubleNumber;
        System.out.println("doubleNumber: " + doubleNumber);
        System.out.println("intNumber: " + intNumber);

        int num1 = 50;
        long num2 = num1;
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);

        String strNumber = "123";
        int parsedNumber = Integer.parseInt(strNumber);
        System.out.println("strNumber: " + strNumber);
        System.out.println("parsedNumber: " + parsedNumber);
    }
}
