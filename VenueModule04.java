package module1;
import java.util.Scanner;
class Venue {
	 int venueId;
	    String venueName;
	    String location;
	    int seatingCapacity;
	    String availabilityStatus; 
	    int assignedMatchId;
        Venue() {
	        this.venueId = 0;
	        this.venueName = "";
	        this.location = "";
	        this.seatingCapacity = 0;
	        this.availabilityStatus = "Available";
	        this.assignedMatchId = 0; 
	    }
            void registerVenue() {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("=== REGISTER NEW VENUE ===");
            System.out.print("Enter Venue ID (Numbers only): ");
	        this.venueId = sc.nextInt();
	        sc.nextLine(); 
	        System.out.print("Enter Venue Name: ");
	        this.venueName = sc.nextLine();
	        System.out.print("Enter Location/Address: ");
	        this.location = sc.nextLine();
	        System.out.print("Enter Seating Capacity: ");
	        this.seatingCapacity = sc.nextInt();
	        sc.nextLine(); 
	        this.availabilityStatus = "Available";
	        this.assignedMatchId = 0;
	        System.out.println("Venue successfully registered!");
	    }
            void allocateVenue() {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("\n=== ALLOCATE VENUE ===");
	        System.out.println("Checking venue status... Current status: " + this.availabilityStatus);
	        if (!this.availabilityStatus.equalsIgnoreCase("Available")) {
	            System.out.println("Access Denied: This hall is NOT empty! It cannot be allocated right now.");
	            return; 
	        }
	        System.out.println("Notice: This hall is currently EMPTY. You can proceed with booking.");
	        System.out.print("Enter Match ID to assign to this venue: ");
	        this.assignedMatchId = sc.nextInt();
	        sc.nextLine(); 
	        this.availabilityStatus = "Booked";
	        System.out.println("Success! The hall has been reserved for Match ID: " + this.assignedMatchId);
	    }
            void updateVenue() {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("\n=== UPDATE VENUE DETAILS ===");
	        System.out.print("Enter New Venue Name: ");
	        this.venueName = sc.nextLine();
	        System.out.print("Enter New Location: ");
	        this.location = sc.nextLine();
	        System.out.print("Enter New Seating Capacity: ");
	        this.seatingCapacity = sc.nextInt();
	        sc.nextLine(); 
	        System.out.println("Select New Availability Status:");
	        System.out.println("1. Available");
	        System.out.println("2. Booked");
	        System.out.println("3. Maintenance");
	        System.out.print("Enter option number (1-3): ");
	        int option = sc.nextInt();
	        sc.nextLine(); 
            if (option == 1) {
	            this.availabilityStatus = "Available";
	        } else if (option == 2) {
	            this.availabilityStatus = "Booked";
	        } else if (option == 3) {
	            this.availabilityStatus = "Maintenance";
	        } else {
	            System.out.println("Invalid option selected! Keeping current status: " + this.availabilityStatus);
	        }

	        System.out.println("Venue profile updated successfully!");
	    }
            void displayVenue() {
	        System.out.println("\n--- VENUE DETAILS ---");
	        System.out.println("Venue ID            : " + this.venueId);
	        System.out.println("Venue Name          : " + this.venueName);
	        System.out.println("Location            : " + this.location);
	        System.out.println("Seating Capacity    : " + this.seatingCapacity);
	        System.out.println("Availability Status : " + this.availabilityStatus);
	         if (this.availabilityStatus.equalsIgnoreCase("Booked")) {
	            System.out.println("Assigned Match ID   : " + this.assignedMatchId);
	        } else {
	            System.out.println("Assigned Match ID   : None");
	        }
	        System.out.println("---------------------");
	    }
         void checkAvailability() {
	        System.out.println("\n--- CHECKING AVAILABILITY ---");
	        if (this.availabilityStatus.equalsIgnoreCase("Available")) {
	            System.out.println("Result: " + this.venueName + " is AVAILABLE for scheduling.");
	        } else {
	            System.out.println("Result: " + this.venueName + " is currently NOT AVAILABLE. Status: " + this.availabilityStatus);
	        }
	    }
	}
public class VenueModule04 {
public static void main(String[] args) {
	 Venue v = new Venue();
	  v.registerVenue();
      v.displayVenue();
      v.allocateVenue();
      v.displayVenue();
      v.allocateVenue();
      v.updateVenue();
      v.displayVenue();
      v.checkAvailability();
}
}


