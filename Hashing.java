import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Hashing {
    public static void main(String[] args) {
        String count;
        System.out.println("enter the string: ");
        Scanner sc = new Scanner(System.in);
        count =  sc.next();
        countLetters(count);
        countingNumbers(1231);
    }
    public static void countLetters(String s){
        int[] hash =  new int[26];
        int characters = 'a';
        for(int i = 0;i < s.length() ; i++){
            int charAtIndex=s.charAt(i);
            hash[charAtIndex-'a']++;
        }
        for (int i=0;i <26;i++) {
            System.out.println("the number of occurences of " + (char)characters++ +" is: "+hash[i]);
        }
        for(int i=0;i<s.length();i++){
            int charAtIndex=s.charAt(i);
            System.out.println("the number of occurences of " + s.charAt(i) + " is: "+ hash[charAtIndex-'a']);
        }
    }
    public static void countingNumbers(int x) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>() {{
            for (int i = 0; i < 10; i++) {
                put(i, 0);
            }
        }};
        String s = String.valueOf(x);
        for (int i = 0; i < s.length(); i++) {
            int digit = Character.getNumericValue(s.charAt(i));
            map.put(digit, map.get(digit) + 1);
        }
        System.out.println("Occurrences of digits in x are: ");
        HashSet<Integer> uniqueDigits = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            int digit = Character.getNumericValue(s.charAt(i));
            if (!uniqueDigits.contains(digit)) {
                System.out.println("Digit " + digit + " occurs " + map.get(digit) + " times.");
                uniqueDigits.add(digit);
            }
        }
    }
}
