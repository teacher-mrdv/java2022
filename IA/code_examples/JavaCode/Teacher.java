/**
 * Teacher (sub) class requires the Person (super) class
 * hours are calculated in the SubjectController class, when a subject
 * is assigned or removed from a teacher
 * @author Marcos
 */
public class Teacher extends Person
{
    private int hours;
    
    public Teacher(int id, String name, int hours)
    {
        super(id, name);
        this.hours = Math.abs(hours);
    }

    public Teacher(int id, String name)
    {
        super(id, name);
        this.hours = 0;
    }
    
    public Teacher()
    {   }

    public int getHours()
    {
        return hours;
    }

    public void setHours(int hours)
    {
        this.hours = Math.abs(hours);
    }
    
    public String toString()
    {
        String temp = super.toString();
        temp = temp + "\n" + "Teaching hours: " + this.hours;
        return temp;
    }

}
