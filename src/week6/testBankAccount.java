package week6;
import org.junit.Test;
import static org.junit.Assert.*;

public class testBankAccount {
    @Test
    public void testBankAccount(){
        BankAccount account=new BankAccount("Bob",100.0);
        assertEquals("Account holder issue in constructor","Bob",account.getAccountHolder());
        assertEquals("Account balance issue in constructor",100.0,account.checkBalance(),.001);

        account.deposit(5.5);
        assertEquals("Deposit issue",105.5,account.checkBalance(),.001);

        account.deposit(1.0);
        assertEquals("Deposit issue",106.5,account.checkBalance(),.001);

        account.withdrawl(10.0);
        assertEquals("Withdrawl issue",96.5,account.checkBalance(),.001);

        account.withdrawl(2.5);
        assertEquals("Withdrawl issue",94.0,account.checkBalance(),.001);

        BankAccount account2=new BankAccount("Ada",19.95);
        assertEquals("Account holder issue in constructor","Ada",account2.getAccountHolder());
        assertEquals("Account balance issue in constructor",19.95,account2.checkBalance(),.001);

        account.transfer(account2,50);
        assertEquals("Transfer issue withdrawn account",44.0,account.checkBalance(),.001);
        assertEquals("Transfer issue deposit account",69.95,account2.checkBalance(),.001);

        assertFalse("failed overdrawn account",account.isOverdrawn());
        assertFalse("failed overdrawn account2",account2.isOverdrawn());

        account.withdrawl(50.0);
        assertEquals("Withdrawl issue",-6.0,account.checkBalance(),.001);
        assertTrue("failed overdrawn issue",account.isOverdrawn());
    }
}
