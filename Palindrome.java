package GroupProject2;

public class Palindrome {
    //4. Check if a String is Palindrome: Determine whether a given string is a
    //palindrome, which means it reads the same forwards and backward. For
    //example, "madam" is a palindrome.
    public static void main(String[] args) {
        String S="madam";
        String reverseString="";
        for (int i = S.length()-1; i >=0; i--) {
            reverseString=reverseString+S.charAt(i);
        }
        if (S.equals(reverseString)){
            System.out.println("String is Palindrome");
        }else{
            System.out.println("String is not palindrome");
        }

    }
}
