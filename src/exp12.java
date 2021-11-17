//Create an interface vehicle and classes like bicycle,car, bike etc, having common functionalities and put
//all the common functionalities in the interface.
//Classes like Bicycle, Bike, car etc implement all these functionalities in their own class in their own way.

interface Vehicle {
    void Engine();

    void Wheels();
}

class Bicycle implements Vehicle {
    @Override
    public void Engine() {
        System.out.println(" I am a Bicycle and I dont have engine.");
    }

    @Override
    public void Wheels() {
        System.out.println(" I have two wheels.");
    }
}

class Bike implements Vehicle {
    @Override
    public void Engine() {
        System.out.println(" I am a bike and I have V4 engine with 221horsepower");
    }

    @Override
    public void Wheels() {
        System.out.println(" I have four wheels.");
    }
}

class Car implements Vehicle {
    @Override
    public void Engine() {
        System.out.println(" I am a car and i have 6 cylinder V6 engine with 480 horsepower.");
    }

    @Override
    public void Wheels() {
        System.out.println(" I have four wheels.");
    }
}

public class exp12 {
    public static void main(String[] args) {
        Vehicle v = new Bicycle();
        v.Engine();
        v.Wheels();

        Vehicle v1 = new Bike();
        v1.Engine();
        v1.Wheels();

        Vehicle v2 = new Car();
        v2.Engine();
        v2.Engine();
    }
}