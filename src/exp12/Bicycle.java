package exp12;

public class Bicycle implements Vehicle{
    @Override
    public void Engine() {
        System.out.println(" I am a Bicycle and I dont have engine.");
    }

    @Override
    public void Wheels() {
        System.out.println(" I have two wheels.");
    }
}