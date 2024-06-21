package Java.Module_23;

public class seventh {
    public static void main(String[] args) {
        // Original string
        String input = "Hello have a good day.";
        
        // Remove consonants
        String result = removeConsonants(input);
        
        // Print the result
        System.out.println("Original string: " + input);
        System.out.println("String after removing consonants: " + result);
    }
    
    // Function to remove consonants from a string
    public static String removeConsonants(String input) {
        StringBuilder sb = new StringBuilder();
        String vowels = "aeiouAEIOU"; // Define vowels
        
        // Iterate through each character in the input string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            
            // Check if the character is a vowel or space
            if (vowels.indexOf(ch) != -1 || ch == ' ') {
                sb.append(ch); // Append vowels and spaces to result
            }
        }
        
        return sb.toString(); // Return the resulting string without consonants
    }

    
}
