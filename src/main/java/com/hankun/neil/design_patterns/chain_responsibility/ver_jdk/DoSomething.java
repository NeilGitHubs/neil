package com.hankun.neil.design_patterns.chain_responsibility.ver_jdk;

/**
 * @author neil
 * @ClassName: DoSomething
 * @Description: TODO
 * @date 2021/4/15 11:02
 */
public class DoSomething implements IDoSomething{
    @Override
    public void say() {
        System.out.println("DoSomething say: fuck");
    }
}
