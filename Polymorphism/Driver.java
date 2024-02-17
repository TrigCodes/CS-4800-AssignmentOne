package Polymorphism;
public class Driver 
{
    public static void main(String[] args) 
    {
        Ship[] ships = new Ship[3];

        ships[0] = new Ship("Ship", "1890");
        ships[1] = new CruiseShip("Cruise Ship", "2005", 1800);
        ships[2] = new CargoShip("Cargo Ship", "2050", 67000);

        for (Ship ship : ships) 
        {
            ship.print();
            System.out.println();
        }
    }
}
