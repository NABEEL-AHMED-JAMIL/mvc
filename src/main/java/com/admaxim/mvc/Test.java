package com.admaxim.mvc;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;
import org.apache.commons.lang.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

public class Test {

//    throw new RuntimeException("STX Creative Submit Failed : HTTP error code : " + response.getStatus());

    public static void main(String args[]) {
//        String strHTMLInput = "<p>MyName<p>";
//        String strEscapeHTML = StringEscapeUtils.escapeHtml(strHTMLInput);
//        String strUnEscapeHTML = StringEscapeUtils.unescapeHtml(strEscapeHTML);
//        System.out.println("Escaped HTML >>> " + strEscapeHTML);
//        System.out.println("UnEscaped HTML >>> " + strUnEscapeHTML);
//        System.out.println(dealIdCheckPoint());
//        System.out.println(isIPV4orIPV6("149.254"));
//
//        JSONObject title = new JSONObject();
//        // real object title
//        JSONObject titleAsst = new JSONObject();
//
//        JSONArray assetsArray = new JSONArray();
//
//        titleAsst.put("text", "pakistan");
//        title.put("title", titleAsst);
//        System.out.println(title);
//        System.out.println(titleAsst);
//        assetsArray.add(JSONSerializer.toJSON(title));
//        System.out.println(assetsArray);

        Map<String , String> pakistan = new HashMap<>();
        pakistan.put("1", "1");
        pakistan.put("2", "1");
        pakistan.put("3", "1");
        pakistan.put("4", "1");
        pakistan.put("5", "1");
        pakistan.put("6", "1");
        System.out.println(pakistan.toString());


        String CKEY = "ckey[]=";
        for (Map.Entry<String, String> entry : pakistan.entrySet())
        {
            System.out.println(entry.getKey() + "/" + entry.getValue());
            CKEY += entry.getKey()+"&";

        }


        System.out.println(CKEY.substring(0, CKEY.length()-1));
//
//
//        for (Map.Entry<String, String> entry : pakistan.entrySet())
//        {
//            System.out.println(entry.getKey() + "/" + entry.getValue());
//        }
//

    }


    public static String isIPV4orIPV6(String ip) {
        if (StringUtils.containsIgnoreCase(ip, ":")) {
            return ""; //ipv6toipv4(ip);
        } else if (StringUtils.containsIgnoreCase(ip, ".")) {
            switch (ip.split("\\.").length) {
                case 1:
                    ip += ".1.1.1";
                    break;
                case 2:
                    ip += ".1.1";
                    break;
                case 3:
                    ip += ".1";
                    break;
            }
            return ip;
        }
        return ip;
    }

    private static boolean dealIdCheckPoint() {
        String dealId = "1032318112117-6874111, 10326871318112117, 318112117";

        String dealids[] = dealId.split(",");

        for (String id : dealids) {
            switch(id.trim()) {
                case "1032318112117-6874":
                    return true;
                case "1032318112117-6871":
                    return true;
                case "318112117":
                    return true;
                default:
                    continue;
            }

        }
        return false;
    }
}
