package inheritance;

public class StudentRunner {
    public static void main(String[] args) {
        //Student student = new Student();
        //student.setName("Bug");
        //student.setEmail("codingbug@gmail.com");

        /*
        Person person = new Person();
        person.setName("Bug");
        person.setEmail("codingbug@gmail.com");
        person.setPhoneNumber("010-1234-5678");
        String value = person.toString();
        System.out.println(value);
        System.out.println(person);
        */

        Employee employee = new Employee("Bug", "Programmer Analyst");
        //employee.setName("Bug");
        employee.setEmail("codingbug@gmail.com");
        employee.setPhoneNumber("010-1234-5678");
        employee.setEmployeeGrade('A');
        employee.setTitle("Programmer Analyst");

        System.out.println(employee);
    }
}
