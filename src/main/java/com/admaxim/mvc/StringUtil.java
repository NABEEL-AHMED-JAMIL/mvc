package com.admaxim.mvc;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

public class StringUtil implements Serializable {

    public static boolean isEmpty(String value) {
        if(value == null) {
            return true;
        }else if(value != null && value.trim().length() > 0){
            return false;
        }
        return true;
    }

    public static boolean isNotEmpty(String value) {
        return !(isEmpty(value));
    }

    public static String splitCamelCase(String value) {
        String readAbleString;

        try {
            readAbleString = value.replaceAll(
                    String.format( "%s|%s|%s", "(?<=[A-Z])(?=[A-Z][a-z])", "(?<=[^A-Z])(?=[A-Z])",
                            "(?<=[A-Za-z])(?=[^A-Za-z])" ), " " );
        }catch (Exception e) {
            readAbleString = value;
        }
        return readAbleString;
    }

    public static String getConcatenated(String value) {
        String[] array = value.split(" ");
        StringBuilder sb = new StringBuilder(0);
        for (String index : array) {
            sb.append(index);
        }
        return sb.toString();
    }

    public static boolean isOnlyASCIICharacter(String value) {

        CharsetEncoder asciiEncoder = Charset.forName("US-ASCII").newEncoder();
        return asciiEncoder.canEncode(value);
    }

    public static String trim(String value) {
        if(isNotEmpty(value)) {
            value = value.trim();
        }
        return value;
    }

    public static String entityToFieldName(Class entityClass) {

        if ( entityClass != null ) {
            String entityName = entityClass.getSimpleName( ).replace( "Entity", "" );
            return entityName.toLowerCase( ).substring( 0, 1 ) + entityName.substring( 1 );
        }
        return null;
    }

    public static boolean stringContainsItemFromList(String inputString, String[] items) {
        for(int i =0; i < items.length; i++)
        {
            if(inputString.contains(items[i])) { return true; }
        }
        return false;
    }

    public static String replaceSSNAlien(String value) {

        if(isNotEmpty(value)){
            value = new String("***" + "-" + "**" + "-" +
                    value.split("-")[0]);
        }
        return value;
    }

    public static String upperCaseFirst(String value) {
        if(StringUtil.isEmpty(value)) {
            return "";
        }
        return value.substring(0,1).toUpperCase()+value.substring(1).toLowerCase();
    }

    public static boolean isNumeric(String value) {
        if(value != null) {
            return value.matches("[-+]?\\d*\\.?\\d+");
        }
        return false;
    }

    public static void main(String args[]) {
        System.out.println(upperCaseFirst("pakistan-khkhkjh-kjkljljl"));

    }





}
