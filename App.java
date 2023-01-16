package sg.edu.nus;
import java.util.*;
import java.io.*;
/**
 * Hello world!
 *
 */
public class App 
{
    private App() {}
    public static void main( String[] args )
    {
        System.out.println( "Welcome to Banking" );

        int n = 3;
        BankAccount bankAccount[] = new BankAccount[n];

        for(int i=0; i < bankAccount.length; i++) {
            String uuid = UUID.randomUUID().toString();

            double max = 10000.00;
            double min = 1000.00;

            Random randomNum = new Random();
            double initialBalance = min + randomNum.nextDouble();

            bankAccount[i] = new FixedDepositAccount(uuid, initialBalance);
        }   

        bankAccount[0].setFullName("Tan Meng Kee");
        bankAccount[1].setFullName("Tan Meng Lee");
        bankAccount[2].setFullName("Tan Meng Hoo");

        bankAccount[0].showAccount();
        bankAccount[1].showAccount();
        bankAccount[2].showAccount();

        bankAccount[0].deposit(200);
        bankAccount[0].deposit(200);
        bankAccount[0].deposit(200);

        bankAccount[0].showAccount();
        bankAccount[1].showAccount();
        bankAccount[2].showAccount();

        bankAccount[0].withdraw(200);
        bankAccount[1].withdraw(200);
        bankAccount[2].withdraw(200);

        bankAccount[0].showAccount();
        bankAccount[1].showAccount();
        bankAccount[2].showAccount();

    

    }   

}