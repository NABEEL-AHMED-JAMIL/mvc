package com.admaxim.mvc.client;


import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;


public class HttpClientTest {

    public final String USER_AGENT = "Mozilla/5.0";
    private String url = "http://www.google.com/search?q=httpClient";
    private String url1 = "https://selfsolve.apple.com/wcResults.do";
    private static String loginAuth = "https://accounts.google.com/ServiceLoginAuth";
    private static String gmail = "https://mail.google.com/mail/";
    private String cookies;

    private HttpClient httpClient = null;
    private HttpGet get = null;
    private HttpPost post = null;
    private HttpResponse response = null;
    private StringBuilder result;

    public HttpClientTest() {

        httpClient = HttpClientBuilder.create().build();
        CookieHandler.setDefault(new CookieManager());
    }

    public void getMethod() {

        get = new HttpGet(url);
        get.addHeader("User-Agent", USER_AGENT);
        // exe the client
        responseMethod(get);

    }

    public void postMethod() {

        post = new HttpPost(url1);
        // add-header
        post.setHeader("User-Agent", USER_AGENT);
        // list
        List<NameValuePair> urlParameters = new ArrayList<NameValuePair>();

        urlParameters.add(new BasicNameValuePair("sn", "C02G8416DRJM"));
        urlParameters.add(new BasicNameValuePair("cn", ""));
        urlParameters.add(new BasicNameValuePair("locale", ""));
        urlParameters.add(new BasicNameValuePair("caller", ""));
        urlParameters.add(new BasicNameValuePair("num", "12345"));

        System.out.println(urlParameters);

        try {

            post.setEntity(new UrlEncodedFormEntity(urlParameters));
            responseMethod(post);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    private void getPageContent(String url) {

        get = new HttpGet(url);
        get.setHeader("User-Agent", USER_AGENT);
        get.setHeader("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
        get.setHeader("Accept-Language", "en-US,en;q=0.5");

        responseMethod(get);
        // set cookies
        setCookies(getResponse().getFirstHeader("Set-Cookie") == null ? "" : response.getFirstHeader("Set-Cookie").toString());

        if(this.getResult() != null) {
            System.out.println(getResult());
            List<NameValuePair> postParams =
                    getFormParams(getResult().toString(),new User("nabeel.amd93@gmail.com", "11111"));
            sendPost(url, postParams);
        }

    }

    private void sendPost(String url, List<NameValuePair> postParams) {

        this.post = new HttpPost(url);

        // add header
        post.setHeader("Host", "accounts.google.com");
        post.setHeader("User-Agent", USER_AGENT);
        post.setHeader("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
        post.setHeader("Accept-Language", "en-US,en;q=0.5");
        post.setHeader("Cookie", getCookies());
        post.setHeader("Connection", "keep-alive");
        post.setHeader("Referer", url);
        post.setHeader("Content-Type", "application/x-www-form-urlencoded");

        try {
            post.setEntity(new UrlEncodedFormEntity(postParams));
            responseMethod(post);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }


    }

    private List<NameValuePair> getFormParams(String html, User user) {

        System.out.println("Extracting from's data....");

        // google page --> html
        Document document = Jsoup.parse(html);
        // Google form id
        Element loginform = document.getElementById("gaia_loginform");
        // getting the whole input tag that contain in the login-form
        Elements elements = loginform.getElementsByTag("input");

        List<NameValuePair> paramList = new ArrayList<NameValuePair>();

        for (Element element : elements) {

            String key = element.attr("name");
            String value = element.attr("value");

            if(key.equals("Email")) {
                value = user.getUsername();
            } else if(key.equals("passwd")) {
                value = user.getPassword();
            }

            paramList.add(new BasicNameValuePair(key, value));
        }

        return paramList;
    }

    public String getCookies() { return cookies; }
    public void setCookies(String cookies) { this.cookies = cookies; }

    public HttpResponse getResponse() { return response; }
    public void setResponse(HttpResponse response) { this.response = response; }

    public StringBuilder getResult() { return result; }
    public void setResult(StringBuilder result) { this.result = result; }

    public void responseMethod(HttpRequestBase request) {

        try {

            this.response = httpClient.execute(request);
            System.out.println("\nSending request to URL : " + request.getURI());
            System.out.println("Response Code : " + response.getStatusLine().getStatusCode());

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
            String line = "";
            this.result = new StringBuilder();

            while ((line = bufferedReader.readLine()) != null) {
                result.append(line);
            }
//            System.out.println(result.toString());


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private class User {

        private String url;
        private String username;
        private String password;

        public User() {}

        public User(String username, String password) {
            this.username = username;
            this.password = password;
        }

        public String getUrl() { return url; }
        public void setUrl(String url) { this.url = url; }

        public String getUsername() { return username; }
        public void setUsername(String username) { this.username = username; }

        public String getPassword() { return password; }
        public void setPassword(String password) { this.password = password; }

        @Override
        public String toString() {
            return "User{" + "url='" + url + '\'' + ", username='" + username + '\'' + ", password='" + password + '\'' + '}';
        }

    }

    public void test() {
        // simple pass url
        HttpGet httpGet = new HttpGet("http://www.google.com/search?hl=en&q=httpclient&btnG=Google+Search&aq=f&oq=");
        System.out.println("HTTP-URL---> "+ httpGet.getURI());
        // url-builder
        try {
            java.net.URI uri = new URIBuilder().setScheme("http").setHost("www.google.com").setPath("/search")
                    .setParameter("h1", "en")
                    .setParameter("q", "httpclient")
                    .setParameter("btnG", "Google Search")
                    .setParameter("aq", "f")
                    .setParameter("oq", "")
                    .build();

            System.out.println("URL---> "+ uri);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        HttpClientTest httpClientTest = new HttpClientTest();
        httpClientTest.getMethod();
        httpClientTest.postMethod();
        httpClientTest.test();
        httpClientTest.getPageContent(loginAuth);

    }
}
