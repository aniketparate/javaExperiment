package exp12;

public class Car implements Vehicle{
    @Override
    public void Engine() {
        System.out.println(" I am a car and i have 6 cylinder V6 engine with 480 horsepower.");
    }

    @Override
    public void Wheels() {
        System.out.println(" I have four wheels.");
    }
}