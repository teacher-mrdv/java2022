public class Student extends Person
{
    private int grade;
    private boolean fullDP;
    
    public Student()
    { }

    public Student(int id, String name, String phone)
    {
        super.setID(id);
        super.setName(name);
        super.setPhone(phone);
        this.grade = 0;
        this.fullDP = true;
    }
    
    public Student(int id, String name, String phone, int grade, char fullDP)
    {
        super.setID(id);
        super.setName(name);
        super.setPhone(phone);
        this.grade = grade;
        this.setFullDP(fullDP);
    }

    public int getId()
    {
        return super.getID();
    }

    public void setId(int id)
    {
        super.setID(id);
    }

    public String getName()
    {
        return super.getName();
    }

    public void setName(String name)
    {
        super.setName(name);
    }

    public boolean isFullDP()
    {
        return fullDP;
    }
    /**
     * @return the grade
     */
    public int getGrade()
    {   return grade;
    }
    /**
     * @param grade the grade to set
     */
    public void setGrade(int grade)
    {   this.grade = grade;
    }
    
    public String getFullDP()
    {   String output = "Yes";
        if( !this.isFullDP() )
        {   output = "No";
        }
        return output;
    }
    
    public void setFullDP(char programme)
    {   this.fullDP = true;
        if( programme == 'n' || programme == 'N')
        {   this.fullDP = false;
        }
    }
    
    public String toString()
    {   String output = "Student ID: " + this.getId();
        output = output + "\nStudent name: " + this.getName();
        output = output + "\nFull IB Diploma: " + this.getFullDP();
        output = output + "\n";
        return output;
    }
    
    
}
