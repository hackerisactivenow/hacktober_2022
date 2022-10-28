package JavaIsCool.BuilderPattern.builderpatternexample1;

public class Student {
    private String regNo;
    private String firstName;
    private String lastName;
    private double gpa;

    public Student(Builder builder) {
        this.regNo = builder.regNo;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.gpa = builder.gpa;
    }

    static class Builder {
        private String regNo;
        private String firstName;
        private String lastName;
        private double gpa;

        public Builder(String regNo) {
            this.regNo = regNo;
        }

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder gpa(double gpa) {
            this.gpa = gpa;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "regNo='" + regNo + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gpa=" + gpa +
                '}';
    }

    public static void main(String[] args) {
        Student.Builder studentBuilder = new Student.Builder("123456");
        Student student = studentBuilder.firstName("John").lastName("Doe").gpa(3.5).build();
        System.out.println(student);
    }
}