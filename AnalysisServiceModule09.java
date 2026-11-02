package module1;
import java.util.*;
class AnalysisService {
    List<Team> teamList = new ArrayList<>();
    List<Player> playerList = new ArrayList<>();
    List<MatchManagement> matchList = new ArrayList<>();
    Map<String, Integer> pointsTable = new HashMap<>();
    void identifyChampionTeam() {
        System.out.println("=== IDENTIFY CHAMPION TEAM ===");
        if (pointsTable.isEmpty()) {
            System.out.println("No data available in the points table.");
            return;
        }
        Map.Entry<String, Integer> champion = pointsTable.entrySet().stream()
            .max(Map.Entry.comparingByValue())
            .orElse(null);
        if (champion != null) {
            System.out.println("Tournament Champion Team: " + champion.getKey() + " with " + champion.getValue() + " points!");
        }
    }
    void calculateMostValuablePlayer() {
        System.out.println("\n=== CALCULATE MOST VALUABLE PLAYER ===");
        if (playerList.isEmpty()) {
            System.out.println("No player data available to analyze performance statistics.");
            return;
        }
        Player mvp = playerList.stream()
            .max((p1, p2) -> Integer.compare(p1.matchesPlayed, p2.matchesPlayed))
            .orElse(null);
        if (mvp != null) {
            System.out.println("Most Valuable Player (MVP): " + mvp.playerName + " (Matches Played: " + mvp.matchesPlayed + ")");
        }
    }
    void analyzeVenueUtilization() {
        System.out.println("\n=== ANALYZE VENUE UTILIZATION ===");
        if (matchList.isEmpty()) {
            System.out.println("No match schedules found to track venue utilization telemetry.");
            return;
        }
        long totalMatches = matchList.stream().count();
        long completedMatches = matchList.stream()
            .filter(m -> m.matchStatus.equalsIgnoreCase("Completed"))
            .count();
        System.out.println("Total tournament fixtures scheduled: " + totalMatches);
        System.out.println("Total completed match allocations: " + completedMatches);
    }
    void generateSummary() {
        System.out.println("\n=== OVERALL TOURNAMENT PERFORMANCE SUMMARY ===");
        System.out.println("Total Teams Tracked      : " + teamList.stream().count());
        System.out.println("Total Players Registered : " + playerList.stream().count());
        System.out.println("Total Match Fixtures     : " + matchList.stream().count());
        System.out.println("Points Standings Logged  : " + pointsTable.size());
    }
}
public class AnalysisServiceModule09 {
public static void main(String[] args) {
	 AnalysisService analysis = new AnalysisService();
     Team t1 = new Team(); t1.teamid = 1; t1.teamname = "Titans";
     Team t2 = new Team(); t2.teamid = 2; t2.teamname = "Knights";
     analysis.teamList.add(t1);
     analysis.teamList.add(t2);
     analysis.pointsTable.put("Titans", 12);
     analysis.pointsTable.put("Knights", 9);
     Player p1 = new Player(); p1.playerName = "Alex"; p1.matchesPlayed = 8;
     Player p2 = new Player(); p2.playerName = "Sam"; p2.matchesPlayed = 14;
     analysis.playerList.add(p1);
     analysis.playerList.add(p2);
     MatchManagement m1 = new MatchManagement(); m1.matchStatus = "Completed";
     MatchManagement m2 = new MatchManagement(); m2.matchStatus = "Scheduled";
     analysis.matchList.add(m1);
     analysis.matchList.add(m2);
     analysis.identifyChampionTeam();
     analysis.calculateMostValuablePlayer();
     analysis.analyzeVenueUtilization();
     analysis.generateSummary();
		}
}
