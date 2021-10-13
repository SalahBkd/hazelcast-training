import com.hazelcast.config.Config;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import java.util.*;

public class HazelcastMember {
    public static void main(String[] args) {
        Config config = new Config();
        HazelcastInstance hazelcastInstance = Hazelcast.newHazelcastInstance();
        Map<Integer, String> data = null;
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println(">");
            String command = scanner.nextLine();
            String[] items = command.split(" ");
            if(items[0].equals("map")) {
                data = hazelcastInstance.getMap(items[1]);
                System.out.println("Map: " + items[1]);
            } else if(items[0].equals("set")) {
                data.put(Integer.parseInt(items[1]), items[2]);
            } else if(items[0].equals("get")) {
                System.out.println(data.get(Integer.parseInt(items[1])));
            } else if(items[0].equals("size")) {
                System.out.println(data.size());
            }
        }

    }
}
