package com.admaxim.mvc;

import org.apache.log4j.Logger;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class ReadRtbRequest {

    private static Logger logger = Logger.getLogger(ReadRtbRequest.class);

    public static String requestBodyParams(HttpServletRequest request) throws IOException {
        long startTime = System.currentTimeMillis();
        StringBuilder bodyParams = new StringBuilder();
        InputStreamReader inputStreamReader = null;
        BufferedReader br = null;
        String line = "";

        try {
            inputStreamReader = new InputStreamReader(request.getInputStream());
            br = new BufferedReader(inputStreamReader);
            line = br.readLine();

            while (line != null) {
                bodyParams.append(line);
                line = br.readLine();
            }
        } catch (Exception e) {
        } finally {
            if (inputStreamReader != null)
                inputStreamReader.close();
            if (br != null)
                br.close();
        }
        logger.debug("Parsed requestBodyParams of [ " + request.getContentLength() + " ] in " + (System.currentTimeMillis() - startTime) + " ms.");
        return bodyParams.toString();
    }

    static public void parseRequestBody(HttpServletRequest request, String body) throws IOException {
        long st = System.currentTimeMillis();
        ServletInputStream sin = request.getInputStream();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            int nRead;
            byte[] data = new byte[4096];
            while ((nRead = sin.read(data, 0, data.length)) != -1) {
                baos.write(data, 0, nRead);
            }
            baos.flush();
            body = baos.toString("UTF-8");
        } catch (Exception e) {
            logger.error("parseRequestBody : " + e.getMessage());
        } finally {
            if(baos != null){
                baos.close();
            }
        }
        logger.debug("Parsed requestBodyParams of [ " + request.getContentLength() + " ] in " + (System.currentTimeMillis() - st) + " ms.");
    }

    public static void main(String args[]) {
        Map<String, String>  test = new HashMap<String, String>();
        test.put("pubId", "zyxsf");
        test.put("ip", "ddddd");

        System.out.println(test);



    }
}
