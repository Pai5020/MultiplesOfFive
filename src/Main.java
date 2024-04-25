import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        int count=0;

        System.out.println("Enter the values : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 5 != 0) {
                count++;
            }
        }
        int[] arr2 = new int[count];
        for(int j=0; j < count; j++){
            if(arr[j] % 5 != 0){
                arr2[j] = arr[j];

            }
        }

        System.out.println("Array after removing multiples of 5 : " + Arrays.toString(arr2));
    }
}