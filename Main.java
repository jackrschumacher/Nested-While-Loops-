import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("=====Loan Calculator=====");
    double initialBalance = input.nextDouble();
    
    System.out.println("What is the annual intrest rate on this loan? (as a decimal -> i.e. 9.3% would be .093");
    double intrestRate = input.nextDouble();

    System.out.println("How many months would you like to have to pay this loan off?");
    int numMonths = input.nextInt();


    double maxPayment = initialBalance;
    double minPayment = 0;
    double paymentToTry = initialBalance;
    double marginOfError = 0.01; //one penny off
    double currentBalance = initialBalance;
    
    do{
      
    }while(Math.abs(currentBalance) > marginOfError);
    for(int i = 0; i < numMonths; i++){
      currentBalance *= Math.pow(1+intrestRate, 1.0/12);
      currentBalance -= paymentToTry;
    }
    if(Math.abs)
    
  }
}