package 수학;
import java.util.*;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        System.out.println("첫 번째 수: ");
        int a = scanner.nextInt();
        System.out.println("+, -, *, /, % : ");
        String b = scanner.next();
        System.out.println("두 번째 수: ");
        int c = scanner.nextInt();
        System.out.println(solution.solution(a,b,c));
    }

    String solution(int a,String b,int c) {
        String title = "hi";
        if(b.equals("+")){}
        else if(b.equals("-")){}
        else if(b.equals("*")){}
        else if(b.equals("/")){}
        else if(b.equals("%")){}
        else{}
        return title;
    }
}