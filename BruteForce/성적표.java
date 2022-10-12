// """
// 국어. 영어, 수학점수를 입력받아서 학점을 출력하는 프로그램을 완성하시오.
// 각 과목 점수는 0 ~ 100 사이이다.
// 평균에 따라 다음과 같이 학점이 결정된다
// 90이상은 A학점
// 80이상은 B학점
// 70이상은 C학점
// 60이상은 D학점
// 50이상은 E학점
// 그 이하는 F학점

// 출력되는 결과는 다음과 같다.

// ### 성적표 ###
// ********************************
// 이름 국어 영어 수학 총점 평균 학점
// *******************************
// 홍길동 90 90 92 272 90.6 A
// ********************************
// """

package BruteForce;

import java.util.*;

class 성적표 {
    public static void main(String[] args) {
        성적표 solution = new 성적표();
        Scanner scanner = new Scanner(System.in);
        System.out.print("국어: ");
        int lan = scanner.nextInt();
        System.out.print("영어: ");
        int eng = scanner.nextInt();
        System.out.print("수학: ");
        int math = scanner.nextInt();
        System.out.println(solution.solution(lan, eng, math));
        scanner.close();
        
    }

    String solution(int lan, int eng, int math) {
        String title = "###성적표###";
        String name = "문성준";
        int total = lan + eng + math;
        float avg = total/3;
        String grade = "";
        if(avg >= 90){
            grade = "A";
        } else if(avg < 90 & avg >= 80){
            grade = "B";
        } else if(avg < 80 & avg >= 70){
            grade = "C";
        } else if(avg < 70 & avg >= 60){
            grade = "D";
        } else {
            grade = "F";
        }
        return String.format("%s\n****************************************************************\n이름 국어 영어 수학 총점 평균 학점\n****************************************************************\n이름:%s 국어:%d 영어:%d 수학:%d 총점:%d 평균:%.1f 학점:%s\n****************************************************************", title,name,lan,eng,math,total,avg,grade);

    }
}
