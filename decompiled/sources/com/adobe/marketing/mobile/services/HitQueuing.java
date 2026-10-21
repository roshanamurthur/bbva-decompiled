package com.adobe.marketing.mobile.services;

/* JADX INFO: loaded from: classes2.dex */
public interface HitQueuing {
    void beginProcessing();

    void clear();

    void close();

    int count();

    boolean queue(DataEntity dataEntity);

    void suspend();
}
