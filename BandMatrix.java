
public class BandMatrix {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);

        for (int r = 0; r <= n - 1; r++) {
            for (int c = 0; c <= n - 1; c++) {
                if (c - r >= -width && c - r <= width) System.out.print("*");
                else System.out.print("0");
                System.out.print("  ");
            }
            System.out.println();
        }

    }
}
