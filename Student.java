import java.util.Arrays;
import java.util.List;

public class Student {

    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("Asif", 19),
                new Student("Jhon", 18),
                new Student("Doe", 17)

        );

        boolean underAgeStudent = list.stream().anyMatch(student -> student.getAge() < 18);
        System.out.println(underAgeStudent);
    }
}

