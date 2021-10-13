import com.hazelcast.config.Config;
import com.hazelcast.config.ManagementCenterConfig;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

public class HazelcastSimpleMember {
    public static void main(String[] args) {
        Config config = new Config();
        ManagementCenterConfig centerConfig = new ManagementCenterConfig();
        centerConfig.setEnabled(true);
        centerConfig.setUrl("http://localhost:8080/hazelcast-mancenter/");
        config.setManagementCenterConfig(centerConfig);
        HazelcastInstance hazelcastInstance = Hazelcast.newHazelcastInstance(config);

    }
}
