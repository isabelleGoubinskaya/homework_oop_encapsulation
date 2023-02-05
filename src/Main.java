import transport.Car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2.5, "White", 2020, "Japan", "Automatic", "Sedan", "AB12345", 4, "Summer");

        System.out.println("Mark: " + car.getMark());
        System.out.println("Model: " + car.getModel());
        System.out.println("Engine volume: " + car.getEngineVolume() + " liters");
        System.out.println("Body color: " + car.getBodyColor());
        System.out.println("Production year: " + car.getProductionYear());
        System.out.println("Assembly country: " + car.getAssemblyCountry());
        System.out.println("Transmission: " + car.getTransmission());
        System.out.println("Body type: " + car.getBodyType());
        System.out.println("Registration number: " + car.getRegistrationNumber());
        System.out.println("Number of seats: " + car.getNumberOfSeats());
        System.out.println("Tire type: " + car.getTireType());

        car.changeTiresToSeasonal("Winter");
        System.out.println("Tire type: " + car.getTireType());
    }
}
