import java.util.*;

public class Main {

    public static String addValueToChars(String str, int val) {

        StringBuilder result = new StringBuilder();

        for(char ch : str.toCharArray()) {

            if(Character.isLowerCase(ch))
                result.append((char)((ch - 'a' + val) % 26 + 'a'));

            else if(Character.isUpperCase(ch))
                result.append((char)((ch - 'A' + val) % 26 + 'A'));

            else if(Character.isDigit(ch))
                result.append((char)((ch - '0' + val) % 10 + '0'));

            else
                result.append(ch == '@' ? '#' : '@');
        }

        return result.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int val = sc.nextInt();

        System.out.println(addValueToChars(str, val));
    }
}
