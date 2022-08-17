public class RemDup {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 1, 2, 2, 2, 3, 3, 4, 5, 5, 5 };
        System.out.println(removeDuplicates(arr));
    }

    static int removeDuplicates(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (i < arr.length && arr[i] == arr[i + 1]) {
                continue;
            }
            arr[count] = arr[i];
            count++;
        }
        return count;
    }

}
