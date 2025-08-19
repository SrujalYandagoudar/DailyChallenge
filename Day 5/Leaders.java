public class Leaders {
    public static void findLeaders(int[] arr, int n, int idx, int maxFromRight) {
        if (idx < 0) {
            return;
        }

        if (arr[idx] >= maxFromRight) {
            System.out.print(arr[idx] + " ");
            maxFromRight = arr[idx];
        }

        findLeaders(arr, n, idx - 1, maxFromRight);
    }

    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        int n = arr.length;

        findLeaders(arr, n, n - 1, Integer.MIN_VALUE);
    }
}
