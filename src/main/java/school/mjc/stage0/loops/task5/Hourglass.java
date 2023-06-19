package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
       for (int r = 0; r < height; r++) {
            for (int c = 0; c < r; c++) {
                System.out.print(" ");
            }
            for (int t = r; t < height; t++) {
                System.out.print("8" + " ");
            }
            System.out.println();
        }
        for (int r = height - 1; r >= 0; r--) {
            for (int c = 0; c < r; c++) {
                System.out.print(" ");
            }
            for (int t = r; t < height; t++) {
                System.out.print("8" + " ");
            }
            System.out.println();
        }


    }
}
