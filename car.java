public class Car {
    // Attributes
    private String make;
    private String model;
    private short year;
    private int price;
 // Constructor
    public Car(String make, String model, short year, int price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    // Display method
    public void display() {
        System.out.println("Car Details:");
        System.out.println(" Make : " + make);
        System.out.println(" Model: " + model);
        System.out.println(" Year : " + year);
        System.out.println(" Price: ₹" + price);
        System.out.println("--------------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Car> garage = new ArrayList<>();

        System.out.print("How many cars would you like to create? ");
        int count = 0;
        if (scanner.hasNextInt()) {
            count = scanner.nextInt();
            scanner.nextLine(); // consume newline
        }

        for (int i = 1; i <= count; i++) {
            System.out.println("\n--- Enter details for Car #" + i + " ---");

            System.out.print("Make: ");
            String make = scanner.nextLine();

            System.out.print("Model: ");
            String model = scanner.nextLine();

            System.out.print("Year: ");
            short year = 0;
            if (scanner.hasNextShort()) {
                year = scanner.nextShort();
            }
            scanner.nextLine(); // consume newline

            System.out.print("Price (₹): ");
            int price = 0;
            if (scanner.hasNextInt()) {
                price = scanner.nextInt();
            }
            scanner.nextLine(); // consume newline

            Car car = new Car(make, model, year, price);
            garage.add(car);
        }

        System.out.println("\n=== All Cars Created ===");
        for (Car car : garage) {
            car.display();
        }

        scanner.close();
    }
}
