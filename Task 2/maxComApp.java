import java.util.Scanner;

public class maxComApp {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  
      int duration, category;    
      double charge = 0.0;
      int ans;
      CallChargeCalculator cal = new CallChargeCalculator();
   
   do {
     System.out.println("Enter the call duration (in minutes):");
         duration = sc.nextInt();
     System.out.println("Enter Rate Category:  1.Daytime  2.Evening  3.Off-Peak");
         category = sc.nextInt();
         
     charge = cal. computeCharge (duration, category);
     System.out.printf("The amount you have to pay is = RM%.2f%n", charge);
     System.out.println("Do you want to continue? 1.Yes  2.No");
     ans = sc.nextInt();
     System.out.println();
   } while (ans == 1);
   
   System.out.println("Thank you!");
   
 }
}

class CallChargeCalculator {
    double charge;

    public double computeCharge(int duration, int category) {
        double rate;
        if (category == 1) {
            rate = 0.07;
        } else if (category == 2) {
            rate = 0.12;
        } else {
            rate = 0.05;
        }
        charge = duration * rate ;
        return charge;
    }
    
}
