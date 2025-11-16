class Car {
    String model;
    int year;

    Car() {
        model = "Unknown";
        year = 2020;
    }

    void display() {
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.display();
    }
}
