package exercise;

public class Segment {

    Point p1;
    Point p2;

    Segment(Point point1, Point point2){
        p1 = point1;
        p2 = point2;
    }

    Point getBeginPoint(){
        return p1;
    }

    Point getEndPoint(){
        return p2;
    }

    Point getMidPoint(){
        return new Point(
                (p1.x + p2.x) / 2,
                (p1.y + p2.y) / 2
        );
    }
}