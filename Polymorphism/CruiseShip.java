package Polymorphism;
public class CruiseShip extends Ship
{
    // Fields
    private int max_passengers;

    // Constructor
    public CruiseShip(String name, String make_year, int max_passengers)
    {
        super(name, make_year);
        this.max_passengers = max_passengers;
    }

    // Setters
    public void set_max_passengers(int max_passengers)
    {
        this.max_passengers = max_passengers;
    }

    // Getters
    public int get_max_passengers()
    {
        return this.max_passengers;
    }

    // Misc
    @Override
    public void print() 
    {
        System.out.println("Ship Name: " + super.get_name());
        System.out.println("Maximum Number of Passengers: " + this.max_passengers);
    }
}
