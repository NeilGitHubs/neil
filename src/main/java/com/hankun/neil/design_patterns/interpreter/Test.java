package com.hankun.neil.design_patterns.interpreter;

/**
 * 这个应用广泛，但是要求级别较高，一般涉及编译器相关的问题，如ast抽象语法树
 * 例如SpelExpression，java el表达式的解析，详情查看笔记
 * @author neil
 * @ClassName: Test
 * @Description: TODO
 * @date 2021/4/14 17:04
 */
public class Test {
    /**
     * 逆波兰表达式处理
     * @param args
     */
    public static void main(String[] args) {
        String inputStr = "6 100 11 + *";
        MyExpressionParser expressionParser = new MyExpressionParser();
        int result = expressionParser.parse(inputStr);
        System.out.println("解释器计算结果: " + result);
    }
}
