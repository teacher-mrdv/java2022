/**
 *
 * @author Marcos
 */
import java.util.*;
import java.io.*;

public class StudentController
{

    public static ArrayList<Student> students = new ArrayList<Student>();

    public static void addStudent() throws IOException
    {
        int id = IBIO.inputInt("Enter student ID    : ");
        while (searchByID(id) != -1 || id < 1)
        {
            System.out.println("Error - student ID already in the system.");
            id = IBIO.inputInt("Enter student ID    : ");
        }
        String name = IBIO.input("Enter student name  : ");
        while (name.length() < 4) // arbitrary number, depends on requirements
        {
            name = IBIO.input("Enter VALID student name: ");
        }
        int grade = IBIO.inputInt("Enter student grade : ");
        while (grade < 9 || grade > 12)
        {
            grade = IBIO.inputInt("Enter a valid student grade (9-12): ");

        }
        char ibdp = IBIO.inputChar("Full IBDP student (y/n)? ");
        while (Character.toLowerCase(ibdp) != 'y' && Character.toLowerCase(ibdp) != 'n')
        {
            ibdp = IBIO.inputChar("Full IBDP student (y/n only)? ");
        }
        Student newStudent = new Student(id, name, grade, ibdp);
        students.add(newStudent);
        save();
    }

    public static void fullList()
    {
        for (Student s : students)
        {
            System.out.println(s);
        }
    }

    public static void compactList(ArrayList<Student> list)
    {    // only name and id, for quick search purposes
        for (Student s : list)
        {
            System.out.println(s.getId() + "\t" + s.getName());
        }
    }

    public static int searchByID(int id)
    {
        for (int i = 0; i < students.size(); i++)
        {
            if (students.get(i).getId() == id)
            {
                return i;
            }
        } // end for
        return -1; // if not found, -1 signals error/not found
    }

    public static void edit(int index) throws IOException
    {
        System.out.println(students.get(index));
        boolean continues = true;
        char choice = IBIO.inputChar("[E]dit    [D]elete    [C]ancel:");
        choice = Character.toLowerCase(choice);
        switch (choice)
        {
            case 'd':
                char confirm = IBIO.inputChar("Are you sure (y/n)? ");
                confirm = Character.toLowerCase(confirm);
                if (confirm == 'y')
                {
                    students.remove(index);
                    System.out.println("Record deleted.");
                } else
                {
                    System.out.println("No changes made to the list.");
                }
                save();
                break;
            case 'e':
                int id = students.get(index).getId(); // editing IDs not allowed
                String name = IBIO.input("Enter correct name: ");
                int grade = IBIO.inputInt("Enter correct student grade: ");
                while (grade < 9 || grade > 12)
                {
                    grade = IBIO.inputInt("Enter a valid student grade (9-12): ");

                }
                char ibdp = IBIO.inputChar("Full IBDP student (y/n)? ");
                while (Character.toLowerCase(ibdp) != 'y' && Character.toLowerCase(ibdp) != 'n')
                {
                    ibdp = IBIO.inputChar("Full IBDP student (y/n only)? ");
                }
                Student correction = new Student(id, name, grade, ibdp);
                students.set(index, correction);
                System.out.println("Record edited:");
                System.out.println(students.get(index));
                save();
                break;
            default:
                System.out.println("Operation cancelled.");
                break;
        } // end switch
    }

    public static void searchNames(String name)
    {
        ArrayList<Student> results = new ArrayList<Student>();
        name = name.toLowerCase();
        String sname;
        for (Student t : students)
        {
            sname = t.getName().toLowerCase();
            if (sname.startsWith(name))
            {
                results.add(t);
            }
        }
        if (results.size() > 0)
        {
            compactList(results);
        } else
        {
            System.out.println("No matches found for " + name);
        }
    }

    public static void main(String[] args) throws IOException
    {
        boolean continues = true;
        do
        {   // display the main menu
            load();
            System.out.println("\n\t== MENU ==");
            System.out.println("[ A ] Add student");
            System.out.println("[ L ] List all students");
            System.out.println("[ I ] Search student by ID");
            System.out.println("[ N ] Search student by name");
            System.out.println("[ Q ] Quit");
            char decision = IBIO.inputChar("\tEnter one letter for your option: ");
            decision = Character.toLowerCase(decision);
            System.out.println();
            switch (decision)
            {
                case 'a':
                    addStudent();
                    break;

                case 'l':
                    fullList();
                    break;

                case 'i':
                    int id = IBIO.inputInt("Enter a student's id number to search: ");
                    while (id < 1)
                    {
                        System.out.println("Error - id must be positive and > 0.");
                        id = IBIO.inputInt("Enter a student's id number to search: ");
                    }
                    int find = searchByID(id);
                    if (find != -1)
                    {
                        edit(find);
                    } else
                    {
                        System.out.println(id + " not found.");
                    }
                    break;

                case 'n':
                    String name = IBIO.input("Enter name to search for: ");
                    searchNames(name);
                    break;

                case 'q':
                    continues = false;
                    break;

                default:
                    System.out.println("Invalid choice.");
                    break;
            } //end switch
        } while (continues);
    }

    public static void save() throws IOException
    {
        System.out.println("<<< Saving data >>>");
        File studentFile = new File("student.txt");
        FileWriter fw = new FileWriter(studentFile);
        PrintWriter out = new PrintWriter(fw);	// write mode
        for (Student s : students)  //loop to save each element ->
        {
            out.println(s.getId());//of the list to the file
            out.println(s.getName());
            out.println(s.getGrade());
            out.println(s.getIBDP());
        }
        out.close();
        System.out.println("Data file saved."); // optional
    }

    public static void load() throws IOException
    {
        System.out.println("<<< Loading data >>>");
        File studentFile = new File("student.txt");
        if (!studentFile.exists())
        {
            studentFile.createNewFile();
            System.out.println("Data file not found. Creating one.");
            addStudent();
        }
        FileReader fr = new FileReader(studentFile);
        BufferedReader in = new BufferedReader(fr);//read mode
        int newID = 0;
        String newName = "";
        int newGrade = 0;
        char newIbdp = ' ';
        String temp;
        students.clear();
        while (in.ready())// read lines while file has content
        {
            temp = in.readLine();
            newID = Integer.parseInt(temp);
            newName = in.readLine();
            temp = in.readLine();
            newGrade = Integer.parseInt(temp);
            temp = in.readLine();
            newIbdp = temp.charAt(0);
            Student newStudent = new Student(newID, newName, newGrade, newIbdp);
            students.add(newStudent);
        }
        in.close();
        System.out.println("Data file loaded.");// optional
    }

}
