
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here

        Account MatthewsAccount = new Account("Matthews account", 1000);
        Account myAccount = new Account("My account", 0);
        MatthewsAccount.withdrawal(100);
        myAccount.deposit(100);
        System.out.println(myAccount.toString());
        System.out.println(MatthewsAccount.toString());
    }
}
