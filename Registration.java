package GroupProject2;

public class Registration {
    /*
    14. Create Registration Class in which you would have variables such as email,
userName and password that have an access scope only within its own class.
After creating an object of the class, the user should be able to call methods
and in each method separately pass values to set users email, username and
password.
Requirements:
● Valid email consider to be only yahoo
● Valid userName and password cannot be empty and should be of
length larger than 6 characters. Also, valid passwords cannot contain
userName*/

    private String email;
    private String userName;
    private String password;



    public String getEmail(){
        return this.email;
    }
    public void setEmail(String x) {
        this.email = x;
    }
    public String getUserName(){
        return this.userName;
    }
    public void setUserName(String userName){
        this.userName=userName;
        if (!userName.isEmpty()){
            if (userName.length()>6){
                if (!userName.equals(password)){
                    System.out.println("username is valid: "+userName);
                }

            }
        }else {
            System.out.println("username is not valid");
        }
    }
    public String getPassword(){
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        if (!password.isEmpty()){
            if (password.length()>6){
                if (!password.equals(userName)){
                    System.out.println("password is valid: "+password);
                }
            }
        }else{
            System.out.println("password is not valid ");
        }
    }
    public  void Email(String email){
        this.email=email;
        if (email.contains("yahoo")){
            System.out.println("email add is "+email);
        }
    }
    public static void main(String[] args) {
        Registration r=new Registration();
        r.Email("abcd@yahoo.com");
        r.setUserName("fahmida");
        r.setPassword("1234dfg");



    }


}
