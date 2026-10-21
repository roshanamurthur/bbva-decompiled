package com.vierge.pinpadsdk;

/* JADX INFO: loaded from: classes6.dex */
public interface ICallbackListeners {
    void listenerError(String str);

    void listenerLogDataReceive(short[] sArr);

    void listenerLogDataSend(short[] sArr);

    void listenerLogSession(String str);

    void listenerResponseCommand(String str);

    void listenerSendNewCommand(int i10);
}
