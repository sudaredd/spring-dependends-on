package app.springdependency;

import jakarta.annotation.PostConstruct;
import java.util.List;

public abstract class BaseCache {
    Configurations configurations;

    public BaseCache(Configurations configurations) {
        this.configurations = configurations;

    }
    @PostConstruct
    void populate() {
        populate(configurations.getApplicationConfigs());
    }

    protected abstract void populate(List<String> configurations);
}
