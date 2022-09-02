import java.util.*;
public class triangle {
    public static void main(String[] args) {
        
    
Scanner sc=new Scanner(System.in);
System.out.println("enter the sides of triangle to find the area and perimeter");
 float a=sc.nextFloat();
 float b=sc.nextFloat();
 float c=sc.nextFloat();
 float area=0.5f*(a*b*c);
float  perimeter =a+b+c;
System.out.println("area"+" "+area);
System.out.println("perimeter "+" "+perimeter);

}

}
