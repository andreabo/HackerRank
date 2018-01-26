import java.util.Arrays;
import java.util.Scanner;

public class MaxMin {
    static int angryChildren(int k, int[] arr) {
        // Complete this function
        Arrays.sort(arr);

        int[] arr1 = new int[k];

        for(int i = 0; i < k ; i++){
            arr1[i] = arr[i];
        }
        int max = arr1[(arr1.length)-1];
        int min = arr1[0];

        return (max - min);

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int result = angryChildren(k, arr);
        System.out.println(result);
        in.close();
    }
}
