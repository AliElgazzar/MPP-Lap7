package lesson7.labs.prob2;

public interface Polygon extends ClosedCurve {

    public  double[] getSides();
    default double computePerimeter(){
            double perimeter = 0;
            {
               for (double side : getSides()) {
                   perimeter += side;
               }
               return perimeter;
            }
    }
}
