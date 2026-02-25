import java.util.Scanner;
 public class Solution1 {
public static int CardsPyramid(int n) { 
if (n == 0)
 return -1;
final int MOD = 1000007;
long result = ((long) n * (3 * n + 1)) / 2;
 return (int)(result % MOD);
}
public static void main(String[] args)
 {
 Scanner sc = new Scanner(System.in);
System.out.print("Enter the level of pyramid: "); 
int n = sc.nextInt();
int cards = CardsPyramid(n);
 System.out.println("Output:\n" + cards);
 sc.close();
}
}
