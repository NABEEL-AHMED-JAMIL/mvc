package com.admaxim.mvc.mapping.request;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

//@Mapper
public interface INative {

     String NATIVE = "native";

//    @Mappings({
//            @Mapping(target="native", source="nAtive"),
//    })
    Native setNative(Native nAtive);
    Native getnAtive();
    void setnAtive(Native nAtive);



}
