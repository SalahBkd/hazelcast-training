import com.hazelcast.client.HazelcastClient;
import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.core.HazelcastInstance;
import java.util.*;

public class HazelCastClient {
    public static void main(String[] args) {
        ClientConfig clientConfig = new ClientConfig();
        HazelcastInstance hazelcastInstance = HazelcastClient.newHazelcastClient();
        Map<Integer, String> map = hazelcastInstance.getMap("clients");
        System.out.println("Client 4: " + map.get(4));
        System.out.println("Size: " + map.size());
    }
}
