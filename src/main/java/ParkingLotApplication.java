import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import model.Car;
import model.ParkingLot;

public class ParkingLotApplication {
    public static ParkingLot parkingLot = null;

    public static void main(String args[]) {
        int input;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 1 for file input/Enter 2 for command line input");
        input = Integer.parseInt(scan.nextLine());
        if (input == 1) {
            System.out.println("Enter full path name for the text input file: ");
            String path=scan.nextLine();
            try {
                File file = new File(path);
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    StringBuffer stringBuffer = new StringBuffer();
                    System.out.println(line);
                    stringBuffer.append(line);
                    String command = stringBuffer.toString();
                    CallerFunction(command);
                }

                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (input == 2) {
            while (true) {
                System.out.println("Enter command line imput:");
                String command = scan.nextLine();
                CallerFunction(command);
            }
        }
    }

    public static void CallerFunction(String input) {
        String[] values = input.split(" ");
        switch (values[0]) {
            case "create_parking_lot":
                ParkingLotApplication.parkingLot = new ParkingLot(Integer.parseInt(values[1]));
                System.out.println("Created a parking lot with " + values[1] + " slots");
                break;
            case "park":
                Car car = new Car(values[1], values[2]);
                System.out.println(parkingLot.park(car));
                break;
            case "leave":
                System.out.println(ParkingLotApplication.parkingLot.leave(Integer.parseInt(values[1])));
                break;
            case "status":
                ParkingLotApplication.parkingLot.status();
                break;
            case "registration_numbers_for_cars_with_colour":
                System.out.println(ParkingLotApplication.parkingLot.getRegistrationNoByColor(values[1]));
                break;
            case "slot_numbers_for_cars_with_colour":
                System.out.println(parkingLot.getSlotsByCarColor(values[1]));
                break;
            case "slot_number_for_registration_number":
                System.out.println(parkingLot.getSlotsByCarRegistrationNo(values[1]));
                break;
            default:
                System.out.println("Please enter a valid input!");
        }
    }
}
