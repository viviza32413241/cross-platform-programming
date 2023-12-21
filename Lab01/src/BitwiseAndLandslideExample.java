public class BitwiseAndLandslideExample {
    public static void main(String[] args) {
        int a = 8;
        int b = 3;


        int bitwiseAnd = a & b;
        System.out.println("a & b = " + bitwiseAnd);

        int bitwiseOr = a | b;
        System.out.println("a | b = " + bitwiseOr);


        int bitwiseXOR = a ^ b;
        System.out.println("a ^ b = " + bitwiseXOR);


        int bitwiseNotA = ~a;
        System.out.println("~a = " + bitwiseNotA);


        int leftShift = a << 2;
        System.out.println("a << 2 = " + leftShift);


        int rightShift = a >> 1;
        System.out.println("a >> 1 = " + rightShift);
    }
}
