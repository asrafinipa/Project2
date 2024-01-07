package GroupProject2;

public class NonRepeating {
    //9. Find the First Non-Repeating Character in a String: Given a string, find and
    //return the first non-repeating character. For example, in the string
    //"abracadabra", the first non-repeating character is 'c'.
    public static void main(String[] args) {
        String s="abracadabra";
        for (int i = 0; i < s.length(); i++) {

            boolean value=false;
            for (int j = i+1; j < s.length(); j++) {
                if (s.charAt(i)==s.charAt(j)){
                    value=true;
                }
            }
            if (!value){
                System.out.println(s.charAt(i));
                break;
            }
        }
        System.out.println(".......................");
        char characterArray[]= s.toCharArray();
        for (int i = 0; i < characterArray.length; i++) {
            if (s.lastIndexOf(characterArray[i])==s.indexOf(characterArray[i])){
                System.out.println("first non repeated character in string is  "+ characterArray[i]);
                break;
            }
        }

    }
}
