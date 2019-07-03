package com.kodilla.patterns.singleton;

public class SettingFileEngine {

    private static SettingFileEngine settingFileEngineInstance = null;
    private String fileName = "";

    private SettingFileEngine() {
    }

    public static SettingFileEngine getInstance() {
        if (settingFileEngineInstance == null) {
            synchronized(SettingFileEngine.class) {
                if (settingFileEngineInstance == null) {
                    settingFileEngineInstance = new SettingFileEngine();
                }
            }
        }
        return settingFileEngineInstance;
    }

    public String getFileName() {
        return fileName;
    }

    public void open(final String fileName) {
        this.fileName = fileName;
        System.out.println("Opening the settings file");
    }

    public void close() {
        this.fileName = "";
        System.out.println("Closing the settings file");
    }

    public boolean loadSettings() {
        System.out.println("Loading settings from file");
        return true;
    }

    public boolean saveSettings() {
        System.out.println("Saving settings to file");
        return true;
    }
}

