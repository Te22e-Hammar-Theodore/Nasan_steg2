import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Steg 1
        String[] leksaker = {"Pokéball", "Legendary scar nerf gun", "Flowberry plush", "Barbie", "Bilar"};

        // Steg 2
        /*for (int i = 0; i < leksaker.length; i++) {
            System.out.println(leksaker[i]);
        }*/
        for (String leksak : leksaker) {
            System.out.println(leksak);
        }

        // Steg 3 & 4
        String[] klasskamrater = {"Eirich", "Lodwog", "Bilip", "Zuttis", "Ostis"};
        int[] nummer = {4, 8, 1, 7, 3};

        for (int i = 0; i < klasskamrater.length; i++) {
            System.out.println(klasskamrater[i] + " ger leksaken " + leksaker[i] + " betyget: " + nummer[i]);
        }

        // Sista stegen
        ArrayList<String> cities = new ArrayList<>();
        while (true) {
            System.out.println("What city do you want to add to the list, write exit to end the loop");
            System.out.println(">>> ");
            String cityAnswer = sc.nextLine();
            if (cityAnswer.equalsIgnoreCase("exit")) {
                break;
            }
            cities.add(cityAnswer);
        }
        for (String city : cities) {
            System.out.println(city);
        }
    }
}