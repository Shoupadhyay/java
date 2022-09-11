import java.util.*;

import javax.lang.model.util.ElementScanner14;

public class q9 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       Scanner cs=new Scanner(System.in);
       System.out.println("enter the no of classes held ");
    int a=sc.nextInt();
    System.out.println("neter of the class attended");
    int b=sc.nextInt();
    double c=(6/5)/100;
    System.out.println("do you have a medical reason");
    String d=cs.next();
    if(d.equals("Y")){
        System.out.println("you can sit ");
    }
    else if(d.equals("N")){
        if(c>75){
            System.out.println("you can sit");
        }
        else {
            System.out.println("you can't sit");
        }
    }
    else{
        System.out.println("wrong key press 'Y' or 'N'");
    }


        }
    }
    
