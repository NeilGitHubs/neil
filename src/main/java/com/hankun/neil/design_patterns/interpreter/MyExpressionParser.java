package com.hankun.neil.design_patterns.interpreter;

import java.util.Stack;

/**
 * @author neil
 * @ClassName: MyExpressionParser
 * @Description: TODO
 * @date 2021/4/14 17:06
 */
public class MyExpressionParser {
    public int parse(String aa) {
        AbstractExpression result = null;
        Stack<AbstractExpression> integers = new Stack<>();
        String[] s = aa.split(" ");
        if(s.length==0) {
            return 0;
        }
        for (int i=0;i<s.length;i++) {
            boolean operator = OperatorUtil.isOperator(s[i]);
            if(operator) {
                AbstractExpression numberInterpreter = integers.pop();
                AbstractExpression numberInterpreter1 = integers.pop();
                result = OperatorUtil.getExpressionObject(numberInterpreter, numberInterpreter1, s[i]);
                integers.push(result);
            }else {
                integers.push(new NumberInterpreter(s[i]));
            }
        }
        return result.interpret();
    }
}
