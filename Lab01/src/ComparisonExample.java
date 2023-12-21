public class ComparisonExample {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;


        boolean isEqual = (a == b);
        boolean isNotEqual = (a != b);
        boolean isGreater = (a > b);
        boolean isLess = (a < b);
        boolean isGreaterOrEqual = (a >= b);
        boolean isLessOrEqual = (a <= b);

        System.out.println("a == b: " + isEqual);
        System.out.println("a != b: " + isNotEqual);
        System.out.println("a > b: " + isGreater);
        System.out.println("a < b: " + isLess);
        System.out.println("a >= b: " + isGreaterOrEqual);
        System.out.println("a <= b: " + isLessOrEqual);


        String str1 = "Hello";
        String str2 = "World";

        boolean areEqualStrings = str1.equals(str2);
        boolean areNotEqualStrings = !str1.equals(str2);

        System.out.println("str1.equals(str2): " + areEqualStrings);
        System.out.println("!str1.equals(str2): " + areNotEqualStrings);
    }
}

