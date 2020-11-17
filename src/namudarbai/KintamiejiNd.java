package namudarbai;

import java.util.Arrays;

public class KintamiejiNd {
    public static void main(String[] args) {
        // Take your original array
        int[] masyvas = {-10, 0, 2, -9, -5};
        // Use the Arrays sort method to sort it into ascending order (note this mutates the array instance)
        Arrays.sort(masyvas);
        // Create a new array of the same length
        int[] minMaxSorted = new int[masyvas.length];
        // Iterate through the array (from the left and right at the same time)
        for (int i = 0, min = 0, max = masyvas.length - 1; i < masyvas.length; i += 1, min++, max--) {
            // the next minimum goes into minMaxSorted[i]
            minMaxSorted[i] = masyvas[min];
            // the next maximum goes into minMaxSorted[i + 1] ... but
            // guard against index out of bounds for odd number arrays
            if (i + 1 < minMaxSorted.length) {
                minMaxSorted[i + 1] = masyvas[max];
            }
        }
        System.out.println(Arrays.toString(minMaxSorted));
    }
}
