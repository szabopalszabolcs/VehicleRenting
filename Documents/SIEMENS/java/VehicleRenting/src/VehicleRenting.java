import java.util.ArrayList;
import java.util.Scanner;

public class VehicleRenting {

    public static void main(String[] args){


        ArrayList<Vehicle> vList= Utils.addVehicle();
        ArrayList<Person> pList= Utils.addPerson();
        int key;
        Scanner keyboard=new Scanner(System.in);


        do {

            Utils.displayMenu();

            try {
                key = keyboard.nextInt();
                switch (key){
                    case 1:
                        Utils.displayByManufacturingYear(vList);
                        break;
                    case 2:
                        Utils.displayByBrand(vList);
                        break;
                    case 3:
                        Utils.searchByType(vList);
                        break;
                    case 4:
                        Utils.displayByYearOfLicense(pList);
                        break;
                    case 0:
                        System.out.println("Good Bye");
                        break;
                    default:
                        System.out.println("This is not a valid option");
                }

            }
            catch (Exception e){
                System.out.println("This is not a valid option");
                key=-1;
                keyboard.nextLine();
            }

        } while (key!=0);

    }

}
