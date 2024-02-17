package Polymorphism;
public class Ship 
{
    // Fields
    private String name;
    private String make_year;

    // Constructor
    public Ship(String name, String make_year)
    {
        this.name = name;
        this.make_year = make_year;
    }

    // Setters
    public void set_name(String name)
    {
        this.name = name;
    }
    public void set_make_year(String make_year)
    {
        this.make_year = make_year;
    }

    // Getters
    public String get_name()
    {
        return this.name;
    }
    public String get_make_year()
    {
        return this.make_year;
    }

    // Misc
    public void print() 
    {
        System.out.println("Ship Name: " + name);
        System.out.println("Year Built: " + make_year);
    }
}