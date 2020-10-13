package Lab3;

public class Main {
    public static void main(String[] args) {
        TextManipulation text1 = new TextManipulation();
        String text = text1.getText();
        System.out.println("In this text are: " + text1.CalculateSentences(text) + " sentences");
        System.out.println("In this text are: " + text1.CalculateWords(text) + " words");
        int[] letters = TextManipulation.CalculateLetters(text);
        System.out.println("In this text are: " + letters[0] + " letters");
        System.out.println("In this text are: " + letters[1] + " vowels");
        System.out.println("In this text are: " + letters[2] + " consonants");
        System.out.println("Most frequent words: ");
        text1.TopWords(text1.getText());
        System.out.println("Longest Word: "+ text1.LongestWord(text));

    }
}