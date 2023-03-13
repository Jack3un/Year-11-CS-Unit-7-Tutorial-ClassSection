import java.util.ArrayList;

public class ClassSection
{
    private int capacity;
    private int yearLevel;
    private String subject;
    private ArrayList<Student> students;
    public ClassSection(String subject, int capacity, int yearLevel)
    {
        this.subject = subject;
        this.capacity = capacity;
        this.yearLevel = yearLevel;
        students = new ArrayList<>();
    }
    public String getSubject()
    {
        return subject;
    }
    public void setSubject(String subject)
    {
        this.subject = subject;
    }
    public int getCapacity()
    {
        return capacity;
    }
    public void setCapacity(int capacity)
    {
        this.capacity = capacity;
    }
    public int getYearLevel()
    {
        return yearLevel;
    }
    public void setYearLevel(int yearLevel)
    {
        this.yearLevel = yearLevel;
    }
    public ArrayList<Student> getStudents()
    {
        return students;
    }
    public void addStudent(Student student)
    {
        if(student.getYearlevel() == yearLevel && !isStudentEnrolled(student))
        {
            students.add(student);
        }
    }
    public void removeStudent(Student student)
    {
        students.remove(student);
    }
    public boolean isStudentEnrolled(Student student)
    {
        for(Student name : students)
        {
            if(name.equals(student))
            {
                return true;
            }
        }
        return false;
    }
    public String toString()
    {
        return "ClassSection {subject=' " + subject + " ', capacity= " + capacity + " , students= " + students + " }";
    }
}