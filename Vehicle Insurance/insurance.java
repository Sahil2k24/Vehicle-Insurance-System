//Program for Vehicle Insurance System 

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class insurance{
    public static void main(String[] args){

        System.out.println("******************** WELCOME TO THE VEHICLE INSURANCE SYSTEM ****************");
        System.out.println("\nTHESE ARE THE VEHICLES THAT WE PROVIDE INSURANCE FOR : ");
        System.out.println("1.CAR\n2.TRUCK\n3.BUS\n4.MOTORCYCLE");
        System.out.println("\nENTER THE TYPE OF YOUR VEHICLE : ");

        Scanner sc=new Scanner(System.in);

        String type=sc.nextLine();
        
        System.out.println("ENTER THE COMPANY OF THE VEHICLE : ");
        String com=sc.nextLine();

        System.out.println("ENTER THE POWER OF THE ENGINE IN 'CC' : ");
        int power=sc.nextInt();

        System.out.println("\nTHIS IS THE DESCRIPTION FOR YOUR VEHICLE : ");
        System.out.println("-->YOUR VEHICLE TYPE IS : "+type);
        System.out.println("-->THE COMPANY OF THE VEHICLE IS : "+com);
        System.out.println("-->THE POWER OF YOUR VEHICLE IS : "+power+"CC");

        sc.close();

        int premium=0;

        switch(type)
        {
            case "CAR":
                if(power>800)
                {
                    premium=1500;
                }
                else
                {
                    premium=1000;
                }
                System.out.println("\nTHE INSURANCE FOR YOUR VEHICLE IS : "+premium+"/-");
                break;

                case "TRUCK":
                if(power>1500)
                {
                    premium=5000;
                }
                else
                {
                    premium=3000;
                }
                System.out.println("\nTHE INSURANCE FOR YOUR VEHICLE IS : "+premium+"/-");
                break;

                case "BUS":
                if(power>1200)
                {
                    premium=4000;
                }
                else
                {
                    premium=2500;
                }
                System.out.println("\nTHE INSURANCE FOR YOUR VEHICLE IS : "+premium+"/-");
                break;

                case "MOTORCYCLE":
                if(power>150 && power<200)
                {
                    premium=500;
                }
                else if(power>200 && power<500)
                {
                    premium=900;
                }
                else
                {
                    premium=1000;
                }
                System.out.println("\nTHE INSURANCE FOR YOUR VEHICLE IS : "+premium+"/-");
                break;

                default:
                    System.out.println("UNKNOWN VEHICLE TYPE !");
                    break;
        }

        System.out.println("\n**************** THANK YOU FOR USING OUR SERVICES ******************");
    }
}