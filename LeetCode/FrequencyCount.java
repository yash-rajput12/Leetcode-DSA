import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int p = sc.nextInt();

        Map<Character, Integer> freq = new HashMap<>();

        for(char ch : s.toCharArray()){
            freq.put(ch, freq.getOrDefault(ch,0) + 1);
        }

        TreeSet<Character> candidates = new TreeSet<>();

        for(Map.Entry<Character,Integer> entry : freq.entrySet()){
            if(entry.getValue() >= p){
                candidates.add(entry.getKey());
            }
        }

        if(candidates.isEmpty()){
            System.out.println();
            return;
        }

        char smallestChar = candidates.first();

        for(char ch : s.toCharArray()){
            if(ch == smallestChar){
                System.out.println(ch);
                break;
            }
        }
    }
}
