import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter a number: ");
         int number=sc.nextInt();

         if(number>0){
            System.out.println("The number is positive.");
         }else if(number<0){
            System.out.println("The number is negaitive.");
         }else{
            System.out.println("The number is Zero.");
         }

         sc.close();

    }
    }

