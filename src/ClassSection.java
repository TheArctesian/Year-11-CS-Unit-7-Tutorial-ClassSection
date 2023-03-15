import java.util.ArrayList;

public class ClassSection {
    private String subject
    private int capacity;
    private int yearLevel;
    private ArrayList<Student> students;

    public ClassSection(String s, int c, int y) {
        subject = s;
        capacity = c;
        yearLevel = y;
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        if (!isStudentEnrolled(student) && this.yearLevel == student.getYearLevel())
            students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public boolean isStudentEnrolled(Student student) {
        for (Student s : students)
        {
            if (s.equals(student))
            {
                return true;
            }
        }
        return false;
    }

    public String getSubject(){return subject;}
    public void setSubject(String subject){this.subject = subject;}

    public int getCapacity(){return capacity;}
    public void setCapacity(int capacity){this.capacity = capacity;}

    public int getYearLevel(){return yearLevel;}
    public void setYearLevel(int yearLevel){this.yearLevel = yearLevel;}

    public ArrayList<Student> getStudents(){return students;}

    @Override
    public String toString()
    {
        return "ClassSection{" +
                "subject='" + subject + '\'' +
                ", capacity=" + capacity +
                ", students=" + students +
                '}';
    }
}
