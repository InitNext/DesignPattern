package com.cyl.hello.designpattern.template;

public class MyPageBuilderV1 extends AbstractPageBuilderV1 {

    @Override
    protected void appendHead(StringBuffer stringBuffer) {
        stringBuffer.append("<head><title>你好</title></head>");
    }

    @Override
    protected void appendBody(StringBuffer stringBuffer) {
        stringBuffer.append("<body><h1>你好,世界！</h1></body>");
    }
}
