package Interface;
interface Student{
    String getFullName();
    int getStudentID();
    double calculateGPA();

}
class UndergraduateStudent implements Student{
String fullName;
int studentID;
double[] grades;

    public UndergraduateStudent(String fullName, int studentID, double[] grades) {
        this.fullName = fullName;
        this.studentID = studentID;
        this.grades = grades;
    }

    @Override
    public String getFullName() {
        return fullName;
    }

    @Override
    public int getStudentID() {
        return studentID;
    }

    @Override
    public double calculateGPA() {
        double result =0;
        double avg=0;
        for(double res : grades){
            result = result+ res;
            avg = result/ grades.length;
        }
        return avg;
    }
}
class GraduateStudent implements Student{
    String fullName;
    int studentID;
    double thesisGrade;

    public GraduateStudent(String fullName, int studentID, double thesisGrade) {
        this.fullName = fullName;
        this.studentID = studentID;
        this.thesisGrade = thesisGrade;
    }

    @Override
    public String getFullName() {
        return fullName;
    }

    @Override
    public int getStudentID() {
        return studentID;
    }

    @Override
    public double calculateGPA() {
        double result = thesisGrade/10;
        return result;
    }
}
public class GptQ2 {
    public static void main(String[] args) {
        UndergraduateStudent student1 = new UndergraduateStudent("susi",01,new double[]{100,90,90});
       System.out.println(student1.getStudentID());
        System.out.println(student1.getFullName());
        System.out.println(student1.calculateGPA());

        GraduateStudent student2 = new GraduateStudent("rb",02,90);

        System.out.println(student2.getStudentID());
        System.out.println(student2.getFullName());
        System.out.println(student2.calculateGPA());





    }
}
