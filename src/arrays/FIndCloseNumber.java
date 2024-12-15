    package arrays;

    import java.util.Scanner;

    public class FIndCloseNumber {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int k = sc.nextInt();
            int res= arr[0];

            for(int x: arr){
                if(Math.abs(res - k)> Math.abs(x-k) || (Math.abs(res - k) == Math.abs(x-k) && x<res)){
                    res=x;
                }
            }
            System.out.println(res);
        }
    }
