package pl.coderstrust.figures;

public class Trapezoid implements Figure{
    private double bottomBase;
    private double topBase;
    private double height;

    public Trapezoid(double bottomBase, double topBase, double height) {
        if (bottomBase <= 0 || topBase <= 0 || height <= 0){
            throw new IllegalArgumentException("Both bases and height must be greater than 0");
        }
        this.bottomBase = bottomBase;
        this.topBase = topBase;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (bottomBase+topBase)*height/2;
    }
}
