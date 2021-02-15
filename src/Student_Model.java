
public class Student_Model {
    private String name;
    private double grade;
    
    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }
    
    public String getName() {
        return name;
    }
    
    public void setGrade(double grade) {
        if (grade >= 0 && grade <= 4) {
            this.grade = grade;
        }
    }
    
    public double getGrade() {
        return grade;
    }
    
    public boolean isCumlaude() {
        if (getGrade() > 3.5) {
            return true;
        }
        return false;
    }
}
