package GroupProject2;

public class SwapString {
    //1. Write a program to swap 2 String without a temporary variable?
    public static void main(String[] args) {
        String str1="hello ";
        String str2="New Year 2024";
        System.out.println("Before swapping:  "+ str1 +" "+ str2);

        str1 =str1+str2;

        str2=str1.substring(0,str1.length()-str2.length());//str2 is now hello
        str1=str1.substring(str2.length());

        System.out.println( "After swapping: "+ str1+" "+str2);


    }

}
