import java.util.Scanner;

public class NetPaymentOfA {
    //int A = 500;    int allowanceA = 10000;

    public static void paymentOfA(){
        Scanner grade = new Scanner (System.in);
        System.out.print("Enter the number of hours: ");
        int hours = grade.nextInt();
        int payment = (500 * hours) + 10000;
        System.out.println("your gross payment is: " + payment);

        if (payment > 36000){
            int subtract = payment - 36000;
            double cashAbove = 0.8 * subtract;
            double salary = 0.85 * 36000;
            double totalSalary = cashAbove + salary;
            double tax = payment - totalSalary;
            System.out.println("your tax: " + tax);
            System.out.println("Your net payment is: " + totalSalary);
        }
        else {
            if (payment < 12000)
                System.out.println("Your net payment is: " + payment);
            else if (payment < 24000 && payment >= 12000){
                double netpayment = 0.9 * payment;
                double taxx = payment - netpayment;
                System.out.println("your tax: " + taxx);
                System.out.println("Your net payment is: " + netpayment);
            }
            else {
                if (payment < 36000 && payment >= 24000);
                double netSalary = payment * 0.85;
                double taxxx = payment - netSalary;
                System.out.println("your tax: " + taxxx);
                System.out.println("Your net payment is: " + netSalary);
            }
        }
    }

    public static void main(String[] args) {
        paymentOfA();

    }

}
