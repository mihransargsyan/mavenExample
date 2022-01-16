import model.Student;

public class StudentTest {

    public static void main(String[] args) {
        Student  student = new Student();
        student.setName("poxos");
        student.setSurname("poxosyan");
        student.setAge(30);
        student.setPhone("099854822");
        System.out.println(student);
        System.out.println(student.hashCode());
    }
}
