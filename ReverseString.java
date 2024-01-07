package GroupProject2;

public class ReverseString {
    //3. Reverse a String: Write a function to reverse a given string. For example,
    //given the input "Hello", the output should be "olleH"
    public static void main(String[] args) {
        String str = "Hello";

        StringBuilder r = new StringBuilder(str);
        String reverseStr = r.reverse().toString();
        System.out.println("Reverse string: " + reverseStr);

           }

    }

