package app.springdependency;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Configurations {

    private List<String> applicationConfigs = new ArrayList<>();

    public void setApplicationConfigs(List<String> applicationConfigs) {
        this.applicationConfigs = applicationConfigs;
    }

    public List<String> getApplicationConfigs() {
        return applicationConfigs;
    }
}
