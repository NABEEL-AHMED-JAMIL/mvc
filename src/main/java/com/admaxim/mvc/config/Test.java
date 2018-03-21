package com.admaxim.mvc.config;

import java.io.IOException;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;

import com.google.common.primitives.Doubles;
import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;
import org.apache.commons.lang.StringUtils;
import static com.admaxim.mvc.mapping.IRtbRequest.RTB_R_BNR_API;


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

    private static Set<Integer> filerCampaignsBySizeAdType(Set<Integer> cpnIds, ArrayList<String> sizes, ArrayList<AdType> adTypes) {
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
    // ok
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

    // ok
    private static void helloBoss() {
        System.out.println("Hello Testing");
    }


    /**
     *  "api": [ 3 ]
     *  1 ==> VPAID 1.0
     *  2 ==> VPAID 2.0
     *  3 ==> MRAID-1
     *  4 ==> ORMMA
     *  5 ==> MRAID-2
     *  */

    /**
     * "banner": {
     *      "w": 728,
     *      "h": 90,
     *      "pos": 1,
     *      "btype": [ 4 ],
     *      "battr": [ 14 ],
     *      "api": [ 3 ]
     *  }
     * */
    // ok
    private static String getAdType(JSONObject bannerObject) {

        String adType = "";
        if (bannerObject.containsKey(RTB_R_BNR_API) &&
                !bannerObject.getString(RTB_R_BNR_API).equalsIgnoreCase("null")
                && bannerObject.getJSONArray(RTB_R_BNR_API).size() > 0) {
            // getting the first value from the array at index on "0"
            int apiType = bannerObject.getJSONArray(RTB_R_BNR_API).getInt(0);

            if (apiType == 3 || apiType == 5) { // according to OpenRTB2.3 documentation, api 3 and 5 means Mraid 1.0 and Mraid2.0 respectively.
                adType = AdType.getNumericStringValue(AdType.BANNER_AD) + "," + AdType.getNumericStringValue(AdType.EXPANDABLE);
            } else {
                adType = AdType.getNumericStringValue(AdType.BANNER_AD);
            }

        }else {
            adType = AdType.getNumericStringValue(AdType.BANNER_AD);
        }

        return adType;
    }

    // ok
    private static double getDoubleAdRequestParameter(String param, double defaultValue) {

        if (StringUtils.isNotEmpty(param) && Doubles.tryParse(param) != null) {
            return Double.parseDouble(param);
        }

        return defaultValue;
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


    /**
     * {
     *   id: Z7844Z74338Z-1Z18736,
     *   impid:24678Z8Z0Z0ZZ40.0Z30,
     *   bidid:0Z0.0Z10.0ZgbZnorth
     * }
     */
    // ok
    private static String getAppIds(String str) {

        String[] ids = new String[] {"id","impid","bidid"};
        String[] values = str.split("_");
        StringBuilder builder = new StringBuilder();
        String newLine = "\n";

        builder.append("{").append(newLine);
        int i = 0;
        for (String value: values) {

            if(i == ids.length) { break; }
            builder.append(ids[i]).append(":").append(value).append( ids.length-1 != i ? ","+newLine : newLine);
            i++;

        }
        builder.append("}");

        return builder.toString();
    }

    private static String getDealIds(HashMap<String, String> paramMap) {
        return null;
    }

    // ok
    private static Map<String, String> getAdFormat(String formats) {

        // String formats = "1,2,3";
        String[] arrFormats = StringUtils.split(formats, ",");
        Map map = new HashMap();

        for (String arrFormat : arrFormats) {
            if (StringUtils.equalsIgnoreCase(arrFormat, "114")) {

                map.put("aType", "6");
                map.put("adspot", "Interstitial");

                break;
            } else if (StringUtils.equalsIgnoreCase(arrFormat, "110") || StringUtils.equalsIgnoreCase(arrFormat, "111")
                    || StringUtils.equalsIgnoreCase(arrFormat, "112") || StringUtils.equalsIgnoreCase(arrFormat, "116")
                    || StringUtils.equalsIgnoreCase(arrFormat, "118")) {

                map.put("aType", "6 & 10");

                break;
            }
        }

        if (map.isEmpty()) {
            map.put("aType", "6");
        }

        return map;
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

    // ok
    public static boolean isValidIP(String ipStr) {
        String regex = "^(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$";
        return Pattern.matches(regex, ipStr);
    }

    // ok
    private static String getFloorPrice(String floorKey, String floorValue) {

        if(!StringUtils.equalsIgnoreCase(floorKey, "floorcur")) {
            if(StringUtils.indexOf(floorValue,"=") > 0) {
                floorValue = StringUtils.substringAfter(floorValue, "=");
            }
        }

        return floorValue;
    }


    private static String audioResponse() {
        return null;
    }

    private static String response() {
        return null;
    }


    // ok
    public static <E> void printArray(E[] inputArray) {
        for (E element: inputArray) {
            System.out.println(element);
        }

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

    // ok
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

        System.out.println(getDoubleAdRequestParameter("1.0", 2.0));
        System.out.println(adxNativeResponse().toString());
        System.out.println(getIntTestV(12, 18));
        extractUrlFromBeacon();
        System.out.println(getAdType(JSONObject.fromObject("{ \"api\": [3] }")));
        System.out.println(isValidIP("124.29.217.7"));

    }



}
