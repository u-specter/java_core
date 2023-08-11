package start.lesson6;

public class FormatPractice {
    public static void main(String[] args) {
        String carMark = "BMW";
        String carModel = "M3";
        double price = 120000;
        boolean hasAutomaticTransmission = false;
        String intro = """
                        Hi, I'm manager of shop %s 
                        We have - %s for %f $
                        Do you have automatic transmission?
                        %s
                        """.formatted(carMark, carModel, price, hasAutomaticTransmission ? "Yes" : "No");
        System.out.println(intro);
    }
}
