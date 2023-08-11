package start.lesson6;

public class StringFormat {
    public static void main(String[] args) {
        String name = "Umidjon";
        int age = 23;
        String phrase = String.format("Men %s. %ddaman", name, age);
        System.out.println(phrase);
    }
}
