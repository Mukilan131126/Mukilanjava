abstract class Vehicle {
   abstract public void startEngine();
   abstract public void stopEngine();
}

class Car extends Vehicle{
    public void startEngine(){
        System.out.println("Engine Started");
    }
    public void stopEngine(){
        System.out.println("Engine Stopped");
    }
}

class Bike extends Vehicle{
    public void startEngine(){
        System.out.println("Bike Started");
    }
    public void stopEngine(){
        System.out.println("Bike stopped");
    }
}
class Main{
    public static void main(String[] args) {
        Car c = new Car();
        c.startEngine();
        c.stopEngine();
        Bike b =new Bike();
        b.startEngine();
        b.stopEngine();
    }
}


