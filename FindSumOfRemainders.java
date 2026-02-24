import java.util.Scanner;
 public class Solution {
public static int FindSumOfRemainders(int n, int div) { 
int sum = 0;
for (int i = 1; i <= n; i++) {
 sum += i % div;
}
return sum;
}
public static void main(String[] args) {
 Scanner sc = new Scanner(System.in); 
 System.out.print("Enter the value of n: ");
 int n = sc.nextInt();
 System.out.print("Enter the divisor: ");
int div = sc.nextInt(); 
if (div <= 0) {
System.out.println("Divisor must be greater than 0."); 
 return;
}
int result = FindSumOfRemainders(n, div);
 System.out.println("Output:\n" + result); 
 sc.close();
}
}
