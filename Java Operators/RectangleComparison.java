package syed;

class Rectangle {
    // Attributes for length and width
    private int length;
    private int width;

    // Constructor to initialize length and width
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate the area of the rectangle
    public int calculateArea() {
        return length * width;
    }
}

public class RectangleComparison {
    public static void main(String[] args) {
        // Create two Rectangle objects with random values
        Rectangle rectangle1 = new Rectangle(7, 8); // Example values
        Rectangle rectangle2 = new Rectangle(6, 7); // Example values

        // Calculate the areas of the rectangles
        int area1 = rectangle1.calculateArea();
        int area2 = rectangle2.calculateArea();

        // Compare the areas using relational operators
        if (area1 > area2) {
            System.out.println("Rectangle1 > Rectangle2");
        } else if (area1 < area2) {
            System.out.println("Rectangle1 < Rectangle2");
        } else {
            System.out.println("They are equal");
        }
    }
}