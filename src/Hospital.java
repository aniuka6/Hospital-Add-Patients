import java.util.Scanner;

public class Hospital {

    private final int maxPatientNumber = 10; // maksymana ilość pacjentów
    private Patient[] patients = new Patient[maxPatientNumber]; // tablica pacjentów
    private int patientCount = 0; // aktulana liczba pacjentów

    public void addPatient(Patient patient){ //dodanie pacjenta do tablicy
        if (patientCount < maxPatientNumber){
            patients [patientCount] = patient;
            patientCount++;
        } else {
            System.out.println("Brak miejsc w kolejce");
        }
    }
    public void printPatients(){ //wyświetlanie pacjentów
        for (int i = 0; i < patientCount; i++) {
            System.out.println(patients[i].getInfo() );
        }
    }
}

