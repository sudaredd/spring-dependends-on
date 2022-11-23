package app.springdependency;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Service;

import java.util.List;

@DependsOn(ZServiceConfigManager.beanName)
@Service
@Slf4j
public class LookupCache extends BaseCache {

    public LookupCache(Configurations configurations) {
        super(configurations);
    }

    @Override
    public void populate(List<String> configurations) {
        log.info("configurations {}", configurations);
    }
}
