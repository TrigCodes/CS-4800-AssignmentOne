package Inheritance;
public class BaseEmployee extends Employee 
{
    // Fields
    private double base_salary;

    // Constructor
    public BaseEmployee(String first_name, String last_name, String ssn, double base_salary)
    {
        super(first_name, last_name, ssn);
        this.base_salary = base_salary;
    }

    // Setters
    public void set_base_salary(double base_salary) 
    {
        this.base_salary = base_salary;
    }

    // Getters
    public double get_base_salary() 
    {
        return this.base_salary;
    }
}
