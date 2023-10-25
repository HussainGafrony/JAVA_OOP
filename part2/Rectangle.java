package part2;

public class Rectangle extends Shape {
    
    public Rectangle(double height, double width) {
        super(height, width);
    }

    public double get_Area() {
        return width * height;
    }
}
