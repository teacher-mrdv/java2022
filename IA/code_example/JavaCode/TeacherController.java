
/**
 *
 * @author Marcos
 */
import java.util.*;
import java.io.*;

public class TeacherController
{

    public static ArrayList<Teacher> teachers = new ArrayList<Teacher>();

    public static void addTeacher() throws IOException
    {
        int id = IBIO.inputInt("Enter teacher ID    : ");
        while (searchByID(id) != -1 || id < 1)
        {
            System.out.println("Error - teacher ID already in the system.");
            id = IBIO.inputInt("Enter teacher ID    : ");
        }
        String name = IBIO.input("Enter teacher name  : ");
        while (name.length() < 4) // arbitrary number, depends on requirements
        {
            name = IBIO.input("Enter VALID teacher name: ");
        }
        Teacher newTeacher = new Teacher(id, name);
        teachers.add(newTeacher);
        save();
    }

    public static void fullList()
    {
        for (Teacher t : teachers)
        {
            System.out.println(t);
        }
    }

    public static int searchByID(int id)
    {
        for (int i = 0; i < teachers.size(); i++)
        {
            if (teachers.get(i).getId() == id)
            {
                return i;
            }
        } // end for
        return -1; // if not found, -1 signals error/not found
    }

    public static void edit(int index) throws IOException
    {
        System.out.println(teachers.get(index));
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
                    teachers.remove(index);
                    System.out.println("Record deleted.");
                } else
                {
                    System.out.println("No changes made to the list.");
                }
                save();
                break;
            case 'e':
                int tid = teachers.get(index).getId(); // editing IDs not allowed
                String tname = IBIO.input("Enter correct name  : ");
                int thours = IBIO.inputInt("Enter correct hours : ");
                while (thours < 1)
                {
                    System.out.print("Error - hours out of range. ");
                    thours = IBIO.inputInt("Enter valid hours: ");
                }
                Teacher correction = new Teacher(tid, tname, thours);
                teachers.set(index, correction);
                System.out.println("Record edited:");
                System.out.println(teachers.get(index));
                save();
                break;
            default:
                System.out.println("Operation cancelled.");
                break;
        } // end switch
    }

    public static void searchNames(String name)
    {
        ArrayList<Teacher> results = new ArrayList<Teacher>();
        name = name.toLowerCase();
        String sname;
        for (Teacher t : teachers)
        {
            sname = t.getName().toLowerCase();
            if (sname.startsWith(name))
            {
                results.add(t);
            }
        }
        if (results.size() > 0)
        {
            for (Teacher t : results)
            {
                System.out.println(t);
            }
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
            System.out.println("[ A ] Add teacher");
            System.out.println("[ L ] List all teachers");
            System.out.println("[ I ] Search teacher by ID");
            System.out.println("[ N ] Search teacher by name");
            System.out.println("[ Q ] Quit");
            char decision = IBIO.inputChar("\tEnter one letter for your option: ");
            decision = Character.toLowerCase(decision);
            System.out.println();
            switch (decision)
            {
                case 'a':
                    addTeacher();
                    break;

                case 'l':
                    fullList();
                    break;

                case 'i':
                    int id = IBIO.inputInt("Enter a teacher's id number to search: ");
                    while (id < 1)
                    {
                        System.out.println("Error - id must be positive and > 0.");
                        id = IBIO.inputInt("Enter a teacher's id number to search: ");
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
        File teacherFile = new File("teacher.txt");
        FileWriter fw = new FileWriter(teacherFile);
        PrintWriter out = new PrintWriter(fw);	// write mode
        for (Teacher t : teachers)  //loop to save each element ->
        {
            out.println(t.getId());//of the list to the file
            out.println(t.getName());
            out.println(t.getHours());
        }
        out.close();
        System.out.println("Data file saved."); // optional
    }

    public static void load() throws IOException
    {
        System.out.println("<<< Loading data >>>");
        File teacherFile = new File("teacher.txt");
        if (!teacherFile.exists())
        {
            teacherFile.createNewFile();
            System.out.println("Data file not found. Creating one.");
            addTeacher();
        }
        FileReader fr = new FileReader(teacherFile);
        BufferedReader in = new BufferedReader(fr);//read mode
        int newID = 0;
        String newName = "";
        int newHours = 0;
        String temp;
        teachers.clear();
        while (in.ready())// read lines while file has content
        {
            temp = in.readLine();
            newID = Integer.parseInt(temp);
            newName = in.readLine();
            temp = in.readLine();
            newHours = Integer.parseInt(temp);
            Teacher newTeacher = new Teacher(newID, newName, newHours);
            teachers.add(newTeacher);
        }
        in.close();
        System.out.println("Data file loaded.");// optional
    }

}
