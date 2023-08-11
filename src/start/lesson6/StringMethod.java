package start.lesson6;

import java.util.Arrays;

public class StringMethod {
    public static void main(String[] args) {
        String text = "Hello word!";
        String textUpper = text.toUpperCase();
        System.out.println(textUpper);

        String textLower = text.toLowerCase();
        System.out.println(textLower);

        int length = text.length();
        System.out.println();

        String repeatedText = text.repeat(10);
        System.out.println(repeatedText);

        String names = "Qish;Bahor;Yoz;Kuz";
        String[] namesArray = names.split(";");
        System.out.println(Arrays.toString(namesArray));

        boolean containsHello = text.contains("Hello");
        System.out.println(containsHello);

        String replacedText = text.replaceAll("l", "a");
        System.out.println(replacedText);

        String firstFiveLetters = text.substring(0,5);
        System.out.println(firstFiveLetters);


    }
}
