import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        ArrayList<Pharmacy> medicine = new ArrayList<>();
        Pharmacy medicine1 = new Pharmacy("Typolin", 5.50, 100, "November 2nd");
        Pharmacy medicine2 = new Pharmacy("Kurostopol", 18.65, 100, "October 1st");
        Pharmacy medicine3 = new Pharmacy("Yassifilin", 666.66, 420, "February 30th");
        Pharmacy medicine4 = new Pharmacy("Bedenkulin", 1.20, 5, "The next day");
        medicine.add(medicine1);
        medicine.add(medicine2);
        medicine.add(medicine3);
        medicine.add(medicine4);
        System.out.println(printExpensiveMedicine(medicine));
        System.out.println(printMedicineCapacity(medicine));
        System.out.println(printExpiringMedicine(medicine));
    }

    public static ArrayList<Pharmacy> printExpensiveMedicine(ArrayList<Pharmacy> newmedicine1) {
        for(Pharmacy p: newmedicine1) {
            if (p.getPrice() > 5) {
            printExpensiveMedicine(newmedicine1);
            }
            break;
        }
        return newmedicine1;
    }


    public static ArrayList<Pharmacy> printMedicineCapacity(ArrayList<Pharmacy> newmedicine2) {
        for(Pharmacy p: newmedicine2) {
            if (p.getQuantity() > 10) {
            printMedicineCapacity(newmedicine2);
            }
            break;
        }
        return newmedicine2;
    }


public static ArrayList<Pharmacy> printExpiringMedicine(ArrayList<Pharmacy> newmedicine3) {
    for (Pharmacy p : newmedicine3) {
        if (p.getExpirationDate().equals("November 2nd")) {
            printExpiringMedicine(newmedicine3);
        }
        break;
    }
    return newmedicine3;
}
        }