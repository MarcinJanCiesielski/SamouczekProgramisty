package com.marcinjc.trywithresouces;

public class HtmlTag implements AutoCloseable {
    private String tag;

    public HtmlTag(String tag){
        this.tag = tag;
        open();
    }

    public void open(){
        System.out.println("<"+ tag +">");
    }

    public void body(String body){
        System.out.println(body);
    }

    @Override
    public void close() {
        System.out.println("</"+ tag +">");
    }
}
