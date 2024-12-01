package binarySearchLessons;

import java.util.Scanner;

class BinarySearch {
    int binarySearch( int l, int r, int x) {
        while (l <= r) {
            int m = (l + r) / 2;

            if (m == x) {
                return m;

            } else if (m > x) {
                r = m - 1;

            } else {
                l = m + 1;
            }
        }

        // Element not found
        return -1;
    }

    public static void main(String args[]) {
        BinarySearch ob = new BinarySearch();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        int res = ob.binarySearch(n, 0,1000);

        if (res == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found: " + res);
    }
}
