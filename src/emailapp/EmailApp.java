package emailapp;

public class EmailApp {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private String alternateEmailaddress;

    public String getPassword() {
        return password;
    }

    public String getDepartment() {
        return department;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getAlternateEmailaddress() {
        return alternateEmailaddress;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setMailboxCapacity(int mailboxCapacity) {
        this.mailboxCapacity = mailboxCapacity;
    }

    public void setAlternateEmailaddress(String alternateEmailaddress) {
        this.alternateEmailaddress = alternateEmailaddress;
    }

    public String generatePassword()
    {
        return password;
    }
}
