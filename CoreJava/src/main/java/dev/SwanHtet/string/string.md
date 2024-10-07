# Java String Processing Example

This README explains a Java code example that demonstrates various string processing operations. The code showcases common string manipulations and provides a practical understanding of how to work with strings in Java.

## Code Overview

The main class `StringProcessor` contains a `main` method that performs different string operations on a sample text. Here's the complete code:

```java
public class StringProcessor {
    public static void main(String[] args) {
        String text = "Java String Processing";
        
        // Length
        System.out.println("Length: " + text.length());
        
        // Uppercase and Lowercase
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());
        
        // Substring
        System.out.println("Substring (0, 4): " + text.substring(0, 4));
        
        // Split
        String[] words = text.split(" ");
        System.out.println("Words: ");
        for (String word : words) {
            System.out.println("- " + word);
        }
        
        // Replace
        System.out.println("Replaced 'i' with '1': " + text.replace('i', '1'));
        
        // Contains
        System.out.println("Contains 'Processing': " + text.contains("Processing"));
        
        // StringBuilder for efficient string concatenation
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(word).append("-");
        }
        sb.setLength(sb.length() - 1);
        System.out.println("StringBuilder result: " + sb.toString());
    }
}