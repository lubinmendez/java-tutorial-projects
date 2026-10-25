package t_12_encapsulation_getters_setters;

public class EntryPoint {
    public static void main(String[] args) {

        BankAccount bankAccount1 = new BankAccount();

        bankAccount1.setBalance(150888.77);

        System.out.println("bankAccount1 = " + bankAccount1.getBalance());


    }
}
