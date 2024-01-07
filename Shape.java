package GroupProject2;

public interface  Shape {
    //11. Create an Interface 'Shape' with undefined methods as calculateArea and
    //calculatePerimeter. Create 2 classes Circle & Square that implements
    //functionality defined in the Shape Interface. Test your code.

    double calculateArea();

    double calculatePerimeter();
}
class  Circle implements Shape{
    double radius;

    public Circle(double x){
        this.radius = x;
    }
    @Override
    public double calculateArea() {
        return 3.14*radius*radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2*3.14*radius;
    }
}
class Square implements Shape{
    int side;
    public Square(int x){
        this.side = x;
    }
    @Override
    public double calculateArea() {
        return side*side;
    }

    @Override
    public double calculatePerimeter() {
        return 4*side ;
    }

    public static void main(String[] args) {
        Circle c=new Circle(400.5);
        System.out.println("Area of a circle "+c.calculateArea());
        System.out.println("perimeter of a Circle "+c.calculatePerimeter());
        Square s=new Square(12);
        System.out.println("Area of a Square "+ s.calculateArea());
        System.out.println("Perimeter of Square "+s.calculatePerimeter());
    }
}