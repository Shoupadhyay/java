import java.util.*;

public class q5 {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
  int a=sc.nextInt();
  int b=sc.nextInt();
  int c=sc.nextInt();
  int d=(a+b+c)/100;
  if(d>=80){
    System.out.println("A");
  }
  else if(d>=60||d<80){
  System.out.println("B");
   } 
else if(d>=50||d<60){
System.out.println("C");
}
else if(d>=45||d>50){
    System.out.println("D");
}
else if(d<45||d>25){
    System.out.println("E");

}
else{
    System.out.println("F");
}

}
}
