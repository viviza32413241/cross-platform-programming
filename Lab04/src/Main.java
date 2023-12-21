public class Main {
    public static void main(String[] args) {
        String proverbString = "Сказаного і сокирою не вирубаєш";
        String[] words = proverbString.split("\\s+");

        String longestWord = null;
        String shortestWord = null;

        for (String word : words){
            if (longestWord == null || word.length() > longestWord.length()){
                longestWord = word;
            }
            if (shortestWord == null || word.length() < shortestWord.length()){
                shortestWord = word;
            }
        }

        System.out.println("Найдовше слово у рядку: " + longestWord);
        System.out.println("Найкоротше слово у рядку: " + shortestWord);
    }
}