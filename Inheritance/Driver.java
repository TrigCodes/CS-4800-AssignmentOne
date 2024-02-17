package Inheritance;
public class Driver 
{
    public static void main(String[] args)
    {
        Employee joe = new SalariedEmployee("Joe", "Jones", "111-11-1111", 2500.00);
        Employee stephanie = new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25.00, 32);
        Employee mary = new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19.00, 47);
        Employee nichole = new CommisionEmployee("Nichole", "Dior", "444-44-4444", 0.15, 50000.00);
        Employee renwa = new SalariedEmployee("Renwa", "Chanel", "555-55-5555", 1700.00);
        Employee mike = new BaseEmployee("Mike", "Davenport", "666-66-6666", 95000.00);
        Employee mahnaz = new CommisionEmployee("Mahnaz", "Vaziri", "777-77-7777", 0.22, 40000.00);

        System.out.println("Instantion Complete: " + "\n" +
                          joe.get_first_name() + "\n" +
                          stephanie.get_first_name() + "\n" +
                          mary.get_first_name() + "\n" +
                          nichole.get_first_name() + "\n" +
                          renwa.get_first_name() + "\n" +
                          mike.get_first_name() + "\n" +
                          mahnaz.get_first_name());
    }
}