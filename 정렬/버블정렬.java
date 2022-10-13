package 정렬;

import java.util.Arrays;

class 버블정렬 {
    public static void main(String[] args) {
        new 버블정렬().solution();
    }

    void solution() {
        int[] arr = createArray();
        int[] arr2 = bubbleSort(arr);
        print(arr2);
    }

    int createRandomNumber() {
        int randomNumber = (int)(Math.random()*100)+1;
        return randomNumber;
    }

    int[] createArray() {
        int[] arr = new int[10];
        for (int i=0; i<arr.length; i++) {
            arr[i] = createRandomNumber();
        }
        return arr;
    }

    int[] bubbleSort(int[] arr) {
        int[]arr2 = arr;
        Arrays.sort(arr2);
        return arr2;
    }

    void print(int[] arr){
        String title = "### 랜덤숫자 ###";
        String astar = "******************************";
        String answer = "";
        for (int i=0; i<arr.length; i++) {
            answer += "랜덤숫자: "+arr[i]+"\n";
        }
        String answer2 = String.format("%s\n%s\n%s%s", title,astar,answer,astar);
        System.out.println(answer2);
    }


}