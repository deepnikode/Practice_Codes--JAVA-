import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;

class Student 
{
    String name;
    int id;

    // Constructor to initialize Student objects
    public Student(String name, int id) 
    {
        this.name = name;
        this.id = id;
    }
}

public class JsonToGson 
{
    public static void main(String[] args) 
    {
        System.out.println("Hello JSON GSON world!!");

        // Create Student objects
        Student s1 = new Student("Deep", 935944);
        Student s2 = new Student("Harsh", 855189);

        // Create a list of students and add students to it
        List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);

        // Convert objects to JSON using Gson
        Gson gson = new Gson();

        String normalObject1 = gson.toJson(s1); // Convert student s1 to JSON
        String normalObject2 = gson.toJson(s2); // Convert student s2 to JSON

        String listObject = gson.toJson(list); // Convert the list of students to JSON

        // Print the JSON representations
        System.out.println(normalObject1);
        System.out.println(normalObject2);
        System.out.println(listObject);
    }
}
