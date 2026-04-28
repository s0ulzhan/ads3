public class Searcher {
    public int search(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                return i; // нашли
            }

        }

        return -1; // не нашли
    }
}
