public class Main {

    static int t; // No of steps
    static int f; // No of vehicles
    static int n; // No of rides in total

    private static Parser parser = new Parser();

    public static void main(String[] args) {
    parser.parseLines();
    t = parser.getNumberOfSteps();
    f = parser.getNumberOfVehicles();
    n = parser.getNumberOfRides();
        System.out.println("Steps = " + t);
        System.out.println("Vehicles = " + f);
        System.out.println("Rides = " + n);
    }
}
