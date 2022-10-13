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

    int createRandomNumber() {
        return (int)(Math.random()*10)+1;
    }

    int[] createArray() {
        int[] arr = new int[10];
        for (int i=0;i<arr.length;i++) {
            arr[i] = createRandomNumber();
        }
        return arr;
    }

    int[] sortArray(int[] arr) {
        for (int i=0;i<arr.length;i++) {
            
        }
    }

    void printArray(int[] arr){
        String answer = "";
        for (int i=0;i<arr.length;i++) {
            answer+=arr[i]+"\t";
        }
        System.out.println(answer);
    }

}