package com.hankun.neil.design_patterns.interpreter;

/**
 * 非终结表达式
 * @author neil
 * @ClassName: AddInterPreter
 * @Description: TODO
 * @date 2021/4/14 17:01
 */
public class MultiInterpreter extends AbstractExpression {
    private AbstractExpression firstExpression, secondExpression;
    public MultiInterpreter(AbstractExpression firstExpression, AbstractExpression secondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }
    @Override
    public int interpret() {
        return this.firstExpression.interpret() * this.secondExpression.interpret();
    }
    @Override
    public String toString() {
        return "*";
    }
}
