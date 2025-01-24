package lesson7.labs.prob2;

public class Ellipse implements ClosedCurve {
    private double semiMajorAxis;
    private double SemiMajorAxis;

    public Ellipse(double semiMajorAxis, double SemiMajorAxis) {
        this.semiMajorAxis = semiMajorAxis;
        this.SemiMajorAxis = SemiMajorAxis;
    }

    @Override
    public double computePerimeter() {
        return 4 * semiMajorAxis * SemiMajorAxis;
    }
}
