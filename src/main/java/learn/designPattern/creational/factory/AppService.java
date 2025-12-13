package learn.designPattern.creational.factory;

public class AppService {

    public static void main(String[] args) {
        Vehicle vehicle = VehicleFactory.getVehicle(VehicleType.BIKE);
        vehicle.drive();
    }

}
