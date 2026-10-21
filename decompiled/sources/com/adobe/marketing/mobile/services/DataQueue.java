package com.adobe.marketing.mobile.services;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface DataQueue {
    boolean add(DataEntity dataEntity);

    boolean clear();

    void close();

    int count();

    DataEntity peek();

    List<DataEntity> peek(int i10);

    boolean remove();

    boolean remove(int i10);
}
