public class Book {

    public String name;
    public String lastName;
    public String bookName;
    public int year;

    public Book(String name, String lastName, String bookName, int year){
        this.name = name;
        this.lastName = lastName;
        this.bookName = bookName;
        this.year = year;
    }

    public void print(){
        System.out.println("Vārds: " + name);
        System.out.println("Uzvārds: " + lastName);
        System.out.println("Grāmatas nosaukums: " + bookName);
        System.out.println("Izdošanas gads: " + year);
    }

    public int getAge(int currentYear){
        int age = currentYear - this.year;
        return age;
    }
}
