import java.util.Scanner;

public class quest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
  char ch=sc.next().charAt(0);

    if(ch>='A' && ch<='Z'){
    System.out.println(" is an upper case letter ");
}
else if(ch>='a' && ch<='z'){
    System.out.println(" is a lower case letter ");
}
else{
    System.out.println(" is not a Alphabet ");
}
}
}

    

