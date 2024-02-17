package Aggregation;
public class Textbook 
{
    // Fields
    private String title;
    private String author;
    private String publisher;

    // Constructor
    public Textbook(String title, String author, String publisher)
    {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    // Setter
    public void set_title(String title)
    {
        this.title = title;
    }
    public void set_author(String author) 
    {
        this.author = author;
    }
    public void set_publisher(String publisher) 
    {
        this.publisher = publisher;
    }

    // Getter
    public String get_title()
    {
        return this.title;
    }
    public String get_author() 
    {
        return this.author;
    }
    public String get_publisher() 
    {
        return this.publisher;
    }
}
