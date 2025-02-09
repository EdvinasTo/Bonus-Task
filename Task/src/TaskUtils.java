public class TaskUtils {
    public String compress(String string) {

        // return if string is empty
        if (string.isEmpty()) return "";
        
        StringBuilder compressed = new StringBuilder();
        char previous = string.charAt(0);
        int count = 1;

        for (int i = 1; i < string.length(); i++) {
            char current = string.charAt(i);

            if (current == previous) {
                count++; // simply increment the count by one
            }

            else {
                compressed.append(previous).append(count);  // append the character and the count of repeated characters
                count = 1;                                  // reset the count back to 1
                previous = current;                         // change previous character to the current's value
            }
        }

        // append the last character and it's consecutively repeated count 
        compressed.append(previous).append(count);
        return compressed.toString();
    }

    public String decompress(String compressed) {
        if (compressed.isEmpty()) return "";

        StringBuilder decompressed = new StringBuilder();
        int i = 0;
        
        while (i < compressed.length()) {
            char character = compressed.charAt(i);  // store the character because we will increment the index
            i++;

            int count = 0;

            // handling the possibility of characters repeating beyond one digit count
            while (i < compressed.length() && Character.isDigit(compressed.charAt(i))) {
                count = count * 10 + (compressed.charAt(i) - '0');
                i++;
            }

            // append the repeated character sequence 
            decompressed.append(String.valueOf(character).repeat(count));
        }

        return decompressed.toString();
    }
}