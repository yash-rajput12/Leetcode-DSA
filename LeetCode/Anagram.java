import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new  Scanner(System.in);
      String x= sc.next();
      String y= sc.next();
      char[]a=x.toCharArray();
      char[]b = y.toCharArray();
      Arrays.sort(a);
      Arrays.sort(b);
      if (Arrays.equals(a,b)) {
        System.out.println("Anagram");
      }
      else {
        System.out.println("Not Anagram");
      }
      }
}
