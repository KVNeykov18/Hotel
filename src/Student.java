import java.util.Arrays;

public class Student {
    String name;
    String egn;
    int[] grade;
    int course;
    public Student(String name, String egn, int[] grade, int course) {
        this.name = name;
        this.egn = egn;
        this.grade = grade;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEgn() {
        return egn;
    }

    public void setEgn(String egn) {
        this.egn = egn;
    }

    public int[] getGrade() {
        return grade;
    }

    public void setGrade(int[] grade) {
        this.grade = grade;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", egn='" + egn + '\'' +
                ", grade=" + Arrays.toString(grade) +
                ", course=" + course +
                '}';
    }
}
