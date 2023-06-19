package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        for (int r = 0; r < cathetusLength; r++) {
            for (int c = 0; c < r + 1; c++) {
                System.out.print("8");
            }
            System.out.println();
        }

    }
}
