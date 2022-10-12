/**
 금액을 입력받은 후 우리나라 화폐종류별로 해당 갯수를 표기하는 프로그램
#     * [요구사항] 금융업을 하는 고객사로부터 프로그램 개발요청이 들어왔습니다.
#     * 금액을 입력받은 후 우리나라 화폐종류별로 해당 갯수를 표기하는 프로그램입니다.
#     * 예를들어, 125,520 원을 입력하면 화면에 이렇게 보이게 하면 됩니다.
#     * 표시하고 10원미만은 절삭
        ### 출장비 지급표 ###
      ********************************************************
        이름 출장비 오만원 만원 오천원 천원 오백원 백원 오십원 십원
      *********************************************************
        엄철식 539620 10 3 1 4 1 1 0 2
      *********************************************************
 */

package greedy;

import java.util.Scanner;

class 거스름돈 {
    public static void main(String[] args) {
        거스름돈 solution = new 거스름돈();
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름: ");
        String name = scanner.next();
        System.out.print("요청금액: ");
        int money = scanner.nextInt();
        System.out.println(solution.solution(name,money));
        scanner.close();
    }

    String solution(String name, int money) {
        String title = "\n  ### 출장비 지급표 ### ";
        String astar = "******************************************************************************";
        String header = "이름  출장비  오만원  만원  오천원  천원  오백원  백원  오십원  십원";
        int[]unit = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
        int mok = 0;
        int nmg = 0;
        String result = "";
        int money2 = money;
        for (int i=0;i<unit.length;i++) {
            mok = money / unit[i];
            nmg = money % unit[i];
            money = nmg;
            result += mok+"\t";
        };
        return String.format("  %s\n%s\n%s\n%s\n%s %d%s\n%s", title,astar,header,astar,name,money2,result,astar);
    }
}
