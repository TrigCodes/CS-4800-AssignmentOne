package Inheritance;
public class SalariedEmployee extends Employee
{
    // Fields
    private double weekly_salary;

    // Constructor
    public SalariedEmployee(String first_name, String last_name, String ssn, double weekly_salary)
    {
        super(first_name, last_name, ssn);
        this.weekly_salary = weekly_salary;
    }

    // Setters
    public void set_weekly_salary(double weekly_salary) 
    {
        this.weekly_salary = weekly_salary;
    }

    // Getters
    public double get_weekly_salary() 
    {
        return this.weekly_salary;
    }
}