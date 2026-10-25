package t_13_class_best_practices;

public class EntryPoint {
    public static void main(String[] args) {

        BankAcct bankAcct1 = new BankAcct("134756", "James Potter", 188543);

        System.out.println(bankAcct1);

        System.out.println("Account number" + bankAcct1.getAcctNumber());

        System.out.println("Account balance $" + bankAcct1.getAcctNumber());
    }
}
