public class Student {
    public String name;
    public String lastName;
    public int course;
    public String faculty;

    public Student(String name, String lastName, int course, String faculty){
        this.name = name;
        this.lastName = lastName;
        this.course = course;
        this.faculty = faculty;
    }

    public void print(){
        System.out.println("Vārds: " + name);
        System.out.println("Uzvārds: " + lastName);
        System.out.println("Kurss: " + course);
        System.out.println("Fakultāte: " + faculty);
    }
}
