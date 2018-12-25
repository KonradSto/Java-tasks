package pl.coderstrust.Figures;

public class Trapezoid implements Figure{
    private double bottomBase;
    private double topBase;
    private double height;

    public Trapezoid(double bottomBase, double topBase, double height) {
        this.bottomBase = bottomBase;
        this.topBase = topBase;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (bottomBase+topBase)*height/2;
    }
}
