package mine.circleandcylinder;
public class CircleandCylinder {
    public static void main(String[] args) {
        Circle c=new Circle(2);    
        Cylinder cy = new Cylinder(2,3);
        System.out.println("The Area of the circuit is :"+ c.getArea());
        System.out.println("The Area of the cylinder is : "+cy.getArea());
        System.out.println("The Volume of the cylinder is : "+cy.getVolume());}}
