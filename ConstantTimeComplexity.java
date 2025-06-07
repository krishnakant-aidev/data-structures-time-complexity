package complexity.timeComplexity;

import java.util.HashMap;

public class ConstantTimeComplexity {

    public static void main(String[] args) {
        int[] arr = {5, 10, 15};

        // Example 1: Accessing an array element by index
        System.out.println("Example 1 - Access by index: " + accessArrayByIndex(arr, 1));

        // Example 2: Working with a hash table (HashMap)
        hashTableExample();

        // Example 3: Returning a fixed result
        int result = returnFixedResult();
        System.out.println("Example 3 - Fixed result: " + result);
    }

    /**
     * Example 1: Accessing an array element by index
     * Time Complexity: O(1) - Constant time
     * Explanation: Accessing any element in an array using its index takes the same amount of time,
     * regardless of the size of the array.
     */
    private static int accessArrayByIndex(int[] exampleArr, int index) {
        return exampleArr[index];
    }

    /**
     * Example 2: Inserting and looking up values in a HashMap
     * Time Complexity: O(1) average case - Constant time
     * Explanation:
     * - Inserting a key-value pair into a HashMap is a constant-time operation (on average).
     * - Looking up a value by its key also takes constant time.
     */
    private static void hashTableExample() {
        // Create a HashMap (acts like a hash table)
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Insert key-value pairs (average time complexity O(1))
        hashMap.put("apple", 3);
        hashMap.put("banana", 5);
        hashMap.put("orange", 2);

        // Lookup a value by key (average time complexity O(1))
        String keyToFind = "banana";
        if (hashMap.containsKey(keyToFind)) {
            int value = hashMap.get(keyToFind);
            System.out.println("Value for key '" + keyToFind + "': " + value);
        } else {
            System.out.println("Key not found: " + keyToFind);
        }
    }

    /**
     * Example 3: Returning a fixed result
     * Time Complexity: O(1) - Constant time
     * Explanation: The method performs no computations, just returns a constant value.
     */
    private static int returnFixedResult() {
        return 454;
    }
}