package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){
for (int r = 0; r < height; r++) {
            for (int c = 0; c < length; c++) {
                if ((r == 0 || c == 0) || c == length - 1 || r == height - 1) {
                    System.out.print("8");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
