package bank;

class Account {
    public String name;
    protected String email;
    private String password;

    public String getpassword() {
        return this.password;
    }

    public void setpassword(String pass) {
        this.password = pass;
    }
}

public class bank {
    public String name;

    public static void main(String args[]) {
        Account account1 = new Account();
        account1.name = "abhishek";
        account1.email = "abhishek@gmail.com";
        account1.setpassword("abcd");
        System.out.println(account1.getpassword());
    }
}
