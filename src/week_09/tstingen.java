package assignments.week_09;

public class tstingen {
    public static void main(String[] args) {
        Account account = new Account(1122 , 20000);
        account.withdraw(2500);
        account.deposit(3000);
        System.out.println("             Account Statement :             ");
        System.out.println("---------------------------------------------");
        System.out.println("Account ID     : " + account.getId()
                + "\nDate created   : " + account.getDateCreated()
                + "\nBalance        : $" + account.getBalance()
                + "\nMonthly Interest: $" + account.getMonthlyInterest());

    }
}

