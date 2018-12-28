package pl.coderstrust.Figures;

public class Triangle implements Figure {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        if (base<=0 || height<=0){
            throw new IllegalArgumentException("Both base and height must be greater than 0");
        }
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (base*height)/2;
    }
}
