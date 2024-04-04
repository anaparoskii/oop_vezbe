package vezbe5;

import java.util.ArrayList;
import java.util.Date;

public class Professor extends Person{
    private String idNumber;
    private Date dateOfEmployment;
    private ProfessorTitle title;
    private ArrayList<Classes> classes;

    public Professor() {
        super();
    }
    public Professor(String firstName, String lastName, String jmbg, String idNumber, Date dateOfEmployment) {
        super(firstName, lastName, jmbg);
        this.idNumber = idNumber;
        this.dateOfEmployment = dateOfEmployment;
    }

    public Professor(ProfessorTitle title, ArrayList<Classes> classes) {
        super();
        this.title = title;
        this.classes = classes;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public Date getDateOfEmployment() {
        return dateOfEmployment;
    }

    public void setDateOfEmployment(Date dateOfEmployment) {
        this.dateOfEmployment = dateOfEmployment;
    }

    public ArrayList<Classes> getClasses() {
        return classes;
    }

    public void setClasses(ArrayList<Classes> classes) {
        this.classes = classes;
    }

    public ProfessorTitle getTitle() {
        return title;
    }

    public void setTitle(ProfessorTitle title) {
        this.title = title;
    }
}
