package exercise;

// BEGIN
public class Circle {
    int radius;
    Point p;

    Circle(Point p, int radius){
        this.p = p;
        this.radius = radius;
    }

    double getSquare() throws NegativeRadiusException{
        if (radius < 0)
            throw new  NegativeRadiusException("Exception");

        return Math.PI * Math.pow(radius, 2);
    }
    int getRadius(){
        return radius;
    }
}
// END
