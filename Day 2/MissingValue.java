import java.util.Arrays;

public class MissingValue {

    public void mValue(int idx, int arr[]) {
        if (idx >= arr.length - 1) {
            return;
        }

        if (arr[idx] + 1 != arr[idx + 1]) {
            System.out.println("Missing number is: " + (arr[idx] + 1));
            return;
        }

        mValue(idx + 1, arr);
    }

    public static void main(String[] args) {
        MissingValue mv = new MissingValue();
        int[] arr = {1, 2, 4, 5};

        Arrays.sort(arr);

        mv.mValue(0, arr);
    }
}
