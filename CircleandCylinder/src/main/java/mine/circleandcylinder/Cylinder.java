package mine.circleandcylinder;
    public class Cylinder extends Circle{
    private double height;
    public Cylinder() {
    height=1;
    }
    public Cylinder(double radius) {
        super(radius);
    }
    public Cylinder(double height, double radius) {
        super(radius);
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
public double getVolume(){
    double vol= Math.PI*Math.pow(super.getRadius(), 2)*height;
return vol;
}
    }

