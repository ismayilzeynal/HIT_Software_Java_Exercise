public class Book 
{
    private String title;
    private String authorFirstName;
    private String authorLastName;

    public Book(String title, String authorFirstName, String authorLastName) 
    {
        this.title = title;
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
    }

    public String getTitle() 
    {
        return title;
    }

    public String getAuthorFirstName() 
    {
        return authorFirstName;
    }

    public String getAuthorLastName() 
    {
        return authorLastName;
    }

    public void setTitle(String title) 
    {
        this.title = title;
    }

    public void setAuthorFirstName(String authorFirstName) 
    {
        this.authorFirstName = authorFirstName;
    }

    public void setAuthorLastName(String authorLastName) 
    {
        this.authorLastName = authorLastName;
    }
}