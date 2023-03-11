import java.util.ArrayList;

/**
 * 2. Define a cluster in an integer array to be a maximum sequence of elements
 * that are all the same value. For example, in the array {3, 3, 3, 4, 4,
 * 3, 2, 2, 2, 2, 4} there are 5 clusters, {3, 3, 3}, {4, 4}, {3}, {2, 2, 2, 2}
 * and {4}. A cluster-compression of an array replaces each cluster with the
 * number that is repeated in the cluster. So, the cluster compression of the
 * previous array would be {3, 4, 3, 2, 4}. The first cluster {3, 3, 3} is
 * replaced by a single 3, and so on.
 * Write a function named clusterCompression with the following signature
 * If you are programming in Java or C#, the function signature is
 * int[ ] clusterCompression(int[ ] a)
 * If you are programming in C++ or C, the function signature is
 * int *clusterCompression(int a[ ], int len) where len is the length of the
 * array.The function returns the cluster compression of the array a. The length
 * of the returned array must be equal to the number of clusters in the origin
 * array! This means that someplace in your answer you must dynamically allocate
 * the returned array.
 * In Java or C# you can use
 * int[ ] result = new int[numClusters];
 * In C or C++ you can use
 * int *result = (int *)calloc(numClusters, sizeof(int));
 */

public class Cluster {
    public static int[] clusterCompression(int[] a) {
        int cachedElement;
        ArrayList<Integer> temp = new ArrayList<Integer>();
        if (a.length < 1) {
            return a;
        }
        cachedElement = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] != cachedElement) {
                temp.add(cachedElement);
                cachedElement = a[i];
            }
        }
        temp.add(cachedElement);
        int[] retArray = new int[temp.size()];
        for (int i = 0; i < temp.size(); i++) {
            retArray[i] = temp.get(i);
        }
        return retArray;
    }

    /*
     * This printArray method doesn't do anything on solving the problem.
     * It is just used to verify the output by printing the array using the format.
     */
    public static void printArray(int[] a) {
        System.out.print("{");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i < a.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("}");
        System.out.println();
    }

    public static void main(String[] args) {
        printArray(clusterCompression(new int[] { 3, 3, 3, 4, 4, 3, 2, 2, 2, 2, 4 }));
        printArray(clusterCompression(new int[] { 0, 0, 0, 2, 0, 2, 0, 2, 0, 0 }));
        printArray(clusterCompression(new int[] { 18 }));
        printArray(clusterCompression(new int[] {}));
        printArray(clusterCompression(new int[] { -5, -5, -5, -5, -5 }));
        printArray(clusterCompression(new int[] { 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1 }));
        printArray(clusterCompression(new int[] { 8, 8, 6, 6, -2, -2, -2 }));
    }
}