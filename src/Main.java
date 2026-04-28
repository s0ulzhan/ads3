public class Main {
   /* public static void main(String[] args) {

        Sorter sorter = new Sorter();

        int[] arr = sorter.generateRandomArray(10);

        System.out.println("Before:");
        sorter.printArray(arr);

        //sorter.basicSort(arr);

        sorter.advancedSort(arr);

        System.out.println("After:");
        sorter.printArray(arr);
    } */

    /* public static void main(String[] args) {

       Sorter sorter = new Sorter();
       Searcher searcher = new Searcher();

       int[] arr = sorter.generateRandomArray(10);

       sorter.printArray(arr);

       int target = arr[3];

       int index = searcher.search(arr, target);

       System.out.println("Target: " + target);
       System.out.println("Found at index: " + index);
   }*/

    public static void main(String[] args) {

        Experiment experiment = new Experiment();

        experiment.runAllExperiments();
    }

}