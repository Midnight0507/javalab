import java.util.Arrays;
import java.util.Scanner;

class test7a {
    public static void main(String[] args) {
        System.out.println("Enter Array Size: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr;

        try {
            if (n > 0) {
                arr = new int[n];
            } else {
                throw new IllegalArgumentException();
            }
            
            System.out.println("Enter Array Elements: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            
            test7a rs = new test7a();
            int[] resultArr = rs.addition(arr);
            System.out.println(Arrays.toString(resultArr));
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid Argument");
        }
    }

    int[] addition(int[] a) {
        if (a == null || a.length == 0) {
            throw new IllegalArgumentException("Invalid Argument");
        }
        
        int[] result = new int[a.length];
        int sum = 0;
        
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            result[i] = sum;
        }
        
        return result;
    }
}
