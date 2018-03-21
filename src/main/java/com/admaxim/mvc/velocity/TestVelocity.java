package com.admaxim.mvc.velocity;

import com.google.common.collect.Maps;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.*;
import org.apache.commons.lang.StringEscapeUtils;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.app.VelocityEngine;

/**
 *
 * @author Nabeel
 */
public class TestVelocity {


    public void showResponse() {

        // velocity object
        com.admaxim.mvc.velocity.Velocity velocity = com.admaxim.mvc.velocity.Velocity.getInstance();
        // writer object
        StringWriter writer = velocity.getWriter();
        // velocity context
        VelocityContext vc = velocity.getVelocityContext();

        // template
        Template template = velocity.getVelocityEngine().getTemplate("/src/main/java/com/admaxim/mvc/velocity/test.vm", "UTF-8");


        String format = "لافتة إعلانية الأصلي";


//        try {
//            vc.put("vformat",  new String(format.getBytes("utf-8"), "utf-8"));
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }

        vc.put("arbic", format);
        template.merge(vc, writer);

        System.out.println(writer);


    }

    public static void main(String args[]) throws Exception {

        // new this to create again again

        TestVelocity testVelocity = new TestVelocity();
        testVelocity.showResponse();




    }

}
