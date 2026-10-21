package com.noknok.android.client.commlib;

/* JADX INFO: loaded from: classes11.dex */
public interface ICommunicationClient {
    String[] getServiceModuleList(String str);

    void postRequest(String str, String str2, Object obj);

    void removeRequest(long j10);

    long sendRequest(String str, String str2, Object obj, ICommunicationClientResponse iCommunicationClientResponse);

    void waitForResponse(long j10);
}
