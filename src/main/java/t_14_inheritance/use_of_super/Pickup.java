package t_14_inheritance.use_of_super;

public class Pickup extends Vehicles {

    // Since the method was overridden, whenever it is called on a child class object,
    // the overridden version will be executed.
    @Override
    public void move() {
        System.out.println("The pickup is moving.");
    }


    public void showVehicleMove() {
        super.move();
    }

}
