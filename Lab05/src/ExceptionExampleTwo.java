public class ExceptionExampleTwo {
    public static void main(String[] args) {
        //CloneNotSupportedException
        try {
            CustomObject customObject = new CustomObject("text");
            CustomObject clonedObj = (CustomObject) customObject.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Виняткова ситуація: " + e.getMessage());
        }

        //NullPointerException
        try {
            String str = null;
            int length = str.length();
        } catch (NullPointerException e) {
            System.out.println("Виняткова ситуація: " + e.getMessage());
        }
    }
}
