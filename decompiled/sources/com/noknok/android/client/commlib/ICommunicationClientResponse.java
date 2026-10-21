package com.noknok.android.client.commlib;

/* JADX INFO: loaded from: classes11.dex */
public interface ICommunicationClientResponse {
    void onError(String str);

    void onRemoveRequest();

    void onResponse(String str, Object obj);
}
