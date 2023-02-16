public class Main {
    public static void main(String[] args) {
        Student[] person = {new Student("Aizat",
                "Duisheeva",
                19,
                "aizat12@gmail.com",
                "0774 14 14b 14",
                "java 9"),
                new Student("Gulmira",
                        "Osmonova",
                        25,
                        "gulmira@gmail.com",
                        "Java 9", "java8")};

        for (Person person1 : person) {
            System.out.println(person1);
            person1.work();
        }

        Teacher teacher = new Teacher("Ulan","Kubanychbekov",25,"ulan@gmail.com" ,
                "0799-67-67-67",person);
        System.out.println(teacher.toString());
    }


}


