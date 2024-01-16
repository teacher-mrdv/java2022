/**
 * Subject class. Requires Person, Student and Teacher classes
 * @author Marcos
 */

import java.util.ArrayList;

public class Subject
{

    private String subjectName; // key field
    private char subjectLevel; // SL or HL
    private String classroom;
    public Teacher lecturer;
    public ArrayList<Student> students = new ArrayList<Student>();

    public Subject(String name, char level, String room)
    {
        subjectName = name;
        subjectLevel = Character.toUpperCase(level);
        classroom = room.toUpperCase();
    }

    public Subject(String name, char level, String room, Teacher t, ArrayList<Student> sts)
    {
        subjectName = name;
        subjectLevel = Character.toUpperCase(level);
        classroom = room.toUpperCase();
        lecturer = t;
        students = sts;
    }

    public Subject()
    {    }

    public String getSubjectName()
    {
        return subjectName;
    }

    public void setSubjectName(String subjectName)
    {
        this.subjectName = subjectName;
    }

    public char getSubjectLevel()
    {
        return subjectLevel;
    }

    public void setSubjectLevel(char subjectLevel)
    {
        this.subjectLevel = Character.toUpperCase(subjectLevel);
    }

    public String getClassroom()
    {
        return classroom;
    }

    public void setClassroom(String classroom)
    {
        this.classroom = classroom.toUpperCase();
    }

    public String toString()
    {
        String output = "Subject: " + subjectName + "\n";
        output = output + "Level: " + subjectLevel + "L\n";
        output = output + "Classroom: " + classroom;
        output = output + "\n" + lecturer.toString();
        output = output + "\nClass size: " + students.size();
        for (Student s : students)
        {
            output = output + "\n" + s.toString();
        }
        return output;
    }

    // to test and make sure the class works well
    /*public static void main(String[] args)
    {
        Subject cssl = new Subject();
        cssl.setSubjectName("IB1 Computer Science");
        cssl.setSubjectLevel('s');
        cssl.setClassroom("s08-16");
        System.out.println(cssl);
        Subject cshl = new Subject("IB1 Computer Science", 'h', "s08-16");
        System.out.println(cshl.getSubjectName());
        System.out.println(cshl.getSubjectLevel());
        System.out.println(cshl.getClassroom());
    }
     */
}
