import java.util.Scanner;

public class HospitalApp {
    public static void main(String[] args) {
        final int exit = 0;
        final int addPatient = 1;
        final int printPatients =2;
        Scanner sc = new Scanner(System.in);
        int option = -1;
        Hospital hospital = new Hospital();
        while (option != exit){
            System.out.println("Dostępne opcje:");
            System.out.println(exit + "- wyjście z programu");
            System.out.println(addPatient + "- dodaj pacjenta");
            System.out.println(printPatients + "- wyświetl listę pacjentów");

            System.out.println("Wybierz jedną z podanych opcji:");
            option = sc.nextInt();
            sc.nextLine();

            switch (option){
                case addPatient:
                    Patient patient = new Patient();
                    System.out.println("Imię: ");
                    patient.setName(sc.nextLine());
                    System.out.println("Nazwisko: ");
                    patient.setSurname(sc.nextLine());
                    System.out.println("Pesel: ");
                    patient.setPesel(sc.nextLine());
                    hospital.addPatient(patient);
                    break;
                case printPatients:
                    hospital.printPatients();
                    break;
                case exit:
                    System.out.println("Program zakończony");
                    break;
                default:
                    System.out.println("Nieprawidłowa opcja");
            }

        }
        sc.close();

    }
}