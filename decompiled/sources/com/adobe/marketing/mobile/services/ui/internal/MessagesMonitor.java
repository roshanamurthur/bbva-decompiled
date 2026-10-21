package com.adobe.marketing.mobile.services.ui.internal;

/* JADX INFO: loaded from: classes2.dex */
public class MessagesMonitor {
    private static MessagesMonitor INSTANCE = new MessagesMonitor();
    private volatile boolean messageDisplayed;

    private MessagesMonitor() {
    }

    public static MessagesMonitor getInstance() {
        return INSTANCE;
    }

    public void dismissed() {
        this.messageDisplayed = false;
    }

    public void displayed() {
        this.messageDisplayed = true;
    }

    public boolean isDisplayed() {
        return this.messageDisplayed;
    }
}
