package assignments;

public class Assignment16 {

	public static void main(String[] args) {
		String paragraph = "Java is a popular programming language. Java is used for web "
                + "development, mobile applications, and more.";

        // Convert paragraph to lowercase (optional for uniform comparison)
        String cleanText = paragraph.toLowerCase();

        // Remove punctuation
        cleanText = cleanText.replaceAll("[^a-zA-Z ]", "");

        // Split into words
        String[] words = cleanText.split("\\s+");

        // Map to store frequency
        java.util.Map<String, Integer> freq = new java.util.HashMap<>();

        // Map to store indexes of each word
        java.util.Map<String, java.util.List<Integer>> indexes = new java.util.HashMap<>();

        // Process each word
        for (int i = 0; i < words.length; i++) {

            String w = words[i];

            // Count occurrences
            freq.put(w, freq.getOrDefault(w, 0) + 1);

            // Store indexes
            indexes.putIfAbsent(w, new java.util.ArrayList<>());
            indexes.get(w).add(i);  // index position
        }

        // Print results
        System.out.println("Word  | Count | Indexes");
        System.out.println("---------------------------");

        for (String w : freq.keySet()) {
            System.out.println(w + " | " + freq.get(w) + " | " + indexes.get(w));
        }
    }

	}

