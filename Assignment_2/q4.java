import java.util.*;

public class q4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the year");
        int y=sc.nextInt();
        System.out.println("enter the salary");
        double s=sc.nextDouble();
        if(y>5){

            double b=s+(s*0.05);
            System.out.println("your salary is"+b);


        }
        else{
            System.out.println("your salary is "+s);
        }
    }
    
}
