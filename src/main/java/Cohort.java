import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cohort {

    private List<Student> students;
    private String cohortName;

    public Cohort(String cohortName) {
        this.cohortName = cohortName;
        this.students = new ArrayList<Student>();
        this.populateStudents();
    }

    Student student1 = new Student("Anna");
    Student student2 = new Student("Sian");
    Student student3 = new Student("Boris");
    Student student4 = new Student("Molly");
    Student student5 = new Student("Zane");
    Student student6 = new Student("Jacob");
    Student student7 = new Student("Phil");
    Student student8 = new Student("Stoo");
    Student student9 = new Student("Vicky");
    Student student10 = new Student("Jane");
    Student student11 = new Student("Kirstin");
    Student student12= new Student("Pat");
    Student student13 = new Student("Jo");
    Student student14= new Student("Raph");
    Student student15= new Student("Riczardo");
    Student student16= new Student("Marcin");
    Student student17= new Student("Thanee");
    Student student18= new Student("Gary");
    Student student19= new Student("Robbie");
    Student student20= new Student("Mike");


    public void populateStudents(){
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);
        students.add(student8);
        students.add(student9);
        students.add(student10);
        students.add(student11);
        students.add(student12);
        students.add(student13);
        students.add(student14);
        students.add(student15);
        students.add(student16);
        students.add(student17);
        students.add(student18);
        students.add(student19);
        students.add(student20);
    }

    public Student mixedStudents(){
        Collections.shuffle(students);
        return students.get(0);
    }

    public List<Student> getStudents() {
        return students;
    }

    public ArrayList<Student> pairOfStudents(){
        Collections.shuffle(students);
        ArrayList<Student> twoStudents = new ArrayList<>();
        for (Student student : this.students) {
            if ( 2 > twoStudents.size() ) {
                twoStudents.add(student);
            }
        }
        return twoStudents;
    }

//    THIS WONT WORK FOR THE PATH NEEDED BUT WILL RETURN A GROUP OF 5

    public ArrayList<Student> groupOfFiveStudents(){
        Collections.shuffle(students);
        ArrayList<Student> fiveStudents = new ArrayList<>();
        for (Student student : this.students) {
            if ( 5 > fiveStudents.size() ) {
                fiveStudents.add(student);
            }
        }
        return fiveStudents;
    }


//    GROUP OF RANDOM FIVE
    public ArrayList<Student> groupOfRandomFive(Integer groupSize) {
        Collections.shuffle(students);
        ArrayList<Student> groupOfFive = new ArrayList<>();
        for (Student student : this.students) {
            if ( groupSize > groupOfFive.size() ) {
                groupOfFive.add(student);
            }
        }
        return groupOfFive;
    }



    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public String getCohortName() {
        return cohortName;
    }

    public void setCohortName(String cohortName) {
        this.cohortName = cohortName;
    }

    public void addStudent (Student student){
        this.students.add(student);
    }




}
