package vezbe5;

import java.util.ArrayList;
import java.util.Date;

public class Professor extends Person{
    private String idNumber;
    private Date dateOfEmployment;

    private enum Title {
        ASSISTANT, ASSOCIATE, FULL_PROFESSOR
    }
    private ArrayList<Classes> classes;

    public Professor(String firstName, String lastName, String jmbg, String idNumber, Date dateOfEmployment) {
        super(firstName, lastName, jmbg);
        this.idNumber = idNumber;
        this.dateOfEmployment = dateOfEmployment;
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
}
