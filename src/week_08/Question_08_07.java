package assignments.week_08;

public class Question_08_07 {
    public static void main(String[] args) {
        double[][] points = {
                {-1, 0, 3},
                {-1, -1, -1},
                {4, 1, 1},
                {2, 0.5, 9},
                {3.5, 2, -1},
                {3, 1.5, 3},
                {-1.5, 4, 2},
                {5.5, 4, -0.5}
        };

        double minDistance = Double.MAX_VALUE;
        int point1 = 0;
        int point2 = 0;

        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double distance = calculateDistance(points[i], points[j]);
                if (distance < minDistance) {
                    minDistance = distance;
                    point1 = i;
                    point2 = j;
                }
            }
        }

        System.out.println("The closet two points are ( %f, %f ) and ( %f , %f )");

    }

    public static double calculateDistance(double[] point1, double[] point2) {
        double x1 = point1[0];
        double y1 = point1[1];
        double z1 = point1[2];

        double x2 = point2[0];
        double y2 = point2[1];
        double z2 = point2[2];

        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) + Math.pow(z2 - z1, 2));
    }
}