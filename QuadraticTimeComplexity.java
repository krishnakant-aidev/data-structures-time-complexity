package complexity.timeComplexity;

public class QuadraticTimeComplexity {

    public static void main(String[] args) {
        int[] exampleArr = {1, 3, 2, 50, 2};

        // Example: Find and print all possible pairs in the array
        findAllPairs(exampleArr);
    }

    /**
     * Example: Nested Loops to Find All Pairs
     * Time Complexity: O(n^2) - Quadratic time
     * Explanation:
     * - For each element in the array (outer loop), the inner loop runs through all elements again.
     * - This results in n * n = n² total operations.
     * - Quadratic time complexity grows rapidly with input size.
     *
     * Use Case: Useful for brute-force approaches such as:
     * - Comparing every pair
     * - Checking for duplicates
     * - Basic simulations or permutations
     */
    private static void findAllPairs(int[] exampleArr) {
        for (int i = 0; i < exampleArr.length; i++) {
            for (int j = 0; j < exampleArr.length; j++) {
                System.out.println("Pair: (" + exampleArr[i] + ", " + exampleArr[j] + ")");
            }
        }
    }
}