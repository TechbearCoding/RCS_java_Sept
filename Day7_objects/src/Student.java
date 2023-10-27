public class Student {
    public String name;
    public String lastName;
    public int course;
    public String faculty;

    public Student(String name, String lastName, int course, String faculty){
        this.name = name;
        this.lastName = lastName;
        this.faculty = faculty;

        if(course > 4){
            this.course = 4;
        }else if(course < 1){
            this.course = 1;
        }else{
            this.course = course;
        }

    }

    public void print(){
        System.out.println("Vārds: " + name);
        System.out.println("Uzvārds: " + lastName);
        System.out.println("Kurss: " + course);
        System.out.println("Fakultāte: " + faculty);
    }
}
