import java.util.*;

class GeometricObject implements Comparable<GeometricObject> {

    private String color;
    private boolean filled;
    private Date dateCreated;

    public GeometricObject() { //Constructor to initialize color, filled, and dateCreated
        this("white", false);
    }
    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.dateCreated = new Date();
    }
    public String getColor() { //Getter for color
        return color;
    }
    public void setColor(String color) { //Setter for color
        this.color = color;
    }
    public boolean isFilled() { //Getter for filled
        return filled;
    }
    public void setFilled(boolean filled) { //Setter for filled
        this.filled = filled;
    }
    public Date getDateCreated() { //Getter for dateCreated
        return dateCreated;
    }
    @Override
    public int compareTo(GeometricObject o) { //Begins compareTo method to compare GeometricObjects

        double thisArea = getArea();
        double otherArea = o.getArea();
        if (thisArea < otherArea) {
            return -1;
        } else if (thisArea > otherArea) {
            return 1;
        } else {
            return 0;
        }
    }
    public double getArea() {
        return 0.0;
    }
    public double getPerimeter() {
        return 0.0;
    }
    @Override
    public boolean equals(Object obj) { //Begins equals method to compare GeometricObjects
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GeometricObject other = (GeometricObject) obj;
        return Double.compare(this.getArea(), other.getArea()) == 0;
    }
}
class Circle extends GeometricObject {

    private double radius;
    public Circle() {
        this(1.0); //Initialize radius to 1.0
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() { //Getter for radius
        return radius;
    }
    public void setRadius(double radius) { //Setter for radius
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    @Override
    public String toString() {
        return "Circle [radius=" + radius + "]";
    }
}