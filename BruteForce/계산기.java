package BruteForce;
import java.util.*;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫 번째 수: ");
        int a = scanner.nextInt();
        System.out.print("+, -, *, /, % : ");
        String b = scanner.next();
        System.out.print("두 번째 수: ");
        int c = scanner.nextInt();
        System.out.println(solution.solution(a,b,c));
        scanner.close();
    }

    String solution(int a,String b,int c) {
        String title = "###계산기### ";
        int answer = 0;
        if(b.equals("+")){answer = a + c;}
        else if(b.equals("-")){answer = a - c;}
        else if(b.equals("*")){answer = a * c;}
        else if(b.equals("/")){answer = a / c;}
        else if(b.equals("%")){answer = a % c;}
        else{System.out.println("그런거 없음.");}
        return String.format("%s \n %d %s %d = %d", title,a,b,c,answer);
    }
}