package com.adobe.marketing.mobile;

/* JADX INFO: loaded from: classes2.dex */
public interface AdobeCallbackWithError<T> extends AdobeCallback<T> {
    void fail(AdobeError adobeError);
}
