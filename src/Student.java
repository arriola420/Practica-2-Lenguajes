public class Student {
    // Atributos
    private String firstName;
    private String lastName;
    private String gender;
    private String career;
    private int math_score;


    // Constructor
    public Student(String firstName, String lastName, String gender, String career, int math_score) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.career = career;
        this.math_score = math_score;
    }


    // Getters y Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public int getMath_score() {
        return math_score;
    }

    public void setMath_score(int math_score) {
        this.math_score = math_score;
    }


    // toString
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", career='" + career + '\'' +
                ", math_score=" + math_score +
                '}';
    }
}