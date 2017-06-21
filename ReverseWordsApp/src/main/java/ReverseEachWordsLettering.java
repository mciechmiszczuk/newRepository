import java.util.Scanner;

public class ReverseEachWordsLettering {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String enterWord;

        System.out.println("Enter below your sentence:");
        enterWord = in.nextLine();

        String[] words = enterWord.split(" ");
        String reverseSentence = "";

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String reverseWord = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                reverseWord = reverseWord + word.charAt(j);
            }
            reverseSentence = reverseSentence + reverseWord + " ";
        }

        System.out.println("--------------------");

        System.out.println("Below program shows reversion of your sentence:");
        System.out.println(reverseSentence);
    }


    public static long reverseEachWordsLetteringSwap(String word) {
        return 0;
    }
}

