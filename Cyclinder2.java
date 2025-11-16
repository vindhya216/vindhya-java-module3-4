
class Cylinder2 {
    private int radius;
    private int height;

    // Constructor to initialize radius and height
    Cylinder2(int r, int h) {
        radius = r;
        height = h;
    }

    // Getter methods
    public int getRadius() {
        return radius;
    }

    public int getHeight() {
        return height;
    }

    public static void main(String[] args) {
        Cylinder2 c = new Cylinder2(7, 10);
        System.out.println("Radius: " + c.getRadius());
        System.out.println("Height: " + c.getHeight());
    }
}
