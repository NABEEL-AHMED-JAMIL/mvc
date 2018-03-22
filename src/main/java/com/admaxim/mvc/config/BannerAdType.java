package com.admaxim.mvc.config;

public enum BannerAdType {

    TEXT(1),
    BANNER(2),
    JAVASCRIPT(3),
    IFRAME(4);

    private final int bannerAdType;

    private BannerAdType(int bannerAdType) {
        this.bannerAdType = bannerAdType;
    }

    public int getBannerAdType() { return bannerAdType; }

    public static String getStringValue(BannerAdType bannerAdType) {
        return bannerAdType.toString();
    }

    public static String getNumericStringValue(BannerAdType bannerAdType) {
        Integer typeValue = bannerAdType.getBannerAdType();
        return typeValue.toString();
    }

    public static String getBannerAdType(String value) {
        switch (value) {
            case "1":
                return getStringValue(BannerAdType.TEXT);
            case "2":
                return getStringValue(BannerAdType.BANNER);
            case "3":
                return getStringValue(BannerAdType.JAVASCRIPT);
            case "4":
                return getStringValue(BannerAdType.IFRAME);
            default:
                return getStringValue(BannerAdType.BANNER);
        }
    }

}
