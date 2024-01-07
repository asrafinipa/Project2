package GroupProject2;

import java.util.Arrays;

public class Anagram {
    //5. Check if Two Strings are Anagrams: Given two strings, determine if they
    //are anagrams, meaning they contain the same characters in a different order.
    //For example, "listen" and "silent" are anagrams
    public static void main(String[] args) {
            String s1="silent";
            String s2="listen";
            char [] c1=s1.toCharArray();
            char []c2=s2.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            System.out.println("Two strings are anagram,result "+Arrays.equals(c1,c2));
        }

    }

