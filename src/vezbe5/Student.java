package vezbe5;

import java.util.ArrayList;
import java.util.Date;

public class Student extends Person {
    private String indexNumber;
    private Date dateOfEnrollment;
    private ArrayList<Classes> classes;
    private ArrayList<Grade> grades;
    private double averageGrade;

    public Student() {
        super();
    }
    public Student(String firstName, String lastName, String jmbg, String indexNumber, Date dateOfEnrollment,
                   double averageGrade) {
        super(firstName, lastName, jmbg);
        this.indexNumber = indexNumber;
        this.dateOfEnrollment = dateOfEnrollment;
        this.averageGrade = averageGrade;
    }

    public Student(ArrayList<Classes> classes, ArrayList<Grade> grades) {
        super();
        this.classes = classes;
        this.grades = grades;
    }

    public String getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(String indexNumber) {
        this.indexNumber = indexNumber;
    }

    public Date getDateOfEnrollment() {
        return dateOfEnrollment;
    }

    public void setDateOfEnrollment(Date dateOfEnrollment) {
        this.dateOfEnrollment = dateOfEnrollment;
    }

    public ArrayList<Classes> getClasses() {
        return classes;
    }

    public void setClasses(ArrayList<Classes> classes) {
        this.classes = classes;
    }

    public ArrayList<Grade> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Grade> grades) {
        this.grades = grades;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

}
