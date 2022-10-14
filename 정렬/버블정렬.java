package 정렬;

import java.util.Arrays;

class 버블정렬 {
    public static void main(String[] args) {
        new 버블정렬().solution();
    }

    void solution() {
        int[] arr = createArray();
        arr = sortArray(arr);
        printArray(arr);
    }

    int randomNumber() {
        return (int)(Math.random()*10)+1;
    }

    int[] createArray() {
        int[]arr = new int[10];
        for (int i=0;i<arr.length;i++) {
            int temp = randomNumber();
            arr[i] = temp;
            for (int j=0;j<i;j++) {
                if (arr[i] == arr[j]) {
                    i--;
                }
            }
        }
        return arr;
    }

    int[] sortArray(int[] arr) {
        return arr;
    }

    void printArray(int[] arr){
        String answer = "";
        for (int i=0;i<arr.length;i++) {
            answer+=arr[i]+"\t";
        }
        System.out.println(answer);
    }

}