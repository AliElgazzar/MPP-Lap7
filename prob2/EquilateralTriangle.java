package lesson7.labs.prob2;

public class EquilateralTriangle implements ClosedCurve {
    private double side;

    public EquilateralTriangle(double side) {
        this.side = side;
    }

    @Override
    public double computePerimeter() {
        return 3 * side;
    }
}
