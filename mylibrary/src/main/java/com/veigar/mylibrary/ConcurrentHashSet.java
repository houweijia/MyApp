package com.veigar.mylibrary;



import java.util.AbstractSet;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

///**
// * @description: 内部存放工作线程容器，并发安全。
// * @author: houwj
// * @date: 2020/10/21
// */
public class ConcurrentHashSet<T> extends AbstractSet<T> {

    private ConcurrentHashMap<T, Object> map = new ConcurrentHashMap<>();
    private final Object PRESENT = new Object();

    private AtomicInteger count = new AtomicInteger();


    @Override
    public Iterator<T> iterator() {
        return map.keySet().iterator();
    }

    @Override
    public boolean add(T t) {
        count.incrementAndGet();
        return map.put(t, PRESENT) == null;
    }

    @Override
    public boolean remove(Object o) {
        count.decrementAndGet();
        return map.remove(o) == PRESENT;
    }

    @Override
    public int size() {
        return count.get();
    }
}
