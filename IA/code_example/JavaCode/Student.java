/**
 * Student (sub) class requires the Person (super) class
 * @author Marcos
 */
public class Student extends Person
{
    private int grade;
    private boolean ibdp;
    
    public Student(int id, String name, int grade, boolean ibdp)
    {
        super(id, name);
        this.grade = Math.abs(grade);
        this.ibdp = ibdp;
    }
    
    public Student(int id, String name, int grade, char dp) // overloaded constructor
    {
        super(id, name);
        this.grade = Math.abs(grade);
        this.setIBDP(dp);
    }
    
    public Student()
    {   }

    public int getGrade()
    {
        return grade;
    }

    public void setGrade(int grade)
    {
        this.grade = Math.abs(grade);
    }

    public boolean isIBDP()
    {
        return ibdp;
    }

    public void setIBDP(boolean ibdp)
    {
        this.ibdp = ibdp;
    }
    
    public void setIBDP(char dp)
    {   // overloaded mutator/modifier/setter
        this.ibdp = false;
        if( dp == 'y' || dp =='Y' )
        {
            this.ibdp = true;
        }
    }
    
    public String getIBDP()
    {    // returns a String
        String temp = "No";
        if( this.isIBDP() == true )
        {
            temp = "Yes";
        }
        return temp;
    }
    
    public String toString()
    {
        String temp = super.toString();
        temp = temp + "\n" + "Grade: " + this.grade;
        temp = temp + "\n" + "IB DP: " + this.getIBDP();
        return temp;
    }
    
}
