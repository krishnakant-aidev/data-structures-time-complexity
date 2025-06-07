package complexity.timeComplexity;

public class LinearTimeComplexity {
    public static void main(String[] args) {
        int[] exampleArr = {5, 3, 9, 1, 6}; // Example array to test functions

        // Uncomment the line below to test array traversal
        // traverseArray(exampleArr);

        // Call function to find the largest number in the array
        findLargest(exampleArr);
    }

    /**
     * Example 1: Traversing an Array
     * Time Complexity: O(n) - Linear time
     * Explanation: This method loops through the array once, printing each element.
     * As the size of the array increases, the number of operations increases linearly.
     */
    private static void traverseArray(int[] exampleArr) {
        for (int i = 0; i < exampleArr.length; i++) {
            System.out.println("Element at index " + i + ": " + exampleArr[i]);
        }
    }

    /**
     * Example 2: Finding the Largest Number in an Array
     * Time Complexity: O(n) - Linear time
     * Explanation: This method iterates through the array once to find the maximum value.
     * It maintains a variable to keep track of the largest number encountered so far.
     */
    private static void findLargest(int[] exampleArr) {
        // Check if the array is empty to avoid errors
        if (exampleArr.length != 0) {
            int largestNum = exampleArr[0]; // Assume the first element is the largest initially

            // Iterate from the second element onward
            for (int i = 1; i < exampleArr.length; i++) {
                if (largestNum < exampleArr[i]) {
                    largestNum = exampleArr[i]; // Update if a larger number is found
                }
            }

            System.out.println("Largest number is: " + largestNum);
        } else {
            System.out.println("Array is empty");
        }
    }
}
