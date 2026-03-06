import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Read input from user
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        
        // Split the line into words
        String[] words = line.trim().split("\\s+");
        
        // Create a HashMap to store word frequencies
        HashMap<String, Integer> frequencyMap = new HashMap<>();
        
        // Count the frequency of each word
        for (String word : words) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }
        
        // Print the unique words and their counts
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        scanner.close();
    }
}