package GroupProject2;

public class CountWords {
    //7. Count the Number of Words in a String: Write a function to count the
    //number of words in a given string. Words are separated by spaces or
    //punctuation. For example, the input "Hello, world!" should return 2.
    public static void main(String[] args) {
        String s = "Hello, World! How is everything?";
        int count = s.split("\\s").length;
        System.out.println(count);
    }
    }

