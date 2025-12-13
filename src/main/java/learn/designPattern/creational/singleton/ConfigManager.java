package learn.designPattern.creational.singleton;

public class ConfigManager {

    /* When a variable is declared as volatile, every read comes directly from main memory, and every write goes directly to main memory.
    So if one thread updates the value, other threads will immediately see the updated value. */
    private static volatile ConfigManager configManager;

    private ConfigManager(){}

    public static ConfigManager getInstance(){
        if(configManager == null){
            synchronized (ConfigManager.class){
                if(configManager==null){
                    configManager = new ConfigManager();
                }
            }
        }
        return configManager;
    }
}
