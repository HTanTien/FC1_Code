package OOP_Nguoi;
import java.util.*;
import java.text.*;
public class Student {
    private String FullName;
    private Date Dateofbirth;
    private String Gender;
    private int ID;
    public Student(String Fullname, Date Dateofbirth, String Gender, int ID) {
        this.FullName = FullName;
        this.Dateofbirth = Dateofbirth;
        this.Gender = Gender;
        this.ID = ID;
    }
    public Student() {
    }
    public String getfullName() {
        return FullName;
    }
    public void setfullName(String FullName) {
        this.FullName = FullName;
    }
    public Date getdateOfBirth() {
        return Dateofbirth;
    }
    public void setdateofBirth(Date Dateofbirth) {
        this.Dateofbirth = Dateofbirth;
    }
    public String getgender() {
        return Gender;
    }
    public void setgender(String Gender) {
        this.Gender = Gender;
    }
    public int getId() {
        return ID;
    }
    public void setId(int ID) {
        this.ID = ID;
    }
    public void input() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter information:");
            System.out.print("Full name: ");
            setfullName(scanner.nextLine());
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            System.out.print("Date of birth (dd/MM/yyyy): ");
            String dobString = scanner.nextLine();
            setdateofBirth(sdf.parse(dobString));
            System.out.print("Gender: ");
            setgender(scanner.nextLine());
            System.out.print("ID Card: ");
            setId(scanner.nextInt());
        } catch (Exception e) {
            System.out.println("Input error: " + e.getMessage());
        }
    }
    public void output() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.print("FullName= " + getfullName()
                + ", DateOfBirth= " + (Dateofbirth != null ? sdf.format(Dateofbirth) : "null")
                + ", Gender = " + getgender()
                + ", ID = " + getId());
    }

    void evaluateConduct() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
public class Student extends Person{
    private String studentId;
    public Student(String studentId, String FullName, Date Dateofbirth, String Gender, int ID) {
        super(FullName, Dateofbirth, Gender, ID);
        this.studentId = studentId;
    }
    public Student() {
    }
    public String getStudentId() {
        return studentId;
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    @Override
    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Student ID: ");
        setStudentId(scanner.nextLine());
    }
    @Override
    public void output() {
        super.output();
        System.out.println(", StudentID=" + getStudentId());
    }
    public void evaluateConduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Evaluate conduct:\nChoose 1-Excellent, 2-Good, 3-Average, 4-Poor");
        int evaluation = Integer.parseInt(scanner.nextLine());
        switch (evaluation) {
            case 1:
                System.out.println("Excellent");
                break;
            case 2:
                System.out.println("Good");
                break;
            case 3:
                System.out.println("Average");
                break;
            case 4:
                System.out.println("Poor");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}

