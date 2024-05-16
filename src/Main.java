import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        Carclass car = addCar();
        System.out.println("Enter how much fuel you want to add:");
        int fuel = scanner.nextInt();
        car.AddFuel(fuel);

    }


        public static Carclass addCar() {
            System.out.println("Enter car brand:");
            String brand = scanner.nextLine();

            System.out.println("Enter car model:");
            String model = scanner.nextLine();

            System.out.println("Enter millage:");
            int millage = scanner.nextInt();

            System.out.println("Enter fuel capacity");
            int FuelCapacity = scanner.nextInt();


            return new Carclass(brand,model,millage,FuelCapacity);


    }


    }


