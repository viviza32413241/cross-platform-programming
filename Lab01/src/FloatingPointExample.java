public class FloatingPointExample {
    public static void main(String[] args) {
        float floatValue = 10.5f;
        System.out.println("floatValue: " + floatValue);

        double doubleValue = 20.75;
        System.out.println("doubleValue: " + doubleValue);

        double sum = floatValue + doubleValue;
        System.out.println("Sum: " + sum);

        double difference = doubleValue - floatValue;
        System.out.println("Difference: " + difference);

        double product = floatValue * doubleValue;
        System.out.println("Product: " + product);

        double quotient = doubleValue / floatValue;
        System.out.println("Quotient: " + quotient);
    }
}
