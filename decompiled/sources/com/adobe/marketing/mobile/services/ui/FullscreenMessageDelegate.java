package com.adobe.marketing.mobile.services.ui;

/* JADX INFO: loaded from: classes2.dex */
public interface FullscreenMessageDelegate {
    void onDismiss(FullscreenMessage fullscreenMessage);

    void onShow(FullscreenMessage fullscreenMessage);

    void onShowFailure();

    boolean overrideUrlLoad(FullscreenMessage fullscreenMessage, String str);

    boolean shouldShowMessage(FullscreenMessage fullscreenMessage);
}
