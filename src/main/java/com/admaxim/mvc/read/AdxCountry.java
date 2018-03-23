package com.admaxim.mvc.read;

import org.apache.commons.lang.StringUtils;
import java.io.*;


public class AdxCountry {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        InputStream inputStream = null;
        BufferedReader br = null;
        try {

            ClassLoader loader = Thread.currentThread().getContextClassLoader();
            inputStream = loader.getResourceAsStream("requests/Adx_2016-01-18_17-52-17.log");

            synchronized (inputStream) {
                br = new BufferedReader(new InputStreamReader(inputStream));
            }
            String line = "";
            String geo = "";
            while ((line = br.readLine()) != null) {

                if (StringUtils.contains(line, "geo_criteria_id")) {
                    geo = line;
                }

                if (StringUtils.contains(line, "AdManager  - country=")) {
                    String str = StringUtils.substringAfterLast(line, "AdManager  - country=");
                    str = StringUtils.trim(str);

                    if (!StringUtils.isEmpty(str)) {
                        System.out.println("+--------+------------------------------+");
                        System.out.println("Line: " + str + " | " + "Geo: " + geo);
                    }
                }
            }


        }catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                br.close();
            }catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }
}
