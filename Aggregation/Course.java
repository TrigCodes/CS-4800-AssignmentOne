package Aggregation;
public class Course {
    // Fields
    private String name;
    private Instructor instructor_one;
    private Instructor instructor_two;
    private Textbook textbook_one;
    private Textbook textbook_two;

    // Constructor
    public Course(String name, Instructor instructor_one, Instructor instructor_two, Textbook textbook_one, Textbook textbook_two) 
    {
        this.name = name;
        this.instructor_one = instructor_one;
        this.instructor_two = instructor_two;
        this.textbook_one = textbook_one;
        this.textbook_two = textbook_two;
    }

    // Setter
    public void set_name(String name) 
    {
        this.name = name;
    }
    public void set_instructor_one(Instructor instructor_one) 
    {
        this.instructor_one = instructor_one;
    }
    public void set_instructor_two(Instructor instructor_two) 
    {
        this.instructor_two = instructor_two;
    }
    public void set_textbook_one(Textbook textbook_one) 
    {
        this.textbook_one = textbook_one;
    }
    public void set_textbook_two(Textbook textbook_two) 
    {
        this.textbook_two = textbook_two;
    }

    // Getter
    public String get_name() 
    {
        return this.name;
    }
    public Instructor get_instructor_one() 
    {
        return this.instructor_one;
    }
    public Instructor get_instructor_two() 
    {
        return this.instructor_two;
    }
    public Textbook get_textbook_one() 
    {
        return this.textbook_one;
    }
    public Textbook get_textbook_two() 
    {
        return this.textbook_two;
    }

    // Misc
    public void print() 
    {
        System.out.println("Course Name: " + this.name);
        System.out.println(
                "Instructor One: " + this.instructor_one.get_first_name() + " " + this.instructor_one.get_last_name()
        );
        System.out.println(
                "Instructor Two: " + this.instructor_two.get_first_name() + " " + this.instructor_two.get_last_name()
        );
        System.out.println("Textbook One: " + this.textbook_one.get_title() + " by " + this.textbook_one.get_author());
        System.out.println("Textbook Two: " + this.textbook_two.get_title() + " by " + this.textbook_two.get_author());
    }
}