public abstract  class Person {
private String firstname;
private String lastName;
private int age;
private String email;
private String Phonenumber;
    abstract void work();

    public Person(String firstname, String lastName, int age, String email, String phonenumber) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        Phonenumber = phonenumber;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhonenumber(String phonenumber) {
        Phonenumber = phonenumber;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getPhonenumber() {
        return Phonenumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", Phonenumber='" + Phonenumber + '\'' +
                '}';
    }
}

