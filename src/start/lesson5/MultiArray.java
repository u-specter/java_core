package start.lesson5;

public class MultiArray {
    public static void main(String[] args) {
        int[] group1 = {180, 178, 190};
        int[] group2 = {165, 195, 192};
        int[][] multiArray = {group1, group2};

        upperFor :
        for (int[] array : multiArray) {
            for (int number : array) {
                if(number == 178) {
                    System.out.println("Bu osha!");
                    break upperFor;
                } else {
                    System.out.println("Bu emas");
                }
            }
        }
    }
}
