package com.admaxim.mvc.read;

import java.io.UnsupportedEncodingException;
import java.util.UUID;

public class HelloBase64 {

    public static void main(String []args) {

        try {
            //====================================Simple-Encoder-Decoder===========================================
            // simple string
            String base64encodedString = Base64.getEncoder().encodeToString("Ballistic".getBytes("utf-8"));
            System.out.println("Real String :" + "Ballistic");
            // QmFsbGlzdGlj
            System.out.println("Encode String :" + base64encodedString);
            // Decode
            System.out.println("Original String: " + new String(Base64.getDecoder().decode(base64encodedString), "utf-8"));


            String base64encodedString1 = Base64.getEncoder().encodeToString("Y-Of\\344_B\\260_a\\224_11\\342_is\\022_t\\247_i\\374_c\\306".getBytes("utf-8"));
            System.out.println("Real String :" + "Y-Of\\344_B\\260_a\\224_11\\342_is\\022_t\\247_i\\374_c\\306");
            // WS1PZlwzNDRfQlwyNjBfYVwyMjRfMTFcMzQyX2lzXDAyMl90XDI0N19pXDM3NF9jXDMwNg==
            System.out.println("Encode String :" + base64encodedString1);
            // Decode
            System.out.println("Original String: " + new String(Base64.getDecoder().decode(base64encodedString1), "utf-8"));
            //===================================URL-Encoder-Decoder============================================
            base64encodedString = Base64.getUrlEncoder().encodeToString("https://www.youtube.com/watch?v=vAuOfRRmtSc".getBytes("utf-8"));
            // aHR0cHM6Ly93d3cueW91dHViZS5jb20vd2F0Y2g_dj12QXVPZlJSbXRTYw==
            System.out.println("Base64 Encoded String (URL) :" + base64encodedString);
            // Decode
            System.out.println("Original String: " + new String(Base64.getUrlDecoder().decode(base64encodedString), "utf-8"));
            //==================================MIME-Encoder-Decoder============================================
            StringBuilder stringBuilder = new StringBuilder();

            for (int i = 0; i < 10; ++i) {
                stringBuilder.append(UUID.randomUUID().toString());
            }

            System.out.println(stringBuilder.toString());
            byte[] mimeBytes = stringBuilder.toString().getBytes("utf-8");
            String mimeEncodedString = Base64.getMimeEncoder().encodeToString(mimeBytes);
            System.out.println("Base64 Encoded String (MIME) :" + mimeEncodedString);
            // Decode
            System.out.println("Original String: " + new String(Base64.getMimeDecoder().decode(stringBuilder.toString()), "utf-8"));




        }catch (UnsupportedEncodingException e) {
            System.out.println("Error :" + e.getMessage());
        }
    }
}
