package com.marcinjc.adnotacje;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
public @interface SampleFieldAnnotation {
    String id();
}
