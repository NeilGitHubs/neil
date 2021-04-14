package com.hankun.neil.design_patterns.visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author neil
 * @ClassName: ObjectStructure
 * @Description: TODO
 * @date 2021/4/14 17:39
 */
public class ObjectStructure {
    private List<Element> list = new ArrayList<Element>();
    public void accept(Visitor visitor) {
        Iterator<Element> i = list.iterator();
        while (i.hasNext()) {
            ((Element) i.next()).accept(visitor);
        }
    }
    public void add(Element element) {
        list.add(element);
    }
    public void remove(Element element) {
        list.remove(element);
    }
}
