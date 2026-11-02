package module1;
import java.util.Scanner;
class ValidateService {
    int teamId;
    int playerId;
    long mobileNumber;
    int venueId;
    ValidateService() {
        this.teamId = 0;
        this.playerId = 0;
        this.mobileNumber = 0L;
        this.venueId = 0;
    }
    void validateTeamId() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== VALIDATE TEAM ID ===");
        System.out.print("Enter Team ID to validate: ");
        this.teamId = sc.nextInt();
        sc.nextLine();
        if (this.teamId <= 0) {
            System.out.println("Validation Failed: Team ID must be a positive number.");
        } else {
            System.out.println("Validation Passed: Team ID " + this.teamId + " is structured correctly.");
        }
    }
    void validatePlayerId() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n=== VALIDATE PLAYER ID ===");
        System.out.print("Enter Player ID to validate: ");
        this.playerId = sc.nextInt();
        sc.nextLine();
        if (this.playerId <= 0) {
            System.out.println("Validation Failed: Player ID must be a positive number.");
        } else {
            System.out.println("Validation Passed: Player ID " + this.playerId + " is structured correctly.");
        }
    }
    void validateMobileNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n=== VALIDATE MOBILE NUMBER ===");
        System.out.print("Enter Mobile Number to validate: ");
        this.mobileNumber = sc.nextLong();
        sc.nextLine();
        String totalDigits = "" + this.mobileNumber;
        if (totalDigits.length() == 10 && this.mobileNumber > 0) {
            System.out.println("Validation Passed: Mobile number has exactly 10 digits.");
        } else {
            System.out.println("Validation Failed: Mobile number must be a valid 10-digit numeric sequence.");
        }
    }
    void validateVenueId() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n=== VALIDATE VENUE ID ===");
        System.out.print("Enter Venue ID to validate: ");
        this.venueId = sc.nextInt();
        sc.nextLine();
        if (this.venueId <= 0) {
            System.out.println("Validation Failed: Venue ID must be a positive number.");
        } else {
            System.out.println("Validation Passed: Venue ID " + this.venueId + " is structured correctly.");
        }
    }
}
public class ValidateServiceModule06 {
public static void main(String[] args) {
	ValidateService validator = new ValidateService();
    validator.validateTeamId();
    validator.validatePlayerId();
    validator.validateMobileNumber();
    validator.validateVenueId();
		}
}
