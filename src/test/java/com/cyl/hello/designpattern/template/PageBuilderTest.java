package com.cyl.hello.designpattern.template;

import org.junit.Test;

public class PageBuilderTest {

    @Test
    public void bulidHtmlV1() {
        MyPageBuilderV1 pageBuilder = new MyPageBuilderV1();
        System.out.print(pageBuilder.bulidHtml());
    }

    @Test
    public void bulidHtmlV2() {
        MyPageBuilderV2 pageBuilder = new MyPageBuilderV2();
        System.out.print(pageBuilder.bulidHtml());
    }
}