package LinkedList;

public class Website {

    public static final String WEB = ".com";
    private String siteName;
    private String userName;
    private String password;

    public Website()
    {
        siteName = " ";
        userName = " ";
        password = " ";
    }

    public Website(String site, String user,
                   String pass) {
        this.siteName = site;
        this.userName = user;
        this.password = pass;
    }

    public String getSiteName()
    {
        return siteName;
    }

    public String getUserName()
    {
        return userName;
    }

    public String getPassword()
    {
        return password;
    }

    public void setSiteName(String siteName)
    {
        this.siteName = siteName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String toString()
    {
        return siteName + WEB + "\t" + userName + "\t" + password;
    }


}
