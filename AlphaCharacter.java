package GroupProject2;

public class AlphaCharacter {
    //2.Find out how many alpha characters are present in a string?
    public static void main(String[] args) {
        String S="abr35ac12adabra alkaz&5$@oom";
        int count=0;
        for (int i = 0; i < S.length(); i++) {
            if (Character.isLetter(S.charAt(i))){
                count++;
            }
        }
        System.out.println(count);


        
        

    }
}
