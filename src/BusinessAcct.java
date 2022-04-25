public class BusinessAcct extends Account{

    public BusinessAcct(double balance, String firstName, String lastName, String street, String city, String state,
            String zip) {
        super(balance, firstName, lastName, street, city, state, zip);
        if(balance < 500){
            super.withdrawal(10.00);
        }
    }

    @Override
    public void withdrawal(double amount){
        if(amount <=  super.getBalance()){
            super.withdrawal(amount);

            if(super.getBalance() < 500){
                super.withdrawal(10);
                System.out.println("Deducted $10.00 from account - MBR: $500:\nNew Balance: $" + getBalance());
            }

        }else{
            System.out.println("Not enough money in account.");
        }
    }
}
