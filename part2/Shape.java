package part2;

public class Shape {
    protected double height;
    protected double width;

    public Shape(double height, double width) {
        this.height = height;
        this.width = width;
    }

    // if you want use final method you don't use override
    final void final_method() {
        System.out.println("final method");
    }
}
