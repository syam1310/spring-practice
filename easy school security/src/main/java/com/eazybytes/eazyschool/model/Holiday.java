package com.eazybytes.eazyschool.model;

import lombok.Data;

/*
* @Data annotation is provided by Lombok library which generate getter, setter, equals, hashcode and toString
* method & Constructor at Compile time
* */
@Data
public class Holiday {
    private final String day;
    private final String reason;
    private final Type type;


    public enum Type {
        FESTIVAL, FEDERAL
    }
}
