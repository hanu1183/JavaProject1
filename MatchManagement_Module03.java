package module1;
import java.util.Scanner;
class MatchManagement {
    int matchId;
    int teamOneId;
    int teamTwoId;
    String matchDate;
    String matchStatus; 
    int winnerTeamId;
    String score;
    MatchManagement() {
        this.matchId = 0;
        this.teamOneId = 0;
        this.teamTwoId = 0;
        this.matchDate = "";
        this.matchStatus = "Scheduled";
        this.winnerTeamId = 0;
        this.score = "0-0";
    }
      void scheduleMatch() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== SCHEDULE NEW MATCH ===");
        System.out.print("Enter Match ID (Numbers only): ");
        this.matchId = sc.nextInt();
        System.out.print("Enter Team 1 ID: ");
        this.teamOneId = sc.nextInt();
        System.out.print("Enter Team 2 ID: ");
        this.teamTwoId = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Match Date (e.g., DD-MM-YYYY): ");
        this.matchDate = sc.nextLine();
        this.matchStatus = "Scheduled";
        System.out.println("Match successfully scheduled!");
    }
        void updateMatchStatus() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n=== UPDATE MATCH STATUS ===");
        System.out.print("Enter New Status (Scheduled, Ongoing, Completed, Postponed): ");
        this.matchStatus = sc.nextLine();
        System.out.println("Match status updated successfully!");
    }
        void recordMatchResult() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n=== RECORD MATCH RESULT ===");
        System.out.print("Enter Final Match Score (e.g., 3-2 or 1-0): ");
        this.score = sc.nextLine();
        System.out.print("Enter Winning Team ID (Enter 0 if it was a Draw): ");
        this.winnerTeamId = sc.nextInt();
        sc.nextLine(); 
       this.matchStatus = "Completed";
        System.out.println("Match result successfully recorded!");
    }
       void displayMatch() {
        System.out.println("\n--- MATCH DETAILS ---");
        System.out.println("Match ID        : " + this.matchId);
        System.out.println("Team 1 ID       : " + this.teamOneId);
        System.out.println("Team 2 ID       : " + this.teamTwoId);
        System.out.println("Match Date      : " + this.matchDate);
        System.out.println("Match Status    : " + this.matchStatus);
        System.out.println("Final Score     : " + this.score);
        if (this.matchStatus.equalsIgnoreCase("Completed")) {
            if (this.winnerTeamId == 0) {
                System.out.println("Winner          : It's a Draw");
            } else {
                System.out.println("Winner Team ID  : " + this.winnerTeamId);
            }
        } else {
            System.out.println("Winner          : Match not completed yet");
        }
        System.out.println("---------------------");
    }
       void rescheduleMatch() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n=== RESCHEDULE POSTPONED MATCH ===");
        System.out.print("Are you sure you want to change the date for this match? (type Yes or No): ");
        String confirmation = sc.nextLine();
        if (confirmation.equalsIgnoreCase("Yes")) {
            System.out.print("Enter New Match Date (e.g., DD-MM-YYYY): ");
            this.matchDate = sc.nextLine();
            this.matchStatus = "Scheduled";
            System.out.println("Match successfully rescheduled to " + this.matchDate);
        } else {
            System.out.println("Rescheduling cancelled. Match stays on original timeline.");
        }
    }
}
public class MatchManagement_Module03 {
public static void main(String[] args) {
	   MatchManagement match = new MatchManagement();
       match.scheduleMatch();
       match.displayMatch();
       match.updateMatchStatus();
       match.displayMatch();
       match.rescheduleMatch();
       match.displayMatch();
       match.recordMatchResult();
       match.displayMatch();
   }
}


