package org.bouncycastle.util;

/* JADX INFO: loaded from: classes13.dex */
public interface StringList extends Iterable<String> {
    boolean add(String str);

    String get(int i10);

    int size();

    String[] toStringArray();

    String[] toStringArray(int i10, int i11);
}
