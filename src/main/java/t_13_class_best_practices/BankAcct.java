package t_13_class_best_practices;

import t_12_encapsulation_getters_setters.BankAccount;

/* Common Practices in Classes

-Constructor: Used to pass values as arguments when creating an object. If you pass arguments when creating an object, you need a matching constructor.

-this: When a field and a parameter have the same name, use this to distinguish the field from the parameter.

-private and public: It is common to keep fields private and make constructors and methods public when they need to be accessible from outside the class.

-final: Used for fields that should not be reassigned after initialization, such as constants or an account number.

-String: Used for numbers that are identifiers rather than values used in mathematical operations, such as accountNumber.

-Getter and setter methods: Used to access and modify private field values after creating an object, when permitted.

-Direct assignment (object.field = value): Used when a field is accessible, although private fields are generally preferred to protect data.

 */


public class BankAcct {
    // Fields:
    private final String acctNumber;
    private String ownerName;
    private double balance;

    // Constructor:
    public BankAcct(
            String acctNumber,
            String ownerName,
            double balance) {

        this.acctNumber = acctNumber;
        this.ownerName = ownerName;
        this.balance = balance;

    }

    // *** Methods ***

    public void welcomeCustomer() {
        System.out.println("Hello!, welcome");
    }

    // getters and setters methods:
    public String getAcctNumber() {
        return this.acctNumber;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }




}
