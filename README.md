# INTRODUCTION

This Java project is an implementation for the Parking lot game.
1. The program creates a parking lot of 'n' number of slots.
2. Where 'n' is the number of slots which is taken as input.
3. Further the program takes car object as input. The car has two properties: Registration number and color.
4. The Program allocates a particular slot number to the car according to the availability of slots and a ticket is issued to the driver.
5. The driver can leave a slot which makes the slot available.
6. The program can print Registration numbers of all cars of a particular colour.
7. The program can print the slot number in which a car with a given registration number is parked.
8. The program can print the slot numbers of all slots where a car of a particular colour is parked.

## LOCAL SETUP

1. Unzip the GoJekParkingLot.zip to a local directory.
2. Cd to the GoJekParkingLot directory and run this command:
    `gradlew clean build`
3. The above command would compile and build the java project and it would also run the unit test files.

## How To Run:

#### By Executable Jar-

1. Find the executable jar `parking_lot.jar` in GoJekParkingLot root directory.
2. Run the executable by this command:

    `java -jar parking_lot.jar`

    It would ask for an option. `1` for input through a file and `2` for command line input.
3. Find the dummy input file in GoJekParkingLot root directory names as input.txt.
   (Please give the full file path as input)

#### By IntelliJ-

1. Import the gradle project GoJekParkingLot.
2. Run the main java class `ParkingLotApplication.java` and provide the arguments as asked.
