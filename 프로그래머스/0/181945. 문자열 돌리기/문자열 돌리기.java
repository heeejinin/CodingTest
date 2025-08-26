import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        char[] cArray = a.toCharArray();
        
        for(int i = 0; i < cArray.length; i++){
            System.out.println(cArray[i]);
        }
    }
}