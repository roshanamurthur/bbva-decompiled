package com.viergegroup.sdk.taptophone.vierge.SdkTapOnPhone;

import com.viergegroup.sdk.taptophone.vierge.models.MessageLectureType;

/* JADX INFO: loaded from: classes7.dex */
public interface ICallbackListeners {
    void listenerLogDataReceive(short[] sArr);

    void listenerLogDataSend(short[] sArr);

    void listenerLogSession(String str);

    void listenerResponseCommand(String str);

    void listenerSendNewCommand(int i10);

    void listenerStatusMessageFromLectureCard(MessageLectureType messageLectureType);
}
