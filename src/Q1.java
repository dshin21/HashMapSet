import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Q1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("C:\\Users\\danie\\Downloads\\HashMapSet\\src\\love.txt"));

        Map<String, Integer> m = new HashMap<>();

        while (sc.hasNext()) {
            String word = sc.next().toLowerCase();
            if (!m.containsKey(word)) {
                m.put(word, 1);
            } else if (m.containsKey(word)) {
                int temp = m.get(word);
                m.put(word, ++temp);
            }

        }

        Map<String, Integer> sorted = new TreeMap<>(m);
        for (Object k : sorted.keySet())
            System.out.println(k + " : " + sorted.get(k));

        sc.close();
    }
}
