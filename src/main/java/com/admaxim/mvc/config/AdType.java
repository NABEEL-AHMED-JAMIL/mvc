package com.admaxim.mvc.config;

import java.util.ArrayList;

public enum  AdType {

    INVALID(-1),
    AUDIO(1),
    COUPON(2),
    SEARCH_AD(3),
    TEXT_AD(4),
    TEXTLINK_AD(5),
    BANNER_AD(6),
    ANIMATED_BANNER_AD(7),
    VIDEO(8),
    SMS(9),
    EXPANDABLE(10),
    INTERACTIVE(11),
    ADGIBBON_DART(16),
    ADGIBBON_MOCEAN(17),
    ADGIBBON_OPENX(18),
    ADGIBBON_MADS(19),
    DYNAMIC_HTML(20),
    NATIVE(50);

    private final int type;

    private AdType(int type) {
        this.type = type;
    }

    public int getValue() {
        return type;
    }

    public static String getStringValue(AdType adType) {
        return adType.toString();
    }

    public static String getNumericStringValue(AdType adType) {
        return String.valueOf(adType.getValue());
    }

    public static AdType getAdType(int value) {
        switch(value) {
            case 1:
                return AUDIO;
            case 2:
                return COUPON;
            case 3:
                return SEARCH_AD;
            case 4:
                return TEXT_AD;
            case 5:
                return TEXTLINK_AD;
            case 6:
                return BANNER_AD;
            case 7:
                return ANIMATED_BANNER_AD;
            case 8:
                return VIDEO;
            case 9:
                return SMS;
            case 10:
                return EXPANDABLE;
            case 11:
                return INTERACTIVE;
            case 49:
            default:
                return INVALID;
            case 16:
                return ADGIBBON_DART;
            case 17:
                return ADGIBBON_MOCEAN;
            case 18:
                return ADGIBBON_OPENX;
            case 19:
                return ADGIBBON_MADS;
            case 20:
                return DYNAMIC_HTML;
            case 50:
                return NATIVE;
        }
    }

    public static ArrayList<AdType> parseAdTypes(String adTypeStr) {
        ArrayList<AdType> adTypeArrayList = new ArrayList<>();

        String[] adTypes = adTypeStr.split(",");

        for (String adType: adTypes) {
            adTypeArrayList.add(getAdType(Integer.parseInt(adType)));
        }
        return adTypeArrayList;
    }

    public static void main(String args[]) {

        System.out.println(getStringValue(SMS));
        System.out.println(getNumericStringValue(SMS));

        System.out.println(parseAdTypes("1,2,3,4,5,5,6"));

    }

}
