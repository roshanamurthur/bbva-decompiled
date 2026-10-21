package com.adobe.marketing.mobile;

import com.adobe.marketing.mobile.services.ServiceProvider;
import com.adobe.marketing.mobile.services.ui.AlertListener;
import com.adobe.marketing.mobile.services.ui.AlertSetting;
import com.adobe.marketing.mobile.services.ui.FloatingButton;
import com.adobe.marketing.mobile.services.ui.NotificationSetting;
import com.adobe.marketing.mobile.services.ui.UIError;
import com.adobe.marketing.mobile.services.ui.internal.MessagesMonitor;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
class AndroidUIService implements UIService {
    static final String NOTIFICATION_CONTENT_KEY = "NOTIFICATION_CONTENT";
    static final String NOTIFICATION_DEEPLINK_KEY = "NOTIFICATION_DEEPLINK";
    static final String NOTIFICATION_IDENTIFIER_KEY = "NOTIFICATION_IDENTIFIER";
    static final String NOTIFICATION_REQUEST_CODE_KEY = "NOTIFICATION_REQUEST_CODE";
    static final int NOTIFICATION_SENDER_CODE = 750183;
    static final String NOTIFICATION_SENDER_CODE_KEY = "NOTIFICATION_SENDER_CODE";
    static final String NOTIFICATION_SOUND_KEY = "NOTIFICATION_SOUND";
    static final String NOTIFICATION_TITLE = "NOTIFICATION_TITLE";
    static final String NOTIFICATION_USER_INFO_KEY = "NOTIFICATION_USER_INFO";
    MessagesMonitor messagesMonitor = MessagesMonitor.getInstance();

    @Override // com.adobe.marketing.mobile.UIService
    public UIService.FloatingButton createFloatingButton(UIService.FloatingButtonListener floatingButtonListener) {
        final FloatingButton floatingButtonCreateFloatingButton = ServiceProvider.getInstance().getUIService().createFloatingButton(floatingButtonListener);
        return new UIService.FloatingButton() { // from class: com.adobe.marketing.mobile.AndroidUIService.2
            @Override // com.adobe.marketing.mobile.UIService.FloatingButton
            public void display() {
                floatingButtonCreateFloatingButton.display();
            }

            @Override // com.adobe.marketing.mobile.UIService.FloatingButton
            public void remove() {
                floatingButtonCreateFloatingButton.remove();
            }
        };
    }

    @Override // com.adobe.marketing.mobile.UIService
    public UIService.UIFullScreenMessage createFullscreenMessage(String str, UIService.UIFullScreenListener uIFullScreenListener) {
        return new AndroidFullscreenMessage(str, uIFullScreenListener, this.messagesMonitor);
    }

    @Override // com.adobe.marketing.mobile.UIService
    public UIService.AppState getAppState() {
        return AppLifecycleListener.getInstance().getAppState();
    }

    @Override // com.adobe.marketing.mobile.UIService
    public boolean isMessageDisplayed() {
        return MessagesMonitor.getInstance().isDisplayed();
    }

    @Override // com.adobe.marketing.mobile.UIService
    public void registerAppStateListener(UIService.AppStateListener appStateListener) {
        AppLifecycleListener.getInstance().registerListener(appStateListener);
    }

    @Override // com.adobe.marketing.mobile.UIService
    public void showAlert(String str, String str2, String str3, String str4, final UIService.UIAlertListener uIAlertListener) {
        ServiceProvider.getInstance().getUIService().showAlert(AlertSetting.build(str, str2, str3, str4), uIAlertListener != null ? new AlertListener() { // from class: com.adobe.marketing.mobile.AndroidUIService.1
            @Override // com.adobe.marketing.mobile.services.ui.AlertListener
            public void onDismiss() {
                uIAlertListener.onDismiss();
            }

            @Override // com.adobe.marketing.mobile.services.ui.AlertListener
            public void onNegativeResponse() {
                uIAlertListener.onNegativeResponse();
            }

            @Override // com.adobe.marketing.mobile.services.ui.AlertListener
            public void onPositiveResponse() {
                uIAlertListener.onPositiveResponse();
            }

            @Override // com.adobe.marketing.mobile.services.ui.AlertListener
            public void onShow() {
                uIAlertListener.onShow();
            }

            @Override // com.adobe.marketing.mobile.services.ui.AlertListener
            public void onError(UIError uIError) {
            }
        } : null);
    }

    @Override // com.adobe.marketing.mobile.UIService
    public void showLocalNotification(String str, String str2, long j10, int i10, String str3, Map<String, Object> map, String str4) {
        ServiceProvider.getInstance().getUIService().showLocalNotification(NotificationSetting.build(str, str2, j10, i10, str3, map, str4, null));
    }

    @Override // com.adobe.marketing.mobile.UIService
    public boolean showUrl(String str) {
        return ServiceProvider.getInstance().getUIService().showUrl(str);
    }

    @Override // com.adobe.marketing.mobile.UIService
    public void unregisterAppStateListener(UIService.AppStateListener appStateListener) {
        AppLifecycleListener.getInstance().unregisterListener(appStateListener);
    }

    @Override // com.adobe.marketing.mobile.UIService
    public void showLocalNotification(String str, String str2, long j10, int i10, String str3, Map<String, Object> map, String str4, String str5) {
        ServiceProvider.getInstance().getUIService().showLocalNotification(NotificationSetting.build(str, str2, j10, i10, str3, map, str4, str5));
    }
}
