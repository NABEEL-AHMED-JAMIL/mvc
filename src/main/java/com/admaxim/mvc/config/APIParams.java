package com.admaxim.mvc.config;

public class APIParams {

    public static final String LAT = "lat";
    public static final String LON = "lon";
    public static final String DEVICE_IDFA = "idfa";

    public static final String DEVICE_MD5UDID = "md5udid";

    public static final String DEVICE_SHA1MAC = "sha1mac";
    public static final String REMOTE_IP = "remoteIP";

    public static final String SITE_ID = "siteId";

    public static String MAKE = "make";

    public static String MODEL = "model";

    public static final String CITY = "city";

    public static final String STATE = "state";

    public static final String ZIP = "zip";

    public static final String COUNTRY = "country";

    public static String CONNECTION_TYPE = "connectionType";
    public static String CARRIER = "carrier";




    public static String getDeviceIdfa() {
        return DEVICE_IDFA;
    }

    public static String getDeviceMd5udid() {
        return DEVICE_MD5UDID;
    }

    public static String getDeviceSha1mac() {
        return DEVICE_SHA1MAC;
    }

    public static String getRemoteIp() {
        return REMOTE_IP;
    }

    public static String getSiteId() {
        return SITE_ID;
    }

    public static String getMAKE() {
        return MAKE;
    }

    public static String getMODEL() {
        return MODEL;
    }

    public static String getCITY() {
        return CITY;
    }

    public static String getSTATE() {
        return STATE;
    }

    public static String getZIP() {
        return ZIP;
    }

    public static String getCOUNTRY() {
        return COUNTRY;
    }

    public static String getConnectionType() {
        return CONNECTION_TYPE;
    }

    public static String getCARRIER() {
        return CARRIER;
    }

    public static String getLAT() { return LAT; }

    public static String getLON() { return LON; }
}
