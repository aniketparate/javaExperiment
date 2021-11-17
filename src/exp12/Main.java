package exp12;

public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Bicycle();
        v1.Engine();
        v1.Wheels();
        System.out.println();

        Vehicle v2 = new Bike();
        v2.Engine();
        v2.Wheels();
        System.out.println();

        Vehicle v3 = new Car();
        v3.Engine();
        v3.Engine();
        System.out.println();
    }
}