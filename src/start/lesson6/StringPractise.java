package start.lesson6;

public class StringPractise {
    public static void main(String[] args) {
        String text = "my name is Harvey Specter";
        String[] array = text.substring(11).toLowerCase().split(" ");
        for (String word : array){
            System.out.println(word);
            System.out.println(word.length());
        }
    }
}
