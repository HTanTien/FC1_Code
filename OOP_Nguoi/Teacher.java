package OOP_Nguoi;

import java.util.Date;
import java.util.Scanner;

public class Teacher extends Person {
    private String TeacherID;
    public Teacher(){
    }
    public Teacher(String TeacherId, String FullName, Date Dateofbirth, String Sex, int ID){
        super(FullName, Dateofbirth, Sex, ID);
        this.TeacherID = TeacherID;
    }
    public String getTeacherId(){
        return TeacherID;
    }
    public void setTeacherId(String TeacherID){
        this.TeacherID = TeacherID;
    }
    @Override
    public void Input(){
        super.Input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Teacher ID: ");
        setTeacherId(sc.nextLine());
    }
    @Override
    public void Output(){
        super.Output();
        System.out.print(", Teacher ID: " + getTeacherId());
    }
    public void Competitionranking(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Choose competition ranking: \n 1-A, 2-B, 3-C");
            int Evaluate = Integer.parseInt(sc.nextLine());
            switch (Evaluate){
                case 1:
                    System.out.println("Type A");
                    break;
                case 2:
                    System.out.println("Type B");
                    break;
                case 3:
                    System.out.println("Type C");
                    break;
                default:
                    System.out.println("Wrong Choose!!");
            }
    }
}
    
