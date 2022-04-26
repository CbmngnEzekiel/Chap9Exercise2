import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) throws Exception {

        System.out.println("Open an Account: \n" +
                            "[1] Personal Account\n" +
                            "[2] Business Account");
        int choice = sc.nextInt();
        sc.nextLine();

        Account account = createAccount(choice);

        int menuChoice = 0;

        do{
            System.out.println("\n[1] Show account balance\n" +
                                "[2] Deposit\n" +
                                "[3] Withdraw\n" +
                                "[0] Exit");
            menuChoice = sc.nextInt();

            switch(menuChoice){
                case 1 ->{
                    System.out.println(account.toString());
                }
                case 2 ->{
                    double depositAmount;
                    System.out.println("Enter amount: ");
                    depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                }
                case 3 ->{
                    double withdrawAmount;
                    System.out.println("Enter amount: ");
                    withdrawAmount = sc.nextDouble();
                    account.withdrawal(withdrawAmount);
                }
                case 0 ->{

                }
                default ->{
                    System.out.println("Invalid input!");
                }
            }
        }while(menuChoice != 0);

        sc.close();
    }

    static public Account createAccount(int choice){
        System.out.print("Enter first name: ");
        String firstName = sc.nextLine();

        System.out.print("\nEnter last name: ");
        String lastName = sc.nextLine();

        System.out.print("\nEnter street: ");
        String street = sc.nextLine();

        System.out.print("\nEnter city: ");
        String city = sc.nextLine();

        System.out.print("\nEnter state: ");
        String state = sc.nextLine();

        System.out.print("\nEnter zip: ");
        String zip = sc.nextLine();

        System.out.print("\nEnter Amount: ");
        double amount = sc.nextDouble();
        
        if(choice == 1){
            return new PersonalAcct(amount, firstName, lastName, street, city, state, zip);
        }else{
            return new BusinessAcct(amount, firstName, lastName, street, city, state, zip);
        }
    }
}
