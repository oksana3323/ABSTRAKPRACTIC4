import java.util.Arrays;

public class Teacher extends Person{
    private Student []student;

    public Teacher(String firstname, String lastName, int age, String email, String phonenumber, Student[] student) {
        super(firstname, lastName, age, email, phonenumber);
        this.student = student;
    }

    @Override
    void work() {

    }

    @Override
    public String toString() {
        return "Teacher{" +
                "student=" + Arrays.toString(student) +
                '}';
    }
}
