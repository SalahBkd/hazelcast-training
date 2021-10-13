import com.hazelcast.config.Config;
import com.hazelcast.config.ManagementCenterConfig;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import java.util.*;

public class MyHazelcastSimpleMemberApp {
    public static void main(String[] args) {
        Config config = new Config();
        ManagementCenterConfig centerConfig = new ManagementCenterConfig();
        centerConfig.setEnabled(true);
        centerConfig.setUrl("http://localhost:8080/hazelcast-mancenter/");
        config.setManagementCenterConfig(centerConfig);
        HazelcastInstance hazelcastInstance = Hazelcast.newHazelcastInstance(config);
        Map<Long, String> data = hazelcastInstance.getMap("products");
        for (long i = 0; i < 10000; i++) {
            data.put(i, "product " + i);
        }


    }
}
