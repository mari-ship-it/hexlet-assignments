package exercise;

// BEGIN
public class Segment {

    private final Point beginPoint;
    private final Point endPoint;
    private Point midPoint;

    public Segment(Point point1, Point point2) {
        this.beginPoint = point1;
        this.endPoint = point2;
    }

    public Point getBeginPoint() {
        return beginPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    public Point getMidPoint() {

        var x = (beginPoint.getX() + endPoint.getX()) / 2;
        var y = (beginPoint.getY() + endPoint.getY()) / 2;

        return new Point(x, y);
    }
}
// END
