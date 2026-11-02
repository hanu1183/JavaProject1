package module1;
import java.util.Scanner;
class Referee {
    int refereeId;
    String refereeName;
    String qualification;
    long mobileNumber;
    int assignedMatchId;
    String availabilityStatus;
    Referee() {
        this.refereeId = 0;
        this.refereeName = "";
        this.qualification = "";
        this.mobileNumber = 0L;
        this.assignedMatchId = 0;
        this.availabilityStatus = "Available";
    }
    void registerReferee() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== REGISTER NEW REFEREE ===");
        System.out.print("Enter Referee ID (Numbers only): ");
        this.refereeId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Referee Name: ");
        this.refereeName = sc.nextLine();
        System.out.print("Enter Certification Level / Qualification: ");
        this.qualification = sc.nextLine();
        System.out.print("Enter Mobile Number: ");
        this.mobileNumber = sc.nextLong();
        sc.nextLine();
        this.availabilityStatus = "Available";
        this.assignedMatchId = 0;
        System.out.println("Referee successfully registered!");
    }
    void assignReferee() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n=== ASSIGN REFEREE TO MATCH ===");
        if (!this.availabilityStatus.equalsIgnoreCase("Available")) {
            System.out.println("Access Denied: Referee " + this.refereeName + " is NOT available! Status: " + this.availabilityStatus);
            return;
        }
        System.out.print("Enter Match ID to assign to this referee: ");
        this.assignedMatchId = sc.nextInt();
        sc.nextLine();
        this.availabilityStatus = "Assigned";
        System.out.println("Success! Referee allocated to Match ID: " + this.assignedMatchId);
    }
    void updateReferee() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n=== UPDATE REFEREE DETAILS ===");
        System.out.print("Enter New Referee Name: ");
        this.refereeName = sc.nextLine();
        System.out.print("Enter New Qualification: ");
        this.qualification = sc.nextLine();
        System.out.print("Enter New Mobile Number: ");
        this.mobileNumber = sc.nextLong();
        sc.nextLine();
        System.out.println("Referee profile details updated successfully!");
    }
    void displayReferee() {
        System.out.println("\n--- REFEREE DETAILS ---");
        System.out.println("Referee ID          : " + this.refereeId);
        System.out.println("Referee Name        : " + this.refereeName);
        System.out.println("Qualification       : " + this.qualification);
        System.out.println("Mobile Number       : " + this.mobileNumber);
        System.out.println("Availability Status : " + this.availabilityStatus);
        if (this.availabilityStatus.equalsIgnoreCase("Assigned")) {
            System.out.println("Assigned Match ID   : " + this.assignedMatchId);
        } else {
            System.out.println("Assigned Match ID   : None");
        }
        System.out.println("-----------------------");
    }
    void updateAvailability() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n=== UPDATE REFEREE AVAILABILITY ===");
        System.out.println("Select Current Status for " + this.refereeName + ":");
        System.out.println("1. Available");
        System.out.println("2. Assigned");
        System.out.println("3. On Leave");
        System.out.print("Enter option number (1-3): ");
        int option = sc.nextInt();
        sc.nextLine();
        if (option == 1) {
            this.availabilityStatus = "Available";
            this.assignedMatchId = 0;
        } else if (option == 2) {
            this.availabilityStatus = "Assigned";
            if (this.assignedMatchId == 0) {
                System.out.print("Enter the Match ID they are assigned to: ");
                this.assignedMatchId = sc.nextInt();
                sc.nextLine();
            }
        } else if (option == 3) {
            this.availabilityStatus = "On Leave";
            this.assignedMatchId = 0;
        } else {
            System.out.println("Invalid option selected! Status remains: " + this.availabilityStatus);
        }
        System.out.println("Referee availability status updated successfully!");
    }
}
public class RefereeModule05 {
public static void main(String[] args) {
	 Referee ref = new Referee();
     ref.registerReferee();
     ref.displayReferee();
     ref.assignReferee();
     ref.displayReferee();
     ref.assignReferee();
     ref.updateReferee();
     ref.updateAvailability();
     ref.displayReferee();
	}
}
