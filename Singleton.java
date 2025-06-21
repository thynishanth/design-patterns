public class Singleton {
    public static void main(String[] args) {
        Car car = Car.getInstance();
        System.out.println(car);
    }
}

// make class final so that it cannot be inherited
 final class Car {
    // thread safe
    private static final Car instance = new Car();

//    making default constructor private so that object cannot be created using new keyword
   private Car() {
   }

//   optional instance method which will get the same instance every time
    public static Car getInstance() {
        return instance;
    }
}
