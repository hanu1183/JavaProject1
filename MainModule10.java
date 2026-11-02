package module1;
import java.util.*;
public class MainModule10 {
	 Scanner scanner = new Scanner(System.in);
	
	    ArrayList<Team> teamList = new ArrayList<>();
	    ArrayList<Player> playerList = new ArrayList<>();
	    ArrayList<MatchManagement> matchList = new ArrayList<>();
	    ArrayList<Venue> venueList = new ArrayList<>();
	    ArrayList<Referee> refereeList = new ArrayList<>();
	    public static void main(String[] args) {
	    	MainModule10 app = new MainModule10();
	        System.out.println("Welcome to SportSync - Tournament Organizer Platform");
	        boolean running = true;
	        while (running) {
	            app.displayMenu();
	            System.out.print("Enter your choice (1-15): ");
	            int choice = app.scanner.nextInt();
	            app.scanner.nextLine(); 
	            if (choice == 15) {
	                app.exitApplication();
	                running = false;
	            } else {
	                app.processChoice(choice);
	            }
	        }
	    }
	    void displayMenu() {
	        System.out.println("\n=== SPORTSYNC MAIN MENU ===");
	        System.out.println("1. Register New Team");
	        System.out.println("2. Update Existing Team Details");
	        System.out.println("3. View Team Match History Log");
	        System.out.println("4. Manage Player Sub-Menu Operations");
	        System.out.println("5. Schedule New Match Fixture");
	        System.out.println("6. Manage Match Status & Record Results");
	        System.out.println("7. Register and Allocate a Venue");
	        System.out.println("8. Manage Referee Registration & Assignments");
	        System.out.println("9. Validate Entity Data Formats");
	        System.out.println("10. Search Tournament Data Engine");
	        System.out.println("11. Generate Report Files");
	        System.out.println("12. Execute Analytical Performance Processing");
	        System.out.println("13. Remove a Registered Team");
	        System.out.println("14. Remove a Registered Player");
	        System.out.println("15. Save Progress and Exit Application");
	        System.out.println("=============================");
	    }
	    void processChoice(int choice) {
	        switch (choice) {
	            case 1:
	                Team newTeam = new Team();
	                newTeam.registerTeam();
	                newTeam.displayTeam();
	                teamList.add(newTeam);
	                break;
	            case 2:
	                System.out.print("Enter Team ID to update: ");
	                int tId = scanner.nextInt(); scanner.nextLine();
	                boolean teamUpdateFound = false;
	                for (Team t : teamList) {
	                    if (t.teamid == tId) { 
	                        t.updateTeam(); 
	                        t.displayTeam(); 
	                        teamUpdateFound = true;
	                        break; 
	                    }
	                }
	                if (!teamUpdateFound) System.out.println("Team ID not found.");
	                break;
	            case 3:
	                System.out.print("Enter Team ID to look up logs: ");
	                int tmId = scanner.nextInt(); scanner.nextLine();
	                boolean teamLogFound = false;
	                for (Team t : teamList) {
	                    if (t.teamid == tmId) { 
	                        t.viewmatchHistory(); 
	                        teamLogFound = true;
	                        break; 
	                    }
	                }
	                if (!teamLogFound) System.out.println("Team ID not found.");
	                break;
	            case 4:
	                System.out.println("\n--- PLAYER SUB-MENU ---\n1. Register New Player\n2. Update Player Profile\n3. Add Matches to Performance Stats");
	                System.out.print("Choice (1-3): ");
	                int sub = scanner.nextInt(); scanner.nextLine();
	                if (sub == 1) {
	                    Player p = new Player(); p.registerPlayer(); p.displayPlayer(); playerList.add(p);
	                } else if (sub == 2) {
	                    System.out.print("Enter Player ID: ");
	                    int pId = scanner.nextInt(); scanner.nextLine();
	                    boolean pFound = false;
	                    for (Player p : playerList) {
	                        if (p.playerId == pId) { 
	                            p.updatePlayer(); 
	                            p.displayPlayer(); 
	                            pFound = true;
	                            break; 
	                        }
	                    }
	                    if (!pFound) System.out.println("Not found.");
	                } else if (sub == 3) {
	                    System.out.print("Enter Player ID: ");
	                    int pId = scanner.nextInt(); scanner.nextLine();
	                    boolean pStatsFound = false;
	                    for (Player p : playerList) {
	                        if (p.playerId == pId) { 
	                            p.updateStatistics(); 
	                            p.displayPlayer(); 
	                            pStatsFound = true;
	                            break; 
	                        }
	                    }
	                    if (!pStatsFound) System.out.println("Not found.");
	                }
	                break;
	            case 5:
	                MatchManagement m = new MatchManagement();
	                m.scheduleMatch();
	                m.displayMatch();
	                matchList.add(m);
	                break;
	            case 6:
	                System.out.print("Enter Match ID to locate: ");
	                int mId = scanner.nextInt(); scanner.nextLine();
	                boolean matchLocateFound = false;
	                for (MatchManagement match : matchList) {
	                    if (match.matchId == mId) {
	                        System.out.println("1. Update Ongoing Status\n2. Record Final Score Results");
	                        System.out.print("Selection: ");
	                        int matchOption = scanner.nextInt(); scanner.nextLine();
	                        if (matchOption == 1) match.updateMatchStatus();
	                        else match.recordMatchResult();
	                        match.displayMatch();
	                        matchLocateFound = true;
	                        break;
	                    }
	                }
	                if (!matchLocateFound) System.out.println("Match ID verification failed.");
	                break;
	            case 7:
	                Venue v = new Venue();
	                v.registerVenue();
	                v.displayVenue();
	                v.allocateVenue();
	                v.displayVenue();
	                venueList.add(v);
	                break;
	            case 8:
	                System.out.println("1. Register Referee\n2. Assign Referee to Match");
	                System.out.print("Choice: ");
	                int refOpt = scanner.nextInt(); scanner.nextLine();
	                if (refOpt == 1) {
	                    Referee r = new Referee(); r.registerReferee(); r.displayReferee(); refereeList.add(r);
	                } else {
	                    System.out.print("Enter Referee ID to deploy: ");
	                    int rId = scanner.nextInt(); scanner.nextLine();
	                    boolean refDeployFound = false;
	                    for (Referee r : refereeList) {
	                        if (r.refereeId == rId) { 
	                            r.assignReferee(); 
	                            r.displayReferee(); 
	                            refDeployFound = true;
	                            break; 
	                        }
	                    }
	                    if (!refDeployFound) System.out.println("Referee missing.");
	                }
	                break;
	            case 9:
	                ValidateService val = new ValidateService();
	                val.validateTeamId();
	                val.validateMobileNumber();
	                break;
	            case 10:
	                SearchService ss = new SearchService();
	                ss.teamList = this.teamList; ss.playerList = this.playerList;
	                ss.matchList = this.matchList; ss.venueList = this.venueList;
	                System.out.println("1. Search Team\n2. Search Player\n3. Search Match\n4. Search Venue");
	                System.out.print("Selection: ");
	                int sOpt = scanner.nextInt(); scanner.nextLine();
	                if (sOpt == 1) ss.searchTeam();
	                else if (sOpt == 2) ss.searchPlayer();
	                else if (sOpt == 3) ss.searchMatch();
	                else if (sOpt == 4) ss.searchVenue();
	                break;
	            case 11:
	                ReportGenerationService rep = new ReportGenerationService();
	                if (!teamList.isEmpty()) rep.team = teamList.get(0);
	                if (!matchList.isEmpty()) rep.match = matchList.get(0);
	                rep.generateTeamReport();
	                rep.generateMatchReport();
	                rep.generateTournamentStandingsReport();
	                break;
	            case 12:
	                AnalysisService an = new AnalysisService();
	                an.teamList = this.teamList; an.playerList = this.playerList; an.matchList = this.matchList;
	                for (Team t : teamList) an.pointsTable.put(t.teamname, 15);
	                an.identifyChampionTeam();
	                an.calculateMostValuablePlayer();
	                an.analyzeVenueUtilization();
	                break;
	            case 13:
	                System.out.print("Enter Team ID to remove: ");
	                int rmT = scanner.nextInt(); scanner.nextLine();
	                boolean teamRemoveFound = false;
	                for (Team t : teamList) {
	                    if (t.teamid == rmT) { 
	                        t.removeTeam(); 
	                        t.displayTeam(); 
	                        teamRemoveFound = true;
	                        break; 
	                    }
	                }
	                if (!teamRemoveFound) System.out.println("ID not found.");
	                break;
	            case 14:
	            	System.out.print("Enter Player ID to remove: ");
	            	int rmP = scanner.nextInt(); scanner.nextLine();
	            	boolean playerRemoveFound = false;
	            	for (Player p : playerList) {
	            	if (p.playerId == rmP) {
	            	p.removePlayer();
	            	p.displayPlayer();
	            	playerRemoveFound = true;
	            	break;
	            	}
	            	}
	            	if (!playerRemoveFound) System.out.println("ID not found.");
	            	break;
	            	default:
	            	System.out.println("Invalid structural layout command option chosen.");
	            	break;
	            	}
	            	}
	            	void exitApplication() {
	            	System.out.println("Saving all active tournament logs...");
	            	System.out.println("Data compilation secure. SportSync Platform successfully terminated.");
	            	scanner.close();
	            	}
	            	}