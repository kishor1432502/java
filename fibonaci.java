import java.util.Scanner;
public class fibonaci {
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of terms:");
int n = sc.nextInt();
int firstTerm = 0;
int secondTerm= 1;
System.out.print("Fibonacci series up to"+ n+ "terms:");
for(int i =1; i<=n;i++){
    System.out.println(firstTerm+" ");
    int nextTerm = firstTerm + secondTerm;
    firstTerm = secondTerm;
    secondTerm = nextTerm;
}
}
}
