package Polymorphism;
public class CargoShip extends Ship
{
    // Fields
    private int cargo_capacity;

    // Constructor
    public CargoShip(String name, String make_year, int cargo_capacity)
    {
        super(name, make_year);
        this.cargo_capacity = cargo_capacity;
    }

    // Setters
    public void set_cargo_capacity(int cargo_capacity) {
        this.cargo_capacity = cargo_capacity;
    }

    // Getters
    public int get_cargo_capacity() {
        return this.cargo_capacity;
    }

    // Misc
    @Override
    public void print() {
        System.out.println("Ship Name: " + super.get_name());
        System.out.println("Cargo Capacity: " + this.cargo_capacity);
    }
}