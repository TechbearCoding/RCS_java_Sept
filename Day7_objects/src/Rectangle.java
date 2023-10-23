public class Rectangle {
    public double a;
    public double b;
    public double c;
    public double d;

    public Rectangle(int a, int b, int c, int d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public double perimeter(){
        return a+b+c+d;
    }
}
