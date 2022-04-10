import java.util.Scanner;

public class middle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[40];
        int i = 0;
        int num = 0;
        int last = 0; // 마지막 인덱스 값을 구하기 위해
        int max_index = 0; // max값 인덱스와 마지막 인덱스 변경을 위해
        int max = 0; // 최댓값이 얼마인지 구하기 위함
        int box = 0;
        while (true) {
            num = sc.nextInt();
            if (num != 0) {
                arr[i] = num;
                last = i;
            } else {
                break;
            }
            if (arr[i] > max) {
                max_index = i;
            }
            i++;
        }
        box = arr[last];
        arr[last] = arr[max_index];
        arr[max_index] = box;
        for (int j = 0; i < last; i++) {
            System.out.println(arr[i]);
        }

    }
}