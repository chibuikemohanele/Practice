public class User{
    private String firstname;
    private String lastname;
    private String email;
    private String password;

    public User(){
    }

    public User (String f, String l, String e, String p){
        firstname = f;
        lastname = l;
        email = e;
        password = p;
    }

    public void setfirstname(String f){
        firstname = f;
    }

    public void setlastname(String l){
        lastname = l;
    }

    public void setemail(String e){
        email = e;
    }

    private int j;
    private int i;
    private String c;
    private char d;
    private int uppercase = 0;
    private int lowercase = 0;
    private int number = 0;
    private int specialchar = 0;

    public void setpassword(String p){
        password = p;
        j = p.length();

        for (i = 0; i < j; i++) {
            c = p.substring(i, i + 1);
            d = p.charAt (i);
            if (c.toUpperCase() == c) 
                uppercase = 1;
            else
                lowercase = 1;
            if (Character.isDigit(d))
                number = 1;
            if (c.matches(".*[!@#$%^&].*"))
                specialchar = 1;
            }
        if ((uppercase == 1) && (lowercase == 1) && (number == 1) && (specialchar == 1))
            System.out.println ("Password changed.");
        else {
            System.out.println ("The password is not valid. Must include an Uppercase letter, "
                                + "Lowercase letter, a number, and a special character.");
            password = p;
                            }
    }

    public String toString(){
        return (firstname + " " + lastname + " " +
            "\nEmail: " + email + " \nPW: " + password);
    }

}