import java.util.*;

public class Lookup {

    public static Map<Integer, String> map;

    static {
        map = new HashMap<>();
        map.put(1, "Book");
        map.put(2, "Video");
        map.put(3, "Audio");
    }

    public static void main(String[] args) {
        System.out.println(map);
        Video v = new Video();
        v.getDescription();
    }
}