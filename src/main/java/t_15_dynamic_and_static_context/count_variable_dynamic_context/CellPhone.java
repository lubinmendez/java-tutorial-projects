package t_15_dynamic_and_static_context.count_variable_dynamic_context;

// Dynamic context:

// Counter variable:
// Use an instance variable when each object needs to store
// its own data independently of other objects.

public class CellPhone {

    int callCounter = 0; // Instance variable

    public void makeCall() {
        System.out.println("Calling...");
        callCounter++;
    }
}