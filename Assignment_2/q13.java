import java.util.*;
public class q13 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter age:");
      int age=sc.nextInt();  
      System.out.println("Enter sex: M or F");
      char sex=sc.next().charAt(0);
      System.out.println("Marital status:Y or N");
      char status=sc.next().charAt(0);
      if(sex=='M' && (age>=20 && age<=40)){
        System.out.println("Work Anywhere");
    }
    else if(sex=='M' && (age>=40 && age<=60)){
        System.out.println("He will work in urban areas only");
    }
    else if(sex=='F'){
        System.out.println("She will work only in urban areas");
    }
    else{
        System.out.println("Error");
    }
}
}