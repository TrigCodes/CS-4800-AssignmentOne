package Composition;
public class File 
{
    // Fields
    private String name;

    // Constructor
    public File(String name)
    {
        this.name = name;
    }

    // Setters
    public void set_name(String name)
    {
        this.name = name;
    }

    // Getters
    public String get_name()
    {
        return this.name;
    }

    // Misc
    public void print() 
    {
        System.out.println(this.name);
    }
}
