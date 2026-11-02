package module1;
import java.util.*;
class SearchService {
    List<Team> teamList = new ArrayList<>();
    List<Player> playerList = new ArrayList<>();
    List<MatchManagement> matchList = new ArrayList<>();
    List<Venue> venueList = new ArrayList<>();
    void searchTeam() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== SEARCH TEAM ===");
        System.out.println("1. Search by Team ID");
        System.out.println("2. Search by Team Name");
        System.out.print("Enter choice (1-2): ");
        int choice = sc.nextInt();
        sc.nextLine();
        if (choice == 1) {
            System.out.print("Enter Team ID to search: ");
            int id = sc.nextInt();
            sc.nextLine();
            boolean found = false;
            for (Team t : teamList) {
                if (t.teamid == id) {
                    t.displayTeam();
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Team not found with ID: " + id);
            }
        } else if (choice == 2) {
            System.out.print("Enter Team Name to search: ");
            String name = sc.nextLine();
            boolean found = false;
            for (Team t : teamList) {
                if (t.teamname.equalsIgnoreCase(name)) {
                    t.displayTeam();
                    found = true;
                }
            }
            if (!found) {
                System.out.println("Team not found with name: " + name);
            }
        } else {
            System.out.println("Invalid option.");
        }
    }
    void searchPlayer() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n=== SEARCH PLAYER ===");
        System.out.print("Enter Player ID to search: ");
        int id = sc.nextInt();
        sc.nextLine();
        boolean found = false;
        for (Player p : playerList) {
            if (p.playerId == id) {
                p.displayPlayer();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Player not found with ID: " + id);
        }
    }
    void searchMatch() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n=== SEARCH MATCH ===");
        System.out.print("Enter Match ID to search: ");
        int id = sc.nextInt();
        sc.nextLine();
        boolean found = false;
        for (MatchManagement m : matchList) {
            if (m.matchId == id) {
                m.displayMatch();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Match not found with ID: " + id);
        }
    }
    void searchVenue() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n=== SEARCH VENUE ===");
        System.out.print("Enter Venue ID to search: ");
        int id = sc.nextInt();
        sc.nextLine();
        boolean found = false;
        for (Venue v : venueList) {
            if (v.venueId == id) {
                v.displayVenue();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Venue not found with ID: " + id);
        }
    }
}
public class SearchServiceModule07 {
public static void main(String[] args) {
	SearchService searcher = new SearchService();
	Team t1 = new Team();
    t1.teamid = 55;
    t1.teamname = "Titans";
    t1.coachName = "Coach Arthur";
    t1.captainName = "Marcus Vance";
    t1.category = "Senior";
    t1.contactNumber = 9876543210L;
    t1.registrationStatus = "Registered";
    searcher.teamList.add(t1);
    Player p1 = new Player();
    p1.playerId = 99;
    p1.playerName = "Alex Reed";
    p1.age = 21;
    p1.jerseyNumber = 10;
    p1.playingPosition = "Forward";
    p1.teamId = 55;
    p1.matchesPlayed = 12;
    p1.playerStatus = "Active";
    searcher.playerList.add(p1);
    searcher.searchTeam();
    searcher.searchPlayer();
 }
}

