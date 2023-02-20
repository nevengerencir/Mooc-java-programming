
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {
    ArrayList<Match> matches = new ArrayList<>();

    public static void main(String[] args) {
        ArrayList<Match> matches = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        String file = scan.nextLine();
        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            while (fileScanner.hasNextLine()) {
                String[] line = fileScanner.nextLine().split(",");
                matches.add(new Match(line[0], line[1], Integer.parseInt(line[2]), Integer.parseInt(line[3])));

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Team ?");
        String team = scan.nextLine();
        System.out.println("Games: " + count(matches, team));
    }

    public static Integer count(ArrayList<Match> matches, String searchedTeam) {
        int count = 0;
        for (Match match : matches) {
            if (match.getHomeTeam().equals(searchedTeam) || match.getVisitingTeam().equals(searchedTeam)) {
                count++;
            }

        }
        return count;
    }
}
