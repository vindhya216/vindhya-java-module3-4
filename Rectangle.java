
class Rectangle {
    private int length;
    private int breadth;

    Rectangle() { // default constructor
        length = 4;
        breadth = 5;
    }

    Rectangle(int l, int b) { // parameterized constructor
        length = l;
        breadth = b;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();        // uses default
        Rectangle r2 = new Rectangle(10, 15);  // uses parameterized
        System.out.println("Default Rectangle: " + r1.getLength() + " x " + r1.getBreadth());
        System.out.println("Custom Rectangle: " + r2.getLength() + " x " + r2.getBreadth());
    }
}
