import java.util.HashMap;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("nom", "Dupuis");
        hashMap.put("Yosef", "Jacque");
        hashMap.put("age", "30");

        System.out.println("-----");

        for (String k : hashMap.keySet()) {
            System.out.println(k + " : " +  hashMap.get(k));
        }

        System.out.println(hashMap.get("prenom") + " " + hashMap.get("nom") + " a " + hashMap.get("age")+ " ans");

    }
}