import java.util.Scanner;
public class even {
    public static void main(String args[]){
     Scanner od = new Scanner(System.in);
     System.out.println("Enter the num1");
     int num1 = od.nextInt();
     System.out.println("Enter the num2");
     int num2 = od.nextInt();
     for(int i=num1; i<=num2;i=i+2){
        System.out.print("The numbers are:");
        if(num1%2==0){  
System.out.println(i);
        }
        else{
            System.out.println(" ");
        }
     }   
    }
}
