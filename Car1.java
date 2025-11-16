class Car1 {
    String model;
    int year;

    Car1(String m, int y) {
        model = m;
        year = y;
    }

    Car1(Car1 c) {
        model = c.model;
        year = c.year;
    }

    void display() {
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    public static void main(String[] args) {
        Car1 c1 = new Car1("Honda City", 2022);
        Car1 c2 = new Car1(c1);

        c1.display();
        c2.display();
    }
}
