package inheritance;
//상속은 다른 클래스에서 이미 사용 중인 코드를 재사용할 때 유용함
//Person 클래스: 슈퍼클래스, Student 클래스: 서브클래스
//상속은 IS A 관계: Student IS A Person
public class Student extends Person {
    private String collegeName;
    private int year;

    public Student(String name, String collegeName) {
        super(name);
        this.collegeName = collegeName;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
