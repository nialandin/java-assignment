package assignments.week_09;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account(1122, 20000);
        account.setAnnualInterestRate(4.5);

        account.withdraw(2500);
        account.deposit(3000);

        System.out.println("         Account Statement      ");
        System.out.println("--------------------------------");
        System.out.println("Accoutn ID       : " + account.getId());
        System.out.println("Date created     : " +account.getDateCreated() );
        System.out.println("Balance          : $" + account.getBalance());
        System.out.println("Monthly Interest : $" + account.getMonthlyInterest());
    }

}
