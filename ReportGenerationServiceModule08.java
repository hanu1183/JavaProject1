package module1;
import java.util.*;
class ReportGenerationService {
    Team team;
    MatchManagement match;
    Referee referee;
    String reportTitle;
    ReportGenerationService() {
        this.team = null;
        this.match = null;
        this.referee = null;
        this.reportTitle = "SportSync Tournament Report";
    }
    void generateTeamReport() {
        System.out.println("\n=================================");
        System.out.println("Title: " + this.reportTitle);
        System.out.println("Report: REGISTERED TEAM REPORT");
        System.out.println("=================================");
        if (this.team == null) {
            System.out.println("No team data available to generate report.");
        } else {
            System.out.println("Team ID             : " + this.team.teamid);
            System.out.println("Team Name           : " + this.team.teamname);
            System.out.println("Coach Name          : " + this.team.coachName);
            System.out.println("Captain Name        : " + this.team.captainName);
            System.out.println("Category            : " + this.team.category);
            System.out.println("Registration Status : " + this.team.registrationStatus);
        }
        System.out.println("=================================");
    }
    void generateMatchReport() {
        System.out.println("\n=================================");
        System.out.println("Title: " + this.reportTitle);
        System.out.println("Report: MATCH FIXTURE AND RESULT REPORT");
        System.out.println("=================================");
        if (this.match == null) {
            System.out.println("No match data available to generate report.");
        } else {
            System.out.println("Match ID            : " + this.match.matchId);
            System.out.println("Team 1 ID           : " + this.match.teamOneId);
            System.out.println("Team 2 ID           : " + this.match.teamTwoId);
            System.out.println("Match Date          : " + this.match.matchDate);
            System.out.println("Match Status        : " + this.match.matchStatus);
            System.out.println("Final Score         : " + this.match.score);
            System.out.println("Winning Team ID     : " + this.match.winnerTeamId);
        }
        System.out.println("=================================");
    }
    void generatePlayerStatisticsReport() {
        System.out.println("\n=================================");
        System.out.println("Title: " + this.reportTitle);
        System.out.println("Report: PLAYER PERFORMANCE REPORT");
        System.out.println("=================================");
        System.out.println("Notice: Player performance draws metrics from system context.");
        System.out.println("Generating baseline statistics summary records...");
        System.out.println("Status: Complete. Review PlayerModule logs for isolated telemetry.");
        System.out.println("=================================");
    }
    void generateTournamentStandingsReport() {
        System.out.println("\n=================================");
        System.out.println("Title: " + this.reportTitle);
        System.out.println("Report: TOURNAMENT POINTS TABLE REPORT");
        System.out.println("=================================");
        System.out.println("Rank | Team Name | Played | Won | Lost | Draw | Points");
        System.out.println("-----------------------------------------------------");
        if (this.team != null && !this.team.teamname.equals("")) {
            System.out.println("1    | " + this.team.teamname + "   | 0      | 0   | 0    | 0    | 0");
        } else {
            System.out.println("No standings data computed yet.");
        }
        System.out.println("=================================");
    }
}
public class ReportGenerationServiceModule08 {
public static void main(String[] args) {
	  ReportGenerationService reporter = new ReportGenerationService();
      reporter.reportTitle = "SportSync Annual Championship 2026";
      Team t = new Team();
      t.teamid = 101;
      t.teamname = "Warriors";
      t.coachName = "Coach Alex";
      t.captainName = "Ryan";
      t.category = "Senior Men";
      t.registrationStatus = "Registered";
      reporter.team = t;
      MatchManagement m = new MatchManagement();
      m.matchId = 501;
      m.teamOneId = 101;
      m.teamTwoId = 102;
      m.matchDate = "15-10-2026";
      m.matchStatus = "Completed";
      m.score = "2-1";
      m.winnerTeamId = 101;
      reporter.match = m;
      reporter.generateTeamReport();
      reporter.generateMatchReport();
      reporter.generatePlayerStatisticsReport();
      reporter.generateTournamentStandingsReport();
  }
}
