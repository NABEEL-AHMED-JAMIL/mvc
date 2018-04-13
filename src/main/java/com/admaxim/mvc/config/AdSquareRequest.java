package com.admaxim.mvc.config;

import au.com.bytecode.opencsv.CSVReader;
import net.sf.json.JSONObject;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.StringUtils;


public class AdSquareRequest {

    private static Map<String, String> segmentMap = new HashMap<String, String>();
    private static CSVReader csvReader = null;
    private static InputStream inputStream =  null;


    static {
        segmentMap = getSegmentCatMap();
    }

    public static Map<String, String> getSegmentCatMap() {

        HashMap<String, String> segmentCatMap = new HashMap<>();
        try {

            ClassLoader loader = Thread.currentThread().getContextClassLoader();
            // ClassLoader.getSystemResource("test.htm");
            inputStream = loader.getResourceAsStream("schema/Adsquare-Audience.csv");

            synchronized (inputStream) {
                csvReader = new CSVReader(new InputStreamReader(inputStream));
            }

            List<String[]> list = csvReader.readAll();
            int count = 0;
            // strings [] = {id, name, description}
            // read line and convert the line into the list
            for (String[] strings: list) {
                // this one stop to show these think
                // id,name,description
                if(count == 0) {
                    count ++;
                    continue;
                }
                segmentCatMap.put(strings[0], strings[1] + " "+ strings[2]);
            }
        }catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                csvReader.close();
                inputStream.close();
            }catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        return segmentCatMap;
    }


    public static HashMap<String, String> getAdSquareSegments(APIParams apiParams) {

        URL targetURL;
        JSONObject mainObject = null;
        HashMap<String, String> externalSegmentAudienceMap = new HashMap<>();
        InputStream inputStream = null;

//        try {
//
//        } catch () {}

        return null;
    }

    private static String buildAdSquareUrlParams() {
        APIParams apiParams = new APIParams();
        final String apiKey = "f48f9f9c-7622-4f99-926e-f6261f167b84";
        final String adSquareUrl = "http://api.adsquare.com/2.0/";
        final String audienceUrlPart = "audience/query";
        StringBuilder url = new StringBuilder();

        // lat and lon is mandoary for adsquare segment data
        if (StringUtils.isNotBlank((apiParams.getLAT())) && StringUtils.isNotBlank(apiParams.getLON())) {
            url.append(adSquareUrl).append(audienceUrlPart).append("?apiKey=").append(apiKey);
            url.append("&lat=").append(apiParams.getLAT()).append("&lng=").append(apiParams.getLON());

            if (StringUtils.isNotBlank(apiParams.getDeviceIdfa())) {
                url.append("&idfa=").append(apiParams.getDeviceIdfa());
            }
            if (StringUtils.isNotBlank(apiParams.getDeviceMd5udid())) {
                url.append("&md5=").append(apiParams.getDeviceMd5udid());
            }

            if (StringUtils.isNotBlank(apiParams.getDeviceSha1mac())) {
                url.append("&sha1=").append(apiParams.getDeviceSha1mac());
            }
            if (StringUtils.isNotBlank(apiParams.getRemoteIp())) {
                url.append("&userIp=").append(apiParams.getRemoteIp());
            }
            // need to discuss this point
            if (StringUtils.isNotBlank(apiParams.getSiteId())) {
                url.append("&appId=").append(StringUtils.substringAfter(apiParams.getSiteId(), "_"));
            }
            if (StringUtils.isNotBlank(apiParams.getMAKE())) {
                url.append("&vendor=").append(apiParams.getMAKE());
            }
            if (StringUtils.isNotBlank(apiParams.getMODEL())) {
                url.append("&model=").append(apiParams.getMODEL());
            }
            if (StringUtils.isNotBlank(apiParams.getCARRIER())) {
                url.append("&carrier=").append(apiParams.getCARRIER());
            }
            if (StringUtils.isNotBlank(apiParams.getConnectionType())) {
                url.append("&connection=").append(apiParams.getConnectionType());
            }
            if (StringUtils.isNotBlank(apiParams.getCOUNTRY())) {
                url.append("&country=").append(apiParams.getCOUNTRY());
            }
            if (StringUtils.isNotBlank(apiParams.getSTATE())) {
                url.append("&state=").append(apiParams.getSTATE());
            }
            if (StringUtils.isNotBlank(apiParams.getCITY())) {
                url.append("&city=").append(apiParams.getCITY());
            }
            if (StringUtils.isNotBlank(apiParams.getZIP())) {
                url.append("&zipcode=").append(apiParams.getZIP());
            }
        }
        return url.toString();
    }


    private static void test() {
        try {

            URL impUrl = new URL("https://adstaging.admaxim.com/adtracker/track/track/imp?" +
                    "id=Z7816Z75088Z-1Z17856_e131e6b9cd644d543a37dd2bcc810956Z8Z0Z0ZZ0.1Z0.075Z0.0Z0." +
                    "02500000000000001ZinZZZZgoogleZdesktop_0ZchromeZX-c59dfe8f-7cd7-43bd-aad0-a5769253" +
                    "40e2ZZZagx62-gnx52Z0-0-Z-1Z320x180Z2a1edd15-ec75-4532-988b-f49269ed44fcZZ1Z3ZZ17856Z1" +
                    "7869Z2Z0ZZZZZ&ts=1521737563579&videoBidPrice=${AUCTION_PRICE}");

            InputStream impis = impUrl.openConnection().getInputStream();
            String impStr = IOUtils.toString(impis);
            System.out.println("impstr: " + impStr);

            //
            URL clickUrl = new URL("https://adstaging.admaxim.com/adtracker/track/track/interaction?" +
                    "id=Z7816Z75088Z-1Z17856_e131e6b9cd644d543a37dd2bcc810956Z8Z0Z0ZZ0.1Z0.075Z0.0Z0." +
                    "02500000000000001ZinZZZZgoogleZdesktop_0ZchromeZX-c59dfe8f-7cd7-43bd-aad0-a576925340e2ZZZagx62-" +
                    "gnx52Z0-0-Z-1Z320x180Z2a1edd15-ec75-4532-988b-f49269ed44fcZZ1Z3ZZ17856Z17869Z2Z0ZZZZZ&" +
                    "type=video&event=start");

            InputStream clickis = clickUrl.openConnection().getInputStream();
            String clickStr = IOUtils.toString(clickis);
            System.out.println("Clickstr: " + clickStr);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println(buildAdSquareUrlParams());
//        test();
    }
}
