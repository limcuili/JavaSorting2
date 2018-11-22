// compile with 'javac CountingSort.java'
// run with 'java CountingSort'

class CountingSort {

    static void printArray (int[] x) {
        for (int i=0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
    }

    static void countingSort (int[] x) {
        int max = 0;
        // determine the max. entry in x
        for (int i = 0; i < x.length; i++) {
            if (x[i] > max) { max = x[i]; };
        }
        // c records how often each value appears in x
        int[] c = new int[max+1];
        for (int i = 0; i < x.length; i ++) {
            c[x[i]]++;
        }
        int j = 0;
        for (int i = 0; i <x.length; i++) {
            while (c[j] == 0) {
                j++;
            }
            x[i] = j;
            c[j]--;
        }
    }

    public static void main (String[] args) {
        //test 1
        int[] x = {1,3,4,6,2,4,6,1,4,8};
        System.out.print("Test Array 1: ");
        printArray(x);
        System.out.println("");
        System.out.print("Sorted Array 1: ");
        countingSort(x);
        printArray(x);
        System.out.println("");
        System.out.println("");

        // test 2
        int [] y = {7,4,19,2,16,27,10,6,8,1,18};
        System.out.print("Test Array 2: ");
        printArray(y);
        System.out.println("");
        System.out.print("Sorted Array 2: ");
        countingSort(y);
        printArray(y);
    }

}
