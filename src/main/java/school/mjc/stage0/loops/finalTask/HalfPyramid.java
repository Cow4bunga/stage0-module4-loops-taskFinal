package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        int mid = cathetusLength / 2;
        int counter=1;

        for (int i = 0; i < cathetusLength; i++) {
            for (int j = cathetusLength - i - 1; j > 0; j--) {
                System.out.print(" ");
            }

            for (int k = 1; k <= counter; k++) {
                System.out.print("*");
            }

            counter++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
