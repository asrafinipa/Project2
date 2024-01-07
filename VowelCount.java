package GroupProject2;

public class VowelCount {
    //6. Create a method to count how many vowels are present in a string
    //“documentation”


    public static void main(String[] args) {
        String s="documentation";


            int count=0;
            for (int i = 0; i < s.length(); i++) {
                char c=s.charAt(i);
                if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                    count++;
                }
            }
        System.out.println(count);
        }

        }




