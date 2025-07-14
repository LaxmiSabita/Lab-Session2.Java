public class Calculator {
    // 1: Takes two ints
    public int add(int a, int b) {
        return a + b;
    }

    // 2: Takes three ints
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // 3: Takes two doubles
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();

        // Two ints
        System.out.println("Enter two integers:");
        int i1 = scanner.nextInt();
        int i2 = scanner.nextInt();
        System.out.println("Sum of two ints: " + calc.add(i1, i2));

        // Three ints
        System.out.println("Enter three integers:");
        int j1 = scanner.nextInt();
        int j2 = scanner.nextInt();
        int j3 = scanner.nextInt();
        System.out.println("Sum of three ints: " + calc.add(j1, j2, j3));

        // Two doubles
        System.out.println("Enter two double values:");
        double d1 = scanner.nextDouble();
        double d2 = scanner.nextDouble();
        System.out.println("Sum of two doubles: " + calc.add(d1, d2));

        scanner.close();
    }
}
