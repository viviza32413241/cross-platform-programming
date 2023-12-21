public class AssignmentExample {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("x = " + x);

        int y = 5;
        y = x;
        System.out.println("y = " + y);

        int a = 7;
        int b = 3;
        a += b;
        System.out.println("a = " + a);

        String str1 = "Hello";
        String str2 = "World";
        String combinedStr = str1 + " " + str2;
        System.out.println("combinedStr = " + combinedStr);
    }
}
