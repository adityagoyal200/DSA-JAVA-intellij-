/*A parking garage charges a $2.00 minimum fee to park for up to three hours. The garage charges an
        additional $0.50 per hour for each hour or part thereof in excess of three hours. The maximum charge
        for any given 24-hour period is $10.00. Assume that no car parks for longer than 24 hours at a time.
        Write an application that calculates and displays the parking charges for each customer who parked in
        the garage yesterday. You should enter the hours parked for each customer. The program should display
        the charge for the current customer and should calculate and display the running total of yesterday’s
        receipts. It should use the method calculateCharges to determine the charge for each customer

 */

import java.util.Scanner;

public class Parking {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of customers:");
        int n = in.nextInt();
        float [] charge = new float[n];
        float [] hours  = new float[n];
        float total = 0;
            for(int i=0; i<n;i++){
                System.out.print("Enter the time for customer:");
                hours[i] = in.nextFloat();
                charge[i] = calculateCharges(hours[i]);

            }
            for(int i=0;i<n;i++){
                System.out.print("Charges for customer:");
                System.out.println(charge[i]);

            }
        for(int i=0;i<n;i++){
            total = total + charge[i];
        }
        System.out.println("Total for yesterday:"+ total);
    }
    static float  calculateCharges(float hours){
        float charge = 2.0F;
            if(hours>3){
                charge = charge + (float) ( 0.5 * (hours - 3));
            }
            if(charge > 10.0){
                charge =  10F;
            }
    return charge ;
    }
}
