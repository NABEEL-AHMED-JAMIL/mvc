package com.admaxim.mvc.config;

import java.io.IOException;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;


public class Test {


    private static String str;
    private static Integer[] SUPPORTED_VIDEO_DURATIONS = {0,5,10,15,30,45,60,90,120};
    static JSONSerializer jsonSerializer;

    private static final ConcurrentHashMap<String, HashSet<Integer>> adSizeCache
            = new ConcurrentHashMap<String, HashSet<Integer>>();

    private static final ConcurrentHashMap<Integer, HashSet<Integer>> adTypeCache
            = new ConcurrentHashMap<>();

    static {

        // ad Size cache
        HashSet<Integer> adSizeSet = new HashSet<>();
        adSizeSet.add(59867);
        adSizeCache.put("59867", adSizeSet);

        // ad Type cache
        HashSet<Integer> adTypeSet = new HashSet<>();
        adTypeSet.add(58793);
        adTypeCache.put(50, adTypeSet);

    }

    private static Set<Integer> filterCamignsBySizeAdType(Set<Integer> cpnIds, ArrayList<String> sizes, ArrayList<AdType> adTypes) {
        return null;
    }

    /*
    * headline: 'hello headline'
    * body: call_to_action: 'hello call_to_action'
    * advertiser: 'hello advertiser'
    * image {
    *   url: 'hello url'
    *   width: 1200
    *   height: 627
    *   }
    *
    *   logo {
    *       app_icon {
    *           url: 'hello logo'
    *           width: 1200
    *           height: 627
    *       }
    *       logo {
    *           app_icon {
    *               url: 'hello logo'
    *               width: 1200
    *               height: 627
    *           }
    *       }
    *   }
     */
    private static String adxNativeResponse() {
        String NEW_LINE = "\n";
        StringBuilder nativead = new StringBuilder();

        nativead.
                append("headline: ").
                append("'hello headline'").
                append(NEW_LINE).
                append("body: ").append("call_to_action: ").append("'hello call_to_action'").
                append(NEW_LINE).
                append("advertiser: ").append("'hello advertiser'").
                append(NEW_LINE).
                append("image {").
                append(NEW_LINE).
                append("url: ").append("'hello url'").
                append(NEW_LINE).
                append("width: 1200 ").
                append(NEW_LINE).
                append("height: 627").
                append(NEW_LINE).
                append("}").
                append(NEW_LINE).
                append("logo {").
                append(NEW_LINE).
                append("app_icon {").
                append(NEW_LINE).
                append("url: ").append("'hello logo'").
                append(NEW_LINE).
                append("width: 1200 ").
                append(NEW_LINE).
                append("height: 627").
                append(NEW_LINE).
                append("}").append(NEW_LINE).
                append("logo {").append(NEW_LINE).
                append("app_icon {").append(NEW_LINE).
                append("url: ").
                append("'hello logo'").append(NEW_LINE).
                append("width: 1200 ").append(NEW_LINE).
                append("height: 627").append(NEW_LINE).
                append("}");
        return nativead.toString();


    }

    private static void helloBoss() {
        System.out.println("Hello Testing");
    }

    private static String getAdType(JSONObject jsonObject) {
        return null;
    }


    private static double getDoubleAdRequestParameter(String param, double defaultValue) {
        return 0.0;
    }

    private static HashMap<String, Map<String, String>> populateDummyNativeVideoData() {
        return null;
    }

    private static String getProtocolType(List requestProtocolsArray) {
        return null;
    }

    private static String getUTFString(String encodeStr) throws IOException {
        return null;
    }

    public static String unescapeLang(String escaped) {
        return null;
    }

    private static Set<String> extractUrlFromBeacon() {
        return null;
    }

    private String getOsType(Map<String, String[]> paramMap) {
        return null;
    }

    private static String getAppId(String str) {
        return null;
    }

    private static String getDealIds(HashMap<String, String> paramMap) {
        return null;
    }

    private static Map<String, String> getAdFormat(String formats) {
        return null;
    }

    private static String getSeatsByDealId(Map<String, String> map) {
        return null;
    }

    public static String getCurrentTimeStamp() {
        return null;
    }

    /*
    <?xml version="1.0" encoding="utf-8"?>
    <NAST version="1.0"><Ad><Assets>
    <Text type="rating"><![CDATA[4]]></Text>
    <Text type="advertiser"><![CDATA[Supercell Oy]]></Text>
    <Text type="cta"><![CDATA[Install Now]]></Text>
    <Text type="description"><![CDATA[Hay Day is a totally new farming experience with smooth gestural controls lovingly hand...]]></Text>
    <Text type="headline"><![CDATA[Hay Day]]></Text>
    <Image type="icon" width="512" height="512"><![CDATA[http://creative1cdn.mobfox.com/97f7e8a465268a733da68349c7f0340a.gif]]></Image>
    <Image type="main" width="1200" height="627"><![CDATA[http://creative1cdn.mobfox.com/26140822990d48320955a3e5fabf8ef5.gif]]></Image>
    </Assets>
    <Actions><Action type="click">{Native_Ad_Click_URL}</Action></Actions>
    <Trackers>
    <Tracker type="impression">{Impression_Pixel_URL}</Tracker>
    </Trackers>
    </Ad></NAST>
     */
    private static String getVideoDuraionQueryPart(int minVidDuration, int maxVidDuration) {
        return null;
    }

    public static boolean isValidIP(String ipStr) {
        return true;
    }

    private static String getFloorPrice(String floorPrice) {
        return null;
    }

    private static String getFloorPrice(String floorKey, String floorValue) {
        return null;
    }

    private static Set<String> extractUrlFromBeacon(String imp) {
        return null;
    }

    private static String audioResponse() {
        return null;
    }

    private static String response() {
        return null;
    }

    static void getLongV(long l) {

    }

    public static <E> void printArray(E[] inputArray) {

    }

    private static String unityNoBidResponseMessage(String requestId) {
        return null;
    }

    private static int getIntAdRequestParameter(String param, int defaultValue) {
        return 0;
    }

    public static String[] getCategories(String cat) {
        return null;
    }

    private static int getIntTestV(int a, int b) {

        if(a == 4) {
            return a;
        } else if(b == 8) {
            return b;
        }

        return 12;
    }

    private static String removeImpTagFromCompanionExternalTag(String companionExternalTag) {
        return null;
    }

    public static void main(String[] args)  {


        System.out.println(adxNativeResponse().toString());
        System.out.println(getIntTestV(12, 18));

    }



}
