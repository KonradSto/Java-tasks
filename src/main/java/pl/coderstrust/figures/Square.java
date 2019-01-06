package pl.coderstrust.figures;

public class Square implements Figure {
    private double side;

    public Square(double side) {
        if (side <= 0){
            throw new IllegalArgumentException("Side must be greater than 0");
        }
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side*side;
    }
}
