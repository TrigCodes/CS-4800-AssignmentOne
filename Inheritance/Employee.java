package Inheritance;
public class Employee
{
    // Fields
    private String first_name;
    private String last_name;
    private String ssn;

    // Constructor
    public Employee(String first_name, String last_name, String ssn)
    {
        this.first_name = first_name;
        this.last_name = last_name;
        this.ssn = ssn;
    }

    // Setters
    public void set_first_name(String first_name)
    {
        this.first_name = first_name;
    }
    public void set_last_name(String last_name) 
    {
        this.last_name = last_name;
    }
    public void set_ssn(String ssn) 
    {
        this.ssn = ssn;
    }

    // Getters
    public String get_first_name()
    {
        return this.first_name;
    }
    public String get_last_name() 
    {
        return this.last_name;
    }
    public String get_ssn() 
    {
        return this.ssn;
    }
}