package app.springdependency;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Random;

@Service(ZServiceConfigManager.beanName)
public class ZServiceConfigManager {
  public static final String beanName = "zServiceConfigManager";
  @Autowired FileConfigReader fileConfigReader;
  @Autowired ServiceConfigReader serviceConfigReader;

  @SneakyThrows
  @PostConstruct
  void init() {
    if (new Random().nextBoolean()) {
      fileConfigReader.loadConfigs();
    } else serviceConfigReader.loadConfigs();
  }
}
