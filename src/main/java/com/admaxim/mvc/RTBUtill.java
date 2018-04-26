package com.admaxim.mvc;

import org.apache.commons.lang.StringUtils;

import java.net.URI;
import java.net.URLDecoder;
import java.util.StringTokenizer;

public class RTBUtill {

    public static void main(String args[]) {
        String[] tlds = new String[] { "http://www.cnn.com", "cnn.com", "http://a.cnn.com?a=b",
                "http://www.cnn.com?a=b&c=d", "https://www.cnn.com", "mailto://www.cnn.com", "tel:12345",
                "http://a.b.cnn.co.in?a=b" };
//        getTLDV2();
//        for (String tld : tlds) {
//            System.out.println(getTLDV2(tld));
//        }
        for (String cat : convertStringToStringArray("cat-1,cat-2,cat-3")) {
            System.out.println(cat);
        }

    }


    public static String[] convertStringToStringArray(String param) {
        String[] str = new String[1];
        str[0] = param;
        return str;
    }

    public static String getTLDV2(String url) {
        URI uri = null;
        String tld = "";
        try {
            url = URLDecoder.decode(url, "UTF-8");
            // real url show
//            System.out.println(url);
            // if contain the http then enter
            if(StringUtils.contains(url, "http")) {
                url = StringUtils.substringBefore(url, "[");
//                System.out.println(url);
                url = StringUtils.deleteWhitespace(url);
//                System.out.println(url);
                uri = new URI(url);
                tld = uri.getHost();
//                System.out.println(tld);
            }else {
                tld = removeStringAfterForwardSlash(url);
            }


        }catch (Exception ex) {

        }

        if (StringUtils.countMatches(tld, ".") > 1) {
            tld = StringUtils.substring(tld, StringUtils.indexOf(tld, ".", 2) + 1, tld.length());
        }
        return tld;
    }

    private static String removeStringAfterForwardSlash(String url) {
        if(url.indexOf('/') > 0) {
            // http:, mailto:, tel:
            url = url.substring(0, url.indexOf('/'));
        }
        return url;
    }


    public static String[] getCategories(String cat) {
        String[] catArr = null;
        StringTokenizer stringTokenizer = new StringTokenizer(cat, ",");
        catArr = new String[stringTokenizer.countTokens()];
        int index = 0;
        while (stringTokenizer.hasMoreElements()) {
            catArr[index] = (String) stringTokenizer.nextElement();
            index++;
        }
        return catArr;
    }
}
