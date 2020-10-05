

public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);

        double totSteps = 0;

        for (int t = 0; t < trials; t++) {

            int x = 0;
            int y = 0;
            int steps = 0;

            while (Math.abs(x) + Math.abs(y) != r) {
                double ran = Math.random();
                steps++;
                if (ran < 0.25) {
                    y++;
                }
                if (ran < 0.5 && ran >= 0.25) {
                    x++;
                }
                if (ran < 0.75 && ran >= 0.5) {
                    y--;
                }
                if (ran >= 0.75) {
                    x--;
                }
            }
            totSteps = totSteps + steps;
        }
        double avgSteps = totSteps / trials;
        System.out.println("average number of steps = " + avgSteps);
    }
}
