
public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);

        int x = 0;
        int y = 0;
        int steps = 0;
        System.out.println("(" + y + ", " + x + ")");
        while (Math.abs(x) + Math.abs(y) != r) {
            double ran = Math.random();
            steps++;
            if (ran < 0.25) {
                y++;
                System.out.println("(" + y + ", " + x + ")");
            }
            if (ran < 0.5 && ran >= 0.25) {
                x++;
                System.out.println("(" + y + ", " + x + ")");
            }
            if (ran < 0.75 && ran >= 0.5) {
                y--;
                System.out.println("(" + y + ", " + x + ")");
            }
            if (ran >= 0.75) {
                x--;
                System.out.println("(" + y + ", " + x + ")");
            }
        }
        System.out.println("steps = " + steps);
    }
}
