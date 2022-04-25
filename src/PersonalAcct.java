public class PersonalAcct extends Account{

    public PersonalAcct(double balance, String firstName, String lastName, String street, String city, String state,
            String zip) {
        super(balance, firstName, lastName, street, city, state, zip);
        if(balance < 100){
            super.withdrawal(2.00);
        }
    }

    @Override
    public void withdrawal(double amount){
        if(amount <=  super.getBalance()){
            super.withdrawal(amount);

            if(super.getBalance() < 100){
                super.withdrawal(2.00);
                System.out.println("Deducted $2.00 from account - MBR: $100:\nNew Balance: $" + getBalance());
            }

        }else{
            System.out.println("Not enough money in account.");
        }
    }
}
