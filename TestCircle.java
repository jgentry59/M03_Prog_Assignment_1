public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle(2.0); //Make two Circle objects with different radii
        Circle circle2 = new Circle(1.0);

        int comparisonResult = circle1.compareTo(circle2); //Compare circle1 and circle2 using compareTo method
        if (comparisonResult < 0) {
            System.out.println("Circle 1 is smaller than circle 2");
        } else if (comparisonResult > 0) {
            System.out.println("Circle 1 is larger than circle 2");  //Output results
        } else {
            System.out.println("Circle 1 is equal to circle 2");
        }

        System.out.println("Circle 1 equals circle 2: " + circle1.equals(circle2));
    }
}
