package com.admaxim.mvc.velocity;

import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;

import java.io.StringWriter;
import java.util.Properties;

public class Velocity {


    private VelocityEngine velocityEngine;
    private static Velocity ourInstance = new Velocity();

    public static Velocity getInstance() {
        return ourInstance;
    }

    private Velocity() { getVelocityEngine(); }

    public VelocityEngine getVelocityEngine() {

        if(velocityEngine == null) {
            velocityEngine = new VelocityEngine();
            setPropertis();
        }
        return velocityEngine;
    }

    private static void setPropertis() {

        Properties props = new Properties();
        props.setProperty("resource.loader", "class");
        props.setProperty("class.resource.loader.class", "org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
        props.setProperty("class.resource.loader.path", "/src/main/java/com/admaxim/mvc/velocity/");

        props.put("input.encoding", "UTF-8");
        props.put("output.encoding", "UTF-8");
        props.put("default.contentType", "UTF-8");
        props.put("home.class", "org.springframework.web.servlet.view.velocity.VelocityView");
        props.put("home.url","test.vm");
        props.put("home.encoding","UTF-8");
        org.apache.velocity.app.Velocity.init(props);

    }

    public StringWriter getWriter() { return new StringWriter(); }
    public VelocityContext getVelocityContext() { return new VelocityContext(); }

}
