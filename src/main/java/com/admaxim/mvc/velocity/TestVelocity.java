package com.admaxim.mvc.velocity;

import java.io.StringWriter;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;


import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

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

        String format = "لافتة  | إعلانية  | الأصلي";

        vc.put("arbic", format);
        template.merge(vc, writer);

        SendEmail sendEmail = new SendEmail();
        String sendTo = "send-to-email";
        String subject= "Test Test Test ufff";

        if(sendEmail.sendMail(sendTo,subject, writer.toString())) {
            System.out.println("Mail Send");
            System.out.println(writer);
        } else {
            System.out.println("Email Not Send....");
        }

    }

    //https://myaccount.google.com/lesssecureapps
    public class SendEmail {

        protected static final String USER_ID = "From-email";
        private static final String PASSWORD = "password";

        private Session getSession() {

            Properties props = new Properties();
            props.put("mail.smtp.host", "smtp.gmail.com");
            props.put("mail.smtp.socketFactory.port", "465");
            props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.port", "587");

            Session session = Session.getInstance(props,
                    new javax.mail.Authenticator() {
                        protected PasswordAuthentication getPasswordAuthentication() {
                            return new PasswordAuthentication(USER_ID,PASSWORD);
                        }
                    });
            return session;

        }

        public boolean sendMail(String sendTo, String subject, String mailContaint) {

            try {

                Message message = new MimeMessage(getSession());
                message.setFrom(new InternetAddress(USER_ID));
                message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(sendTo));

                message.setSubject(subject);
                message.setContent(mailContaint, "text/html; charset=utf-8");
                Transport.send(message);
                return true;

            } catch (MessagingException e) {
                System.out.println("1-Exception in sending mail subject: "+subject + e);
                return false;
            }catch (Exception e) {
                System.out.println("2-Exception in sending mail subject: "+subject + e);
                return false;
            }
        }

    }


    public static void main(String args[]) throws Exception {

        // new this to create again again
        TestVelocity testVelocity = new TestVelocity();
        testVelocity.showResponse();

    }

}
