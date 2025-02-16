package VarA_Task2_Chapter3;

public class Customer {

    private int id;
    private String lastName;
    private String firstName;
    private String middleName;
    private String address;
    private String creditCardNumber;
    private String bankAccountNumber;


    public Customer(int id, String lastName, String firstName, String middleName,
                    String address, String creditCardNumber, String bankAccountNumber) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.address = address;
        this.creditCardNumber = creditCardNumber;
        this.bankAccountNumber = bankAccountNumber;
    }


    public int getId() { return id; }
    public String getLastName() { return lastName; }
    public String getFirstName() { return firstName; }
    public String getMiddleName() { return middleName; }
    public String getAddress() { return address; }
    public String getCreditCardNumber() { return creditCardNumber; }
    public String getBankAccountNumber() { return bankAccountNumber; }

    // Метод toString()
    @Override
    public String toString() {
        return id + ": " + lastName + " " + firstName + " " + middleName +
                ", Адрес: " + address +
                ", Карта: " + creditCardNumber +
                ", Счет: " + bankAccountNumber;
    }
}

