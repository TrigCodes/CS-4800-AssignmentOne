package Aggregation;
public class Driver 
{
    public static void main(String[] args) 
    {
        Instructor instructor_one = new Instructor("Nima", "Davarpanah", "3-2636");
        Instructor instructor_two = new Instructor("Samin", "Hossain", "3-2335");

        Textbook textbook_one = new Textbook("Clean Code", "Robert C. Martin", "Prentice Hall");
        Textbook textbook_two = new Textbook("Messy Code", "Samin Hossain", "Prentice Hall");

        Course course = new Course("Programming", instructor_one, instructor_two, textbook_one, textbook_two);

        course.print();
    }
}
