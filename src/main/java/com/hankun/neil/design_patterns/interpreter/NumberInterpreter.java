package com.hankun.neil.design_patterns.interpreter;

/**
 * 终结符表达式
 * @author neil
 * @ClassName: NumberInterpreter
 * @Description: TODO
 * @date 2021/4/14 17:00
 */
public class NumberInterpreter extends AbstractExpression{
    private int number;

    public NumberInterpreter(int number) {
        this.number = number;
    }

    public NumberInterpreter(String number) {
        this.number = Integer.parseInt(number);
    }

    @Override
    public int interpret() {
        return this.number;
    }
}
