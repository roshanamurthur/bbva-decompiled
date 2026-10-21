package org.bouncycastle.util;

/* JADX INFO: loaded from: classes13.dex */
public interface Selector<T> extends Cloneable {
    Object clone();

    boolean match(T t10);
}
