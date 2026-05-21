package org.example.design.iterator;

import java.util.List;

public class MyIteratorImpl implements MyIterator {

    private final List<?> list;
    private final Integer length;
    private Integer idx;

    public MyIteratorImpl(List<?> list) {
        this.list = list;
        this.length = list.size();
        idx = 0;
    }

    @Override
    public boolean hasNext() {
        return idx < length;
    }

    @Override
    public Object next() {
        Object object = list.get(idx);
        idx++;
        return object;
    }
}
