package com.adobe.marketing.mobile.services;

/* JADX INFO: loaded from: classes2.dex */
public interface HitProcessing {
    boolean processHit(DataEntity dataEntity);

    int retryInterval(DataEntity dataEntity);
}
