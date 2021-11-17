package exp12;

public class Bike implements Vehicle{
    @Override
    public void Engine() {
        System.out.println(" I am a bike and I have V4 engine with 221horsepower");
    }

    @Override
    public void Wheels() {
        System.out.println(" I have four wheels.");
    }
}