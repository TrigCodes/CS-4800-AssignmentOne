package Inheritance;
public class CommisionEmployee extends Employee 
{
    // Fields
    private double commision_rate;
    private double gross_salary;

    // Constructor
    public CommisionEmployee(String first_name, String last_name, String ssn, double commision_rate, double gross_sales)
    {
        super(first_name, last_name, ssn);
        this.commision_rate = commision_rate;
        this.gross_salary = gross_sales;
    }

    // Setters
    public void set_commision_rate(double commision_rate)
    {
        this.commision_rate = commision_rate;
    }
    public void set_gross_sales(double gross_sales)
    {
        this.gross_salary = gross_sales;
    }

    // Getters
    public double get_commision_rate()
    {
        return this.commision_rate;
    }
    public double get_gross_salary()
    {
        return this.gross_salary;
    }
}
