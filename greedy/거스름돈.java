/**
 금액을 입력받은 후 우리나라 화폐종류별로 해당 갯수를 표기하는 프로그램
#     * [요구사항] 금융업을 하는 고객사로부터 프로그램 개발요청이 들어왔습니다.
#     * 금액을 입력받은 후 우리나라 화폐종류별로 해당 갯수를 표기하는 프로그램입니다.
#     * 예를들어, 125,520 원을 입력하면 화면에 이렇게 보이게 하면 됩니다.
#     * 표시하고 10원미만은 절삭
#           ##화폐교환###
#       ******************************************************
#          요청금액 : 126520 원
#          5만원 : 2매
#          1만원 : 2매
#          5천원 : 1매
#          1천원 : 1매
#          5백원 : 1개
#          백원 : 0개
#          오십원 : 0개
#          십원 : 2개
#       ********************************************************
 */

package greedy;

import java.util.Scanner;

class 거스름돈 {
    public static void main(String[] args) {
        거스름돈 solution = new 거스름돈();
        Scanner scanner = new Scanner(System.in);
        System.out.print("요청금액: ");
        int money = scanner.nextInt();
        System.out.println(solution.solution(money));
        scanner.close();
    }

    String solution(int money) {
        String title = "\n  ###거스름돈### ";
        String astar = "**************************";
        return String.format("%s\n%s\n  요청금액: %d\n%s", title,astar,money,astar);
    }
}
