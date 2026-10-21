package com.adobe.marketing.mobile;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
interface UIService {

    public enum AppState {
        FOREGROUND,
        BACKGROUND,
        UNKNOWN
    }

    public interface AppStateListener {
        void onBackground();

        void onForeground();
    }

    public interface FloatingButton {
        void display();

        void remove();
    }

    public interface FloatingButtonListener extends com.adobe.marketing.mobile.services.ui.FloatingButtonListener {
    }

    public interface UIAlertListener {
        void onDismiss();

        void onNegativeResponse();

        void onPositiveResponse();

        void onShow();
    }

    public interface UIFullScreenListener {
        void onDismiss(UIFullScreenMessage uIFullScreenMessage);

        void onShow(UIFullScreenMessage uIFullScreenMessage);

        boolean overrideUrlLoad(UIFullScreenMessage uIFullScreenMessage, String str);
    }

    public interface UIFullScreenMessage {
        void openUrl(String str);

        void remove();

        void setLocalAssetsMap(Map<String, String> map);

        void show();
    }

    FloatingButton createFloatingButton(FloatingButtonListener floatingButtonListener);

    UIFullScreenMessage createFullscreenMessage(String str, UIFullScreenListener uIFullScreenListener);

    AppState getAppState();

    boolean isMessageDisplayed();

    void registerAppStateListener(AppStateListener appStateListener);

    void showAlert(String str, String str2, String str3, String str4, UIAlertListener uIAlertListener);

    void showLocalNotification(String str, String str2, long j10, int i10, String str3, Map<String, Object> map, String str4);

    void showLocalNotification(String str, String str2, long j10, int i10, String str3, Map<String, Object> map, String str4, String str5);

    boolean showUrl(String str);

    void unregisterAppStateListener(AppStateListener appStateListener);
}
