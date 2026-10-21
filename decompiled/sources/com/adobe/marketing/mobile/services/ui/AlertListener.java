package com.adobe.marketing.mobile.services.ui;

/* JADX INFO: loaded from: classes2.dex */
public interface AlertListener {
    void onDismiss();

    void onError(UIError uIError);

    void onNegativeResponse();

    void onPositiveResponse();

    void onShow();
}
