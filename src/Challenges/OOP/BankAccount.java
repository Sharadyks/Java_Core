package Challenges.OOP;

 class BankAccount {
    private String accountHolderNme;
    private String accountNumber;
    private double balance;

    BankAccount(String accountHolderNme, String accountNumber){
        this.accountHolderNme = accountHolderNme;
        this.accountNumber = accountNumber;
    }

    public void deposit(double money){
        if (money<=0){
            System.out.println("Invalid deposit");
        } else {
            balance += money;
            System.out.printf("The amount of %f is deposited in your account ",money);
            System.out.println();
        }
    }

    public double withdraw(double money){
        if (money > balance || money<=0){
            System.out.printf("The withdrwan of amount %f is failed",money);
        } else {
            balance -= money;
            System.out.printf("The amount of %f is withdrwan from you account",money);

        }
        return money;
    }

     public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Sharad Sharma","001SY");
        account1.deposit(5000);
         System.out.println(account1.withdraw(5500));
         account1.deposit(-500);
         System.out.println(account1.withdraw(-1000));

     }

}
