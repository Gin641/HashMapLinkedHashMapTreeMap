import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("Gin",46);
        hashMap.put("Mon",23);
        hashMap.put("kiu",1);
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap + "\n");
        TreeMap<String,Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);
        LinkedHashMap<String,Integer> linkedHashMap = new LinkedHashMap<>(16,0.75f,true);
        linkedHashMap.put("Gin",46);
        linkedHashMap.put("Mon",23);
        linkedHashMap.put("Kiu",1);
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Lewis"));
    }
}
