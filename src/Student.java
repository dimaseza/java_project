
public class Student {
    public static void main(String[] args) {
        Student_Model student1 = new Student_Model();
        Student_Model student2 = new Student_Model();
        student1.setName("Anny");
        student1.setGrade(2.87);
        student2.setName("Max");
        student2.setGrade(3.7);
        
        System.out.println("Nama : " + student1.getName());
        System.out.println("Grade : " + student1.getGrade());
        System.out.println("Cumlaude : " + student1.isCumlaude());
        
        System.out.println();
        
        System.out.println("Nama : " + student2.getName());
        System.out.println("Grade : " + student2.getGrade());
        System.out.println("Cumlaude : " + student2.isCumlaude());
    }
}
