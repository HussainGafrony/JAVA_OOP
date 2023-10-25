
public class Rectangle {

    private double width;
    private double length;

    public Rectangle(double w, double l) {
        this.width = w;
        this.length = l;
    }

    public Rectangle() {
        this.width = 1.5;
        this.length = 6;
    }

    {
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return this.width * this.length;
    }

    public Rectangle modifyobject(Rectangle rectangle) {
        rectangle.length = 55;
        rectangle.width = 15;
        return rectangle;
    }

    public boolean isEqual(Rectangle room) {
        if (this.length == room.length && this.width == room.width)
            return true;
        else
            return false;
    }

}