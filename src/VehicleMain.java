public class VehicleMain {
    public static void main(String[] args){
        Plane airplane = new Plane();
        System.out.println(airplane.run());
        System.out.println(airplane.stop());
        System.out.println(airplane.accelerate());

        Car automobile = new Car();
        System.out.println(automobile.run());
        System.out.println(automobile.stop());
        System.out.println(automobile.accelerate());

        Truck big_truck = new Truck();
        System.out.println(big_truck.run());
        System.out.println(big_truck.stop());
        System.out.println(big_truck.accelerate());

        Boat ship = new Boat();
        System.out.println(ship.run());
        System.out.println(ship.stop());
        System.out.println(ship.accelerate());
    }
}
