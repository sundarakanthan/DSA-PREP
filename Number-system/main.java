public class main {
    public static void main(String[] args) {
        // oddOrEven(5);
        int[] arr = { 2, 2, 3, 3, 4, 7, 7, 5, 5 };
        // System.out.println(uniqueNum(arr));
        // nthBit(11101, 2);
        System.out.println(nthMagicNum(5));
    }

    public void oddOrEven(int n) {
        int res = n & 1;
        if (res == 1) {
            System.out.println("Odd number.");
        } else if (res == 0) {
            System.out.println("Even number.");
        } else {
            System.err.println("Invalid number.");
        }
    }

    public int uniqueNum(int arr[]) {
        int unique = 0;
        for (int n : arr) {
            unique ^= n;
        }
        return unique;
        // works only for one unique number and other occuring twice.
    }

    public static void nthBit(int binary, int n) {
        int result = (binary >> (n - 1)) & 1;
        System.out.println(result);
    }

    /*
     * Nth magic number is a problem asked in Amazon.
     * In this we have to raise the position value to the power of 5 whenever '1'
     * occurs and add them all.
     * Ex: n=2 -> 2 in binary is 10 so 1*(5^2) + 0* (5^1) = 25
     */
    public static int nthMagicNum(int n) {
        int ans = 0;
        int base = 5;
        int last = 0;
        while (n > 0) {
            last = n & 1;
            n = n >> 1;
            ans += last * base;
            base *= 5;
        }
        return ans;
        // Time complexity: O(log n)
        // Space complexity: O(1)
    }
}
