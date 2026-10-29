package t_15_dynamic_and_static_context.count_variable_dynamic_context;

public class EntryPoint {

    public static void main(String[] args) {

        CellPhone cellPhone1 = new CellPhone();
        CellPhone cellPhone2 = new CellPhone();


        cellPhone1.makeCall();
        cellPhone1.makeCall();

        cellPhone2.makeCall();

        System.out.println("Number of calls from cellPhone1: " + cellPhone1.callCounter); // 2
        System.out.println("Number of calls from cellPhone1: " + cellPhone2.callCounter); // 1

    }


}
