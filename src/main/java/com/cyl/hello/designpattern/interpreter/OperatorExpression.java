package com.cyl.hello.designpattern.interpreter;

//终结符表达式，对应-、+
public class OperatorExpression implements Expression{

    public void interpreter(Context context) {
        context.setOperator(context.current());//设置运算符
    }

}
