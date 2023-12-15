import java.util.ArrayList;
import java.util.Scanner;

public class Playground {
    public static void main(String[] args) {
        Scanner aria = new Scanner(System.in);
        System.out.println("Halo, Dunia!");
        System.out.print("Masukkan Nama Mobil : ");
        String input = aria.nextLine();

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Toyota");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.set(0, input);
        for (String car : cars) {
            System.out.println(car);

        }


    }
}
