public class Experiment {
    Sorter sorter = new Sorter();
    Searcher searcher = new Searcher();

    public long measureSortTime(int[] arr, String type) {

        long start = System.nanoTime();

        if (type.equals("basic")) {
            sorter.basicSort(arr);
        } else {
            sorter.advancedSort(arr);
        }

        long end = System.nanoTime();

        return end - start;
    }

    public long measureSearchTime(int[] arr, int target) {

        long start = System.nanoTime();

        searcher.search(arr, target);

        long end = System.nanoTime();

        return end - start;
    }

    public void runAllExperiments() {

        int[] sizes = {10, 100, 1000};

        for (int size : sizes) {

            System.out.println("\nArray size: " + size);

            int[] arr = sorter.generateRandomArray(size);
            int[] arrCopy = arr.clone();

            // Bubble Sort
            long bubbleTime = measureSortTime(arr, "basic");

            // Heap Sort
            long heapTime = measureSortTime(arrCopy, "advanced");

            // Search
            int target = arrCopy[size / 2];
            long searchTime = measureSearchTime(arrCopy, target);

            System.out.println("Bubble Sort time: " + bubbleTime);
            System.out.println("Heap Sort time: " + heapTime);
            System.out.println("Linear Search time: " + searchTime);
        }
    }
}
