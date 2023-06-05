import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        TreeMap<String, Integer> mats = new TreeMap<>();

        System.out.println("How many armor pieces:");
        int armorAmount = keyboard.nextInt();
        for (int i = 0; i < armorAmount; i++){
            System.out.println("Armor code and next tier, separate by space:");
            String armorCode = keyboard.next();
            int tier = keyboard.nextInt();
            
            armor piece = new armor(armorCode, tier);
            for (Map.Entry<String, Integer> entry : piece.getMats().entrySet()){
                mats.put(entry.getKey(), mats.getOrDefault(entry.getKey(), 0) + entry.getValue());
            }
        }
        
        for (Map.Entry<String, Integer> entry : mats.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
