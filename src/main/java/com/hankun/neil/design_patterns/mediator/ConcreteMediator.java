package com.hankun.neil.design_patterns.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体中介者
 * @author neil
 * @ClassName: ConcreteMediator
 * @Description: TODO
 * @date 2021/4/14 17:58
 */
public class ConcreteMediator extends Mediator {
    private List<Colleague> colleagues = new ArrayList<Colleague>();
    @Override
    public void register(Colleague colleague) {
        if (!colleagues.contains(colleague)) {
            colleagues.add(colleague);
            colleague.setMedium(this);
        }
    }
    @Override
    public void relay(Colleague cl) {
        for (Colleague ob : colleagues) {
            if (!ob.equals(cl)) {
                ((Colleague) ob).receive();
            }
        }
    }
}

