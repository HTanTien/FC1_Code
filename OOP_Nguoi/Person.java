package OOP_Nguoi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Person {

    private String FullName;
    private Date Dateofbirth;
    private String Gender;
    private int ID;

    public Person(String FullName, Date Dateofbirth, String Gender, int ID) {
        this.FullName = FullName;
        this.Dateofbirth = Dateofbirth;
        this.Gender = Gender;
        this.ID = ID;
    }

    public Person() {
    }

    public String getfullName() {
        return FullName;
    }

    public void setfullName(String FullName) {
        this.FullName = FullName;
    }

    public Date getdateofbirth() {
        return Dateofbirth;
    }

    public void setdateofbirth(Date Dateofbirth) {
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

    public void Input() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter information: ");
            System.out.println("FullName: ");
            setfullName(sc.nextLine());
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
            System.out.println("Date of birth(dd/MM/YYYY): ");
            String DateofbirthString = sc.nextLine();
            setdateofbirth(sdf.parse(DateofbirthString));
            System.out.print("Gender: ");
            setgender(sc.nextLine());
            System.out.print("ID: ");
            setId(Integer.parseInt(sc.nextLine()));
        } catch (ParseException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public void Output() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
        System.out.println("Full Name: " + getfullName() + ", Dateofbirth= " + sdf.format(getdateofbirth()) + ", Gender: " + getgender() + ", ID: " + getId());
    }
}
