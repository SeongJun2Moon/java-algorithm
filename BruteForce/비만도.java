// """
//     키와 몸무게를 입력받아서 비만도를 측정하는 프로그램을 완성하시오.
// BMI 지수를 구하는 공식은 다음과 같다.
// BMI지수 = 몸무게(70kg) / (키(1.7m) * 키(1.7m))

// BMI 지수에 따른 결과는 다음과 같다.
// 고도 비만 : 35 이상
// 중(重)도 비만 (2단계 비만) : 30 - 34.9
// 경도 비만 (1단계 비만) : 25 - 29.9
// 과체중 : 23 - 24.9
// 정상 : 18.5 - 22.9
// 저체중 : 18.5 미만


// 이름, 키, 몸무게를 입력받으면 다음과 같이 출력되도록 하시오.

// ### 비만도 계산 ###
// ***************************
// 이름 키(cm) 몸무게(kg) 비만도
// ***************************
// 홍길동 170 79 정상
// ***************************
// """;

package BruteForce;

import java.util.Scanner;

class 비만도 {
    public static void main(String[] args) {
        비만도 solution = new 비만도();
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름: ");
        String name = scanner.next();
        System.out.print("몸무게: ");
        float kg = scanner.nextFloat();
        System.out.print("키: ");
        float cm = scanner.nextFloat();
        String biman = "";
        float bmi = kg/(cm*cm/10000);
        if (bmi >= 35) {
            biman = "고도비만";
        } else if (bmi <= 34.9 & bmi >= 30) {
            biman = "중(重)도 비만 (2단계 비만)";
        } else if (bmi <= 29.9 & bmi >= 25) {
            biman = "경도 비만 (1단계 비만)";
        } else if (bmi <= 24.9 & bmi >= 23) {
            biman = "과체중";
        } else if (bmi <= 22.9 & bmi >= 18.5) {
            biman = "정상";
        } else {
            biman = "저체중";
        }
        System.out.println(solution.solution(name,kg,cm,biman));
        scanner.close();
    }

    String solution(String name, float kg, float cm, String biman) {
        String title = " ### 비만도 계산 ### ";
        String aster = "******************************";
        String schema = "이름 키(cm) 몸무게(kg) 비만도";
        String value = String.format("%s %.1f %.1f %s", name,kg,cm,biman);
        return String.format("%s\n%s\n%s\n%s\n%s\n%s", aster,title,aster,schema,aster,value,aster);
    }
}
