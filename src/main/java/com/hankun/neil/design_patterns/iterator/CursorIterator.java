package com.hankun.neil.design_patterns.iterator;


/**
 * 它支持以不同的方式遍历一个聚合对象。
 * 迭代器简化了聚合类。
 * 在同一个聚合上可以有多个遍历。
 * 在迭代器模式中，增加新的聚合类和迭代器类都很方便，无须修改原有代码。
 * 可以和访问者模式共同处理
 *
 * 这个是mybatis源码
 * @author neil
 * @ClassName: CursorIterator
 * @Description: TODO
 * @date 2021/4/14 17:51
 */
//public class CursorIterator implements Iterator<T>{
//    T object;
//    int iteratorIndex;
//
//    private CursorIterator() {
//        this.iteratorIndex = -1;
//    }
//
//    public boolean hasNext() {
//        if (this.object == null) {
//            this.object = DefaultCursor.this.fetchNextUsingRowBound();
//        }
//
//        return this.object != null;
//    }
//
//    public T next() {
//        T next = this.object;
//        if (next == null) {
//            next = DefaultCursor.this.fetchNextUsingRowBound();
//        }
//
//        if (next != null) {
//            this.object = null;
//            ++this.iteratorIndex;
//            return next;
//        } else {
//            throw new NoSuchElementException();
//        }
//    }
//
//    public void remove() {
//        throw new UnsupportedOperationException("Cannot remove element from Cursor");
//    }
//}
