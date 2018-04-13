package com.admaxim.mvc;

import com.google.common.primitives.Doubles;
import org.apache.commons.lang.StringUtils;

import java.util.HashMap;

public class ErrorFilnd {

    public final Double defaultValue = 2.0;

    public static void main(String[] args) {

        String value = "1.0,1.0";
        System.out.println(new ErrorFilnd().getDoubleAdRequestParameter(value));
        String[] category = null;
        System.out.println(category.length);

        HashMap<String, String> parent = new HashMap<>();
        parent.put("key1", "Value1");
        parent.put("key2", "Value1");
        System.out.println(parent.toString());

    }


    // i frst create the thread <---- 5 mint
    // 10 to 15 reauest  check
    // i wll goto the


    private Double getDoubleAdRequestParameter(String value) {

        if (StringUtils.isNotEmpty(value)) {
            if(Doubles.tryParse(value) != null ) {
                return Doubles.tryParse(value);
            }
        }
        return defaultValue;
    }
}
