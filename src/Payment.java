import java.util.Scanner;

public class Payment {

    public static void shift() {
        Scanner grade = new Scanner (System.in);
        String enteredGrade = "";
        System.out.println("Times remaining: 3");
        for (int i = 3; i > 0; i--){
            System.out.print("Enter your employee grade: ");
            enteredGrade = grade.nextLine().toUpperCase();
            if (enteredGrade.equals("A") || enteredGrade.equals("B") || enteredGrade.equals("C"))
                break;
            System.out.println("The employee does not exist.");
            System.out.println("Times rmaining " + (i - 1));
        }
        switch (enteredGrade){

            case "A":
                NetPaymentOfA.paymentOfA();
                break;

            case "B":
                NetPaymentOfB.paymentOfB();
                break;

            case "C":
                NetPaymentOfC.paymentOfC();
        }
    }

    public static void main(String[] args) {
        shift();

    }
}
