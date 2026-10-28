package t_14_inheritance.t_2_use_of_override;

public class CleaningRobotChild extends RobotsParent {

    // The @override keyword is optional, but it is recommended
    // because it visually indicates that you are overriding a method.
    @Override
    public void charge() {
        System.out.println("Charging... Just a little");
    }

}
