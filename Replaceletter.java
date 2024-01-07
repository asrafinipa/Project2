package GroupProject2;

public class Replaceletter {
    //8. You have a list of strings, you want to keep only those that start with
    //“A” and you want to return them in lower case.
    public static void main(String[] args) {
        String [] strings={"Apple","Airplane","boat","california", "Sunny","Display","Access"};
        for (String s:strings){
            if (s.startsWith("A")){
                System.out.println(s.toLowerCase());
            }
        }
    }
}
