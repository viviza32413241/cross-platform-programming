public class ConditionalExample {
    public static void main(String[] args) {
        int number = 15;


        if (number > 10) {
            System.out.println("Число більше 10");
        } else {
            System.out.println("Число не більше 10");
        }


        if (number > 20) {
            System.out.println("Число більше 20");
        } else if (number > 10) {
            System.out.println("Число більше 10, але не більше 20");
        } else {
            System.out.println("Число не більше 10");
        }


        String message = (number > 10) ? "Число більше 10" : "Число не більше 10";
        System.out.println(message);
    }
}
