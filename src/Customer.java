public class Customer {
    private String firstName;
    private String lastName;
    private String street;
    private String city;
    private String state;
    private String zip;

    public Customer(String firstName, String lastName, String street, String city, String state, String zip){
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public String toString(){
        String customerString;

        customerString = firstName + " " + lastName + "\n";
        customerString += street + "\n";
        customerString += city + ", " + state + " " + zip + "\n";

        return customerString;
    }
}
