package com.cyl.hello.designpattern.template;

public class MyPageBuilderV2 extends AbstractPageBuilderV2 {

    protected void appendMeta(StringBuffer stringBuffer) {
        stringBuffer.append("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />");
    }

    protected void appendTitle(StringBuffer stringBuffer) {
        stringBuffer.append("<title>你好</title>");
    }

    protected void appendBody(StringBuffer stringBuffer) {
        stringBuffer.append("<body>你好，世界！</body>");
    }
}
