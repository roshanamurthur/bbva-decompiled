package org.simpleframework.xml.util;

/* JADX INFO: loaded from: classes13.dex */
public interface Cache<T> {
    void cache(Object obj, T t10);

    boolean contains(Object obj);

    T fetch(Object obj);

    boolean isEmpty();

    T take(Object obj);
}
