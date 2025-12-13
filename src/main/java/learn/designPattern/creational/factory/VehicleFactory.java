package learn.designPattern.creational.factory;

public class VehicleFactory {

    public static Vehicle getVehicle(VehicleType vehicleType){
        return switch (vehicleType) {
            case BIKE -> new Bike();
            case CAR -> new Car();
        };
    }
}
