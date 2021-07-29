import java.text.SimpleDateFormat;
import java.util.*;

class Utils {

    static ArrayList<Vehicle> addVehicle(){

        ArrayList<Vehicle> vList = new ArrayList<>();

        vList.add(new Vehicle("CV01ABC", Vehicle.Type.CITYCAR,2015,"Volkswagen","white"));
        vList.add(new Vehicle("BV01EFG", Vehicle.Type.CROSSOVER,2019,"Ford","blue"));
        vList.add(new Vehicle("BV02ABC", Vehicle.Type.FAMILY,2014,"Mazda","grey"));
        vList.add(new Vehicle("B23ABC", Vehicle.Type.CITYCAR,2018,"Dacia","red"));

        return vList;

    }

    static ArrayList<Person> addPerson(){

        ArrayList<Person> pList = new ArrayList<>();

        pList.add(new Person(1,"Iordache","Vasile",new SimpleDateFormat("1992-07-26"), Person.Gender.MALE,2011));
        pList.add(new Person(2,"Giambasu","Florin",new SimpleDateFormat("1985-04-30"), Person.Gender.MALE,2006));
        pList.add(new Person(3,"Popescu","Viorica",new SimpleDateFormat("1980-02-20"), Person.Gender.FEMALE,2001));

        return pList;

    }

    static void displayMenu(){

        System.out.println("\n1 - Display vehicles sorted by manufacturing year");
        System.out.println("2 - Display vehicles sorted by brand");
        System.out.println("3 - Search for vehicles by type");
        System.out.println("4 - Display clients by year of drivers license");
        System.out.println("0 - Exit");

    }

    static void displayByManufacturingYear(ArrayList<Vehicle> vList){

        Collections.sort(vList, Comparator.comparing(Vehicle::getManufacturingYear));

        System.out.println("\nThis is the list of vehicles sorted by manufacturing year");
        for (Vehicle v:vList){
            System.out.println(v);
        }
        System.out.println();

    }

    static void displayByBrand(ArrayList<Vehicle> vList){

        Collections.sort(vList, Comparator.comparing(Vehicle::getBrand));

        System.out.println("\nThis is the list of vehicles sorted by brand");
        for (Vehicle v:vList) {
            System.out.println(v);
        }
        System.out.println();

    }

    static void searchByType(ArrayList<Vehicle> vList){

        Scanner keyboard=new Scanner(System.in);
        boolean ok;
        Vehicle.Type[] types=Vehicle.Type.values();
        Vehicle.Type type;
        int key;

        do {
            System.out.println("\nChoose your type");
            for (int i=0;i<types.length;i++){
                System.out.println((i+1)+" - "+types[i]);
            }
            System.out.println("0 - Exit");
            try {
                key = keyboard.nextInt();
                if (key>=0&&key<=types.length){
                    if (key>0) {
                        type=types[key-1];
                        ok=false;
                        System.out.println("\nHere is our list of "+type+"(S)");
                        for (Vehicle v:vList) {
                            if (type==v.getType())
                                System.out.println(v);
                        }
                    } else {
                        ok=true;
                    }
                } else{
                    System.out.println("This is not a valid option");
                    ok=false;
                }
            }
            catch (Exception e){
                System.out.println("This is not a valid option");
                ok=false;
                keyboard.nextLine();
            }
        } while (!ok);

    }

    static void displayByYearOfLicense(ArrayList<Person> pList){

        Collections.sort(pList, Comparator.comparing(Person::getYearOfDrivingLicense));

        for (Person p:pList) {
            System.out.println(p);
        }
        System.out.println();
    }

}
