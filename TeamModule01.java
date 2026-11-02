package module1;
import java.util.*;
	
class Team{
	int teamid;
	String teamname;
    String coachName;
	String captainName;
    String category; 
    long contactNumber;
    String registrationStatus;
    
    String matchhistory="";
    Team(){
    	this.teamid=0;
    	this.teamname="";
    	this.coachName = "";
    this.captainName = "";
    this.category = "";
    this.contactNumber = 0L;
    this.registrationStatus = "Pending";
    }
    void registerTeam() {
    	Scanner sc = new Scanner(System.in);
System.out.println("=== REGISTER NEW TEAM ===");
        
        System.out.print("Enter Team ID (Numbers only): ");
        this.teamid = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter Team Name: ");
        this.teamname = sc.nextLine();

        System.out.print("Enter Coach Name: ");
        this.coachName = sc.nextLine();

        System.out.print("Enter Captain Name: ");
        this.captainName = sc.nextLine();

        System.out.print("Enter Category (e.g., Junior, Senior): ");
        this.category = sc.nextLine();

        System.out.print("Enter Contact Number: ");
        this.contactNumber = sc.nextLong();
        sc.nextLine(); 

        this.registrationStatus = "Registered";
        System.out.println("Team successfully registered!");
    }
    void updateTeam() {
    	Scanner sc = new Scanner(System.in);
    	 System.out.println("=== REGISTER and Update TEAM ===");
         
         System.out.print("Enter Team ID to update(Numbers only): ");
         this.teamid = sc.nextInt();
         sc.nextLine(); 

         System.out.print("Enter Team Name to update: ");
         this.teamname = sc.nextLine();

         System.out.print("Enter Coach Name to update: ");
         this.coachName = sc.nextLine();

         System.out.print("Enter Captain Name to update: ");
         this.captainName = sc.nextLine();

         System.out.print("Enter Category to update(e.g., Junior, Senior): ");
         this.category = sc.nextLine();

         System.out.print("Enter Contact Number to update: ");
         this.contactNumber = sc.nextLong();
         
         sc.nextLine();
         
         System.out.print("Enter New Registration Status (e.g., Registered, Active): ");
         this.registrationStatus = sc.nextLine();

         System.out.println("Team profile updated successfully!");
    }
        void displayTeam() {
        	System.out.println("\n--- TEAM DETAILS ---");
            System.out.println("Team ID             : " + this.teamid);
            System.out.println("Team Name           : " + this.teamname);
            System.out.println("Coach Name          : " + this.coachName);
            System.out.println("Captain Name        : " + this.captainName);
            System.out.println("Category            : " + this.category);
            System.out.println("Contact Number      : " + this.contactNumber);
            System.out.println("Registration Status : " + this.registrationStatus);
            System.out.println("--------------------");
        }
        void viewmatchHistory() {
        	 System.out.println("\n--- Match History for " + this.teamname + " ---");
             if (this.matchhistory.equals("")) {
                 System.out.println("No matches recorded yet.");
             } else {
                 System.out.print(this.matchhistory);
        }
    }
        void removeTeam() {
        	Scanner sc = new Scanner(System.in);
            System.out.println("\n=== REMOVE TEAM ===");
            System.out.print("Are you sure you want to remove '" + this.teamname + "'? (type Yes or No): ");
            String choice = sc.nextLine();
            if (choice.equalsIgnoreCase("Yes")) {
                this.registrationStatus = "Removed";
                System.out.println("Team '" + this.teamname + "' has been successfully removed.");
            } else {
                System.out.println("Removal cancelled. Team '" + this.teamname + "' is still active.");
            }
}
       void addMatch(String matchdetails) {
    	   this.matchhistory = this.matchhistory + "- " + matchdetails + "\n";
       }
}
public class TeamModule01 {

	public static void main(String[] args) {
		Team t = new Team();
		t.registerTeam();
		t.displayTeam();
		t.addMatch("Won aganist team Bravo(2-1)");
		t.addMatch("Drew with Team Delta(0-0)");
		t.viewmatchHistory();
		t.updateTeam();
		t.displayTeam();
		t.removeTeam();
		t.displayTeam();
	}

}
