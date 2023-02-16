public class Student extends Person{
 private String group;

    public Student(String firstname, String lastName, int age, String email, String phonenumber, String group) {
        super(firstname, lastName, age, email, phonenumber);
        this.group = group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getGroup() {
        return group;
    }

    @Override
    void work() {
        System.out.println("java 9");
    }

    @Override
    public String toString() {
        return super.toString()+"group"+group;
    }
}
