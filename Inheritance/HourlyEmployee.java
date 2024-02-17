package Inheritance;
public class HourlyEmployee extends Employee
{
    // Fields
    private double wage;
    private int hours_worked;

    // Constructor
    public HourlyEmployee(String first_name, String last_name, String ssn, double wage, int hours_worked)
    {
        super(first_name, last_name, ssn);
        this.wage = wage;
        this.hours_worked = hours_worked;
    }

    // Setters
    public void set_wage(double wage)
    {
        this.wage = wage;
    }
    public void set_hours_worked(int hours_worked)
    {
        this.hours_worked = hours_worked;
    }

    // Getters
    public double get_wage()
    {
        return this.wage;
    }
    public int get_hours_worked()
    {
        return this.hours_worked;
    }
}
