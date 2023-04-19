package mine.circleandcylinder;
public class Circle {
      private double radius;
    private String color;
    public Circle() {
    radius=1;
    color="red";
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public double getArea(){
    double area= Math.PI*Math.pow(radius, 2);
    return area;
}
    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + ", color=" + color + '}';
    }
}
