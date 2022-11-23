package app.springdependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FileConfigReader {

    @Autowired
    Configurations configurations;

    public void loadConfigs() {
        configurations.setApplicationConfigs(List.of("FILE1", "FILE2"));
    }
}
