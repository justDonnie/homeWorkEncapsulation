public class Person {
    private String fullName;
    private int age;
    private String education;
    private int workExp;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public int getWorkExp() {
        return workExp;
    }

    public void setWorkExp(int workExp) {
        this.workExp = workExp;
    }

    @Override
    public String toString() {
        return "Person: " +
                "fullName: " + fullName + '\'' +
                "age: " + age +
                "education: " + education + '\'' +
                "workExp: " + workExp;
    }
}