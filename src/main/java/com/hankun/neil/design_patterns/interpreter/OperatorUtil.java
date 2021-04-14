package com.hankun.neil.design_patterns.interpreter;

/**
 * @author neil
 * @ClassName: OperatorUtil
 * @Description: TODO
 * @date 2021/4/14 17:04
 */
public class OperatorUtil {
    public static boolean isOperator(String symbol) {
        return (symbol.equals("+") || symbol.equals("*"));

    }
    public static AbstractExpression getExpressionObject(AbstractExpression firstExpression, AbstractExpression secondExpression, String symbol) {
        if ("+".equals(symbol)) {  // 加法
            return new AddInterpreter(firstExpression, secondExpression);
        } else if ("*".equals(symbol)) {    // 乘法
            return new MultiInterpreter(firstExpression, secondExpression);
        } else {
            throw new RuntimeException("不支持的操作符：" + symbol);
        }
    }
}
