// compile with 'javac QuickSort.java'
// run with 'java QuickSort'

class QuickSort {

    static void printArray (int[] x) {
        for (int i=0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
    }

    // rearrange the subarray x[start],..., x[end-1]
    static int reorder (int[] x, int start, int end) {
        int pivot = x[start];
        int pivotPosition = start;
        for (int i = start + 1; i < end; i++) {
            if (x[i] <= pivot) {
                x[pivotPosition] = x[i];
                x[i] = x[pivotPosition + 1];
                x[pivotPosition + 1] = pivot;
                pivotPosition++;
            }
        }
        return pivotPosition;
    }

    // sort the elements x[start],..., x[end-1]
    static void quickSort (int[] x, int start, int end) {
        if (start < end-1) {
            int pivotPosition = reorder(x,start,end);
            quickSort(x, start, pivotPosition);
            quickSort(x, pivotPosition+1, end);
        }
    }

    static void quickSort (int[] x) { quickSort(x,0,x.length); }

    public static void main (String[] args) {
        //test 1
        int[] x = {1,3,4,6,2,4,6,1,4,8};
        System.out.print("Test Array 1: ");
        printArray(x);
        System.out.println("");
        System.out.print("Sorted Array 1: ");
        quickSort(x);
        printArray(x);
        System.out.println("");
        System.out.println("");

        // test 2
        int [] y = {7,4,19,2,16,27,10,6,8,1,18};
        System.out.print("Test Array 2: ");
        printArray(y);
        System.out.println("");
        System.out.print("Sorted Array 2: ");
        quickSort(y);
        printArray(y);

    }
}
