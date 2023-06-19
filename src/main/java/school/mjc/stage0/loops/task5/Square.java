package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength){
 for (int r = 0; r < sideLength; r++) {
            for (int c = 0; c < sideLength; c++) {
                if ((r == 0 || c == 0) || c == sideLength - 1 || r == sideLength - 1) {
                    System.out.print("8");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
