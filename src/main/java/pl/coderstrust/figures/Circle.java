package pl.coderstrust.figures;

public class Circle implements Figure {
    private double radius;

    public Circle(double radius) {
        if (radius <= 0){
            throw new IllegalArgumentException("Radius must be greater than 0");
        }
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI*Math.pow(radius, 2);
    }
}
