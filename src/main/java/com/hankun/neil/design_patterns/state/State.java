package com.hankun.neil.design_patterns.state;

/**
 * @author neil
 * @ClassName: State
 * @Description: TODO
 * @date 2021/4/15 10:26
 */
abstract class State {
    abstract void handle(Context context);
}
