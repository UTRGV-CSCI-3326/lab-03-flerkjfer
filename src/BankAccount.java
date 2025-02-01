public class BankAccount{
    public static void main(String[] args){
        double balance = 2175.37;
        balance = balance - 302.50; 
        balance += 50.03;
        balance = (balance / 2) + 20;
        balance -= 1; 
        balance *= 2.00;
        balance += 1; 

        
        System.out.printf("Bob's end balance is: $%.2f%n", balance); //using printf and %.2f%n to display properly 
        //and to not display .9 or .8999999. Similar syntax to C programming!
    }
}