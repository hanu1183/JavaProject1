package module1;
import java.util.Scanner;
class Player {
    int playerId;
    String playerName;
    int age;
    int jerseyNumber;
    String playingPosition;
    int teamId;
    int matchesPlayed;
    String playerStatus; 
    Player() {
        this.playerId = 0;
        this.playerName = "";
        this.age = 0;
        this.jerseyNumber = 0;
        this.playingPosition = "";
        this.teamId = 0;
        this.matchesPlayed = 0;
        this.playerStatus = "Pending";
    }
        void registerPlayer() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== REGISTER NEW PLAYER ===");
        System.out.print("Enter Player ID (Numbers only): ");
        this.playerId = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Player Full Name: ");
        this.playerName = sc.nextLine();
        System.out.print("Enter Player Age: ");
        this.age = sc.nextInt();
        System.out.print("Enter Jersey Number: ");
        this.jerseyNumber = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Playing Position (e.g., Forward, Defender): ");
        this.playingPosition = sc.nextLine();
        System.out.print("Enter Team ID Affiliation (Numbers only): ");
        this.teamId = sc.nextInt();
        System.out.print("Enter Total Matches Already Played: ");
        this.matchesPlayed = sc.nextInt();
        sc.nextLine(); 
        this.playerStatus = "Active";
        System.out.println("Player successfully registered!");
    }
        void updatePlayer() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n=== UPDATE PLAYER DETAILS ===");
        System.out.print("Enter New Player Full Name: ");
        this.playerName = sc.nextLine();
        System.out.print("Enter New Player Age: ");
        this.age = sc.nextInt();
        System.out.print("Enter New Jersey Number: ");
        this.jerseyNumber = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter New Playing Position: ");
        this.playingPosition = sc.nextLine();
        System.out.print("Enter New Team ID Affiliation: ");
        this.teamId = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter New Player Status (e.g., Active, Injured): ");
        this.playerStatus = sc.nextLine();
        System.out.println("Player profile updated successfully!");
    }
        void displayPlayer() {
        System.out.println("\n--- PLAYER DETAILS ---");
        System.out.println("Player ID        : " + this.playerId);
        System.out.println("Player Name      : " + this.playerName);
        System.out.println("Age              : " + this.age);
        System.out.println("Jersey Number    : " + this.jerseyNumber);
        System.out.println("Playing Position : " + this.playingPosition);
        System.out.println("Team ID Link     : " + this.teamId);
        System.out.println("Matches Played   : " + this.matchesPlayed);
        System.out.println("Player Status    : " + this.playerStatus);
        System.out.println("----------------------");
    }
        void updateStatistics() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n=== UPDATE PLAYER STATISTICS ===");
        System.out.print("Enter number of new matches to add for " + this.playerName + ": ");
        int newMatches = sc.nextInt();
        this.matchesPlayed = this.matchesPlayed + newMatches;
        System.out.println("Statistics updated! Total matches played is now: " + this.matchesPlayed);
    }
        void removePlayer() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n=== REMOVE PLAYER ===");
        System.out.print("Are you sure you want to remove '" + this.playerName + "'? (type Yes or No): ");
        String choice = sc.nextLine();
        if (choice.equalsIgnoreCase("Yes")) {
            this.playerStatus = "Removed";
            System.out.println("Player '" + this.playerName + "' has been successfully removed.");
        } else {
            System.out.println("Removal cancelled. Player '" + this.playerName + "' remains active.");
        }
    }
}
public class PlayerModule02 {
public static void main(String[] args) {
	Player p = new Player();
    p.registerPlayer();
    p.displayPlayer();
    p.updateStatistics();
    p.displayPlayer();
    p.updatePlayer();
    p.displayPlayer();
    p.removePlayer();
    p.displayPlayer();
}
}

	
		