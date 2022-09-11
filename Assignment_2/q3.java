import java.util.*;

public class q3 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    
    System.out.println("enter the quantity");
     int quantity=sc.nextInt();
     if(quantity>1000){
        int p=90*quantity;
        System.out.println(p+" is the price");

     }
     else{
        int p=100*quantity;
        System.out.println(p+"is the price");
     }
    }
    
}
