import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ArraysAndLists {
    public static void main(String... args){
        Map<String, Double> studentsToGrades = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        studentsToGrades.put(getName(scanner), getGrade(scanner));
        studentsToGrades.put(getName(scanner), getGrade(scanner));
        studentsToGrades.put(getName(scanner), getGrade(scanner));

        for (String key: studentsToGrades.keySet()){
            System.out.println("Student " + key + " got a grade of " + studentsToGrades.get(key));
        }
    }

    private static String getName(Scanner scanner){
        System.out.print("Enter student name: ");
        return scanner.nextLine();
    }

    private static Double getGrade(Scanner scanner){
        System.out.print("Enter student grade: ");
        Double ret = scanner.nextDouble();
        scanner.nextLine();
        return ret;
    }

    public static void sets(){
        Set<String> fastFoodPlaces = new TreeSet<>();
        fastFoodPlaces.add("McDonald's");
        fastFoodPlaces.add("BK");
        fastFoodPlaces.add("TacoBell");
        fastFoodPlaces.add("ChickFilA");
        fastFoodPlaces.add("McDonald's");

        fastFoodPlaces.forEach(System.out::println);
    }

    public static void lists(){
        List<String> footballTeams = new ArrayList<>();
        footballTeams.add("Eagles");
        footballTeams.add("Packers");
        footballTeams.add("Chiefs");
        footballTeams.add("49ers");
        footballTeams.add("Cowgirls");

        for(int i = 0; i < footballTeams.size(); i++){
            System.out.println("Football team: " + footballTeams.get(i));
        }

        System.out.println();
        System.out.println("-----------------------------");
        System.out.println();

        Collections.sort(footballTeams);
        for(String team : footballTeams){
            System.out.println("Enhanced Loop Football: " + team);
        }

        System.out.println();
        System.out.println("-----------------------------");
        System.out.println();

        footballTeams.remove("Cowgirls");
        Collections.sort(footballTeams, Collections.reverseOrder());

        for(String team : footballTeams){
            System.out.println("Enhanced Loop 2 Football: " + team);
        }

        System.out.println();
        System.out.println("-----------------------------");
        System.out.println();


        footballTeams.forEach(team -> System.out.println("For Each Team: " + team));

    }

    public static void arrays(){
        String[] names = new String[]{"Evan", "Zach", "Frank", "Travis", "Kim"};
//        names[0] = "Evan";
//        names[1] = "Zach";
//        names[2] = "Frank";
//        names[3] = "Travis";
//        names[4] = "Kim";

        for(int i = 0; i < names.length; i++){
            System.out.println("Name: " + names[i]);
        }

        System.out.println();
        System.out.println("-----------------------------");
        System.out.println();

        Arrays.sort(names);
        for(String name : names){
            System.out.println("Enhanced Loop Name: " + name);
        }
    }
}
