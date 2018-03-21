package com.admaxim.mvc.config;

public enum TeadAdType {

    VIDEO(1),
    GAME(2),
    MUSIC(3),
    APPLICATION(4),
    TEXT(5),
    OTHER(6),
    UNKNOWN(7),
    INREAD(101),
    INBOARD(102);

    private final int teadAdType;

    private TeadAdType(int teadAdType) {
        this.teadAdType = teadAdType;
    }

    public int getValue() {
        return teadAdType;
    }

    public static String getStringValue(TeadAdType teadAdType) {
        return teadAdType.toString();
    }

    public static String getNumericStringValue(TeadAdType teadAdType) {
        Integer typeValue = teadAdType.getValue();
        return typeValue.toString();
    }

    public static String getTeadAdType(String value) {
        switch (value) {
            case "1":
                return getStringValue(TeadAdType.VIDEO);
            case "2":
                return getStringValue(TeadAdType.GAME);
            case "3":
                return getStringValue(TeadAdType.MUSIC);
            case "4":
                return getStringValue(TeadAdType.APPLICATION);
            case "5":
                return getStringValue(TeadAdType.TEXT);
            case "6":
                return getStringValue(TeadAdType.OTHER);
            case "7":
                return getStringValue(TeadAdType.UNKNOWN);
            case "101":
                return getStringValue(TeadAdType.INREAD);
            case "102":
                return getStringValue(TeadAdType.INBOARD);
            default:
                return getStringValue(TeadAdType.UNKNOWN);
        }
    }

}
