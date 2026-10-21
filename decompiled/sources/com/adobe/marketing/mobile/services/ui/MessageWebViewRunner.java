package com.adobe.marketing.mobile.services.ui;

import android.content.Context;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.webkit.WebSettings;
import com.adobe.marketing.mobile.LoggingMode;
import com.adobe.marketing.mobile.MobileCore;
import com.adobe.marketing.mobile.internal.context.App;
import com.adobe.marketing.mobile.internal.utility.StringUtils;
import com.adobe.marketing.mobile.services.ServiceProvider;
import java.io.File;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
class MessageWebViewRunner implements Runnable {
    private static final int ANIMATION_DURATION = 300;
    private static final String TAG = "MessageWebViewRunner";
    private static final String UNEXPECTED_NULL_VALUE = "Unexpected Null Value";
    private Map<String, String> assetMap = Collections.emptyMap();
    private final AEPMessage message;
    private int messageHeight;
    private int messageWidth;
    private int originX;
    private int originY;
    private AEPMessageSettings settings;
    private MessageWebView webView;
    private MessageWebViewClient webViewClient;
    private WebSettings webviewSettings;

    /* JADX INFO: renamed from: com.adobe.marketing.mobile.services.ui.MessageWebViewRunner$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$adobe$marketing$mobile$services$ui$MessageSettings$MessageAnimation;

        static {
            int[] iArr = new int[MessageSettings.MessageAnimation.values().length];
            $SwitchMap$com$adobe$marketing$mobile$services$ui$MessageSettings$MessageAnimation = iArr;
            try {
                iArr[MessageSettings.MessageAnimation.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$adobe$marketing$mobile$services$ui$MessageSettings$MessageAnimation[MessageSettings.MessageAnimation.FADE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$adobe$marketing$mobile$services$ui$MessageSettings$MessageAnimation[MessageSettings.MessageAnimation.LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$adobe$marketing$mobile$services$ui$MessageSettings$MessageAnimation[MessageSettings.MessageAnimation.RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$adobe$marketing$mobile$services$ui$MessageSettings$MessageAnimation[MessageSettings.MessageAnimation.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$adobe$marketing$mobile$services$ui$MessageSettings$MessageAnimation[MessageSettings.MessageAnimation.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public MessageWebViewRunner(AEPMessage aEPMessage) {
        this.message = aEPMessage;
        AEPMessageSettings aEPMessageSettings = (AEPMessageSettings) aEPMessage.getSettings();
        this.settings = aEPMessageSettings;
        this.messageHeight = getPixelValueForHeight(aEPMessageSettings.getHeight());
        this.messageWidth = getPixelValueForWidth(this.settings.getWidth());
        this.originX = getOriginX(this.settings);
        this.originY = getOriginY(this.settings);
    }

    private void createMessageFrame(AEPMessageSettings aEPMessageSettings) {
        if (aEPMessageSettings.getHeight() != 100) {
            this.webviewSettings.setLoadWithOverviewMode(true);
            this.webviewSettings.setUseWideViewPort(true);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(this.messageWidth, this.messageHeight);
        marginLayoutParams.topMargin = this.originY;
        marginLayoutParams.leftMargin = this.originX;
        this.message.setParams(marginLayoutParams);
    }

    private int getOriginX(AEPMessageSettings aEPMessageSettings) {
        if (aEPMessageSettings == null) {
            return 0;
        }
        int parentActivityContentWidth = this.message.getParentActivityContentWidth();
        if (aEPMessageSettings.getHorizontalAlign().equals(MessageSettings.MessageAlignment.LEFT)) {
            if (aEPMessageSettings.getHorizontalInset() != 0) {
                return getPixelValueForWidth(aEPMessageSettings.getHorizontalInset());
            }
            return 0;
        }
        if (aEPMessageSettings.getHorizontalAlign().equals(MessageSettings.MessageAlignment.RIGHT)) {
            return aEPMessageSettings.getHorizontalInset() != 0 ? (parentActivityContentWidth - getPixelValueForWidth(aEPMessageSettings.getWidth())) - getPixelValueForWidth(aEPMessageSettings.getHorizontalInset()) : parentActivityContentWidth - getPixelValueForWidth(aEPMessageSettings.getWidth());
        }
        return (parentActivityContentWidth - getPixelValueForWidth(aEPMessageSettings.getWidth())) / 2;
    }

    private int getOriginY(AEPMessageSettings aEPMessageSettings) {
        if (aEPMessageSettings == null) {
            return 0;
        }
        int parentActivityContentHeight = this.message.getParentActivityContentHeight();
        if (aEPMessageSettings.getVerticalAlign().equals(MessageSettings.MessageAlignment.TOP)) {
            if (aEPMessageSettings.getVerticalInset() != 0) {
                return getPixelValueForHeight(aEPMessageSettings.getVerticalInset());
            }
            return 0;
        }
        if (aEPMessageSettings.getVerticalAlign().equals(MessageSettings.MessageAlignment.BOTTOM)) {
            return aEPMessageSettings.getVerticalInset() != 0 ? (parentActivityContentHeight - getPixelValueForHeight(aEPMessageSettings.getHeight())) - getPixelValueForHeight(aEPMessageSettings.getVerticalInset()) : parentActivityContentHeight - getPixelValueForHeight(aEPMessageSettings.getHeight());
        }
        return (parentActivityContentHeight - getPixelValueForHeight(aEPMessageSettings.getHeight())) / 2;
    }

    private int getPixelValueForHeight(float f6) {
        return (int) ((f6 / 100.0f) * this.message.getParentActivityContentHeight());
    }

    private int getPixelValueForWidth(float f6) {
        return (int) ((f6 / 100.0f) * this.message.getParentActivityContentWidth());
    }

    private Animation setupDisplayAnimation() {
        Animation translateAnimation;
        MessageSettings.MessageAnimation displayAnimation = this.message.getSettings().getDisplayAnimation();
        if (displayAnimation == null) {
            return null;
        }
        MobileCore.log(LoggingMode.VERBOSE, TAG, "Creating display animation for " + displayAnimation.name());
        switch (AnonymousClass1.$SwitchMap$com$adobe$marketing$mobile$services$ui$MessageSettings$MessageAnimation[displayAnimation.ordinal()]) {
            case 1:
                translateAnimation = new TranslateAnimation(0.0f, 0.0f, -this.message.getParentActivityContentHeight(), 0.0f);
                break;
            case 2:
                translateAnimation = new AlphaAnimation(0.0f, 1.0f);
                translateAnimation.setInterpolator(new DecelerateInterpolator());
                break;
            case 3:
                translateAnimation = new TranslateAnimation(-this.message.getParentActivityContentWidth(), 0.0f, 0.0f, 0.0f);
                break;
            case 4:
                translateAnimation = new TranslateAnimation(this.message.getParentActivityContentWidth(), 0.0f, 0.0f, 0.0f);
                break;
            case 5:
                translateAnimation = new TranslateAnimation(0.0f, 0.0f, this.message.getParentActivityContentHeight() * 2, this.message.getWebView().getTop());
                break;
            case 6:
                translateAnimation = new TranslateAnimation(this.message.getParentActivityContentWidth(), 0.0f, this.message.getParentActivityContentHeight(), 0.0f);
                break;
            default:
                translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, 0.0f);
                break;
        }
        if (displayAnimation.equals(MessageSettings.MessageAnimation.FADE)) {
            translateAnimation.setDuration(600L);
        } else {
            translateAnimation.setDuration(300L);
        }
        translateAnimation.setFillAfter(true);
        return translateAnimation;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (StringUtils.isNullOrEmpty(this.message.getMessageHtml())) {
                MobileCore.log(LoggingMode.DEBUG, TAG, "Unexpected Null Value (message html), failed to show the message.");
                this.message.cleanup();
                return;
            }
            Context appContext = App.getInstance().getAppContext();
            if (appContext == null) {
                MobileCore.log(LoggingMode.WARNING, TAG, "Failed to show the message, the app context is null.");
                this.message.cleanup();
                return;
            }
            MessageWebView messageWebView = new MessageWebView(appContext, this.settings.getCornerRadius(), 0, 0, this.messageWidth, this.messageHeight, this.message.getMessageHtml());
            this.webView = messageWebView;
            messageWebView.setVerticalScrollBarEnabled(false);
            this.webView.setHorizontalScrollBarEnabled(false);
            this.webView.setBackgroundColor(0);
            MessageWebViewClient messageWebViewClient = new MessageWebViewClient(this.message);
            this.webViewClient = messageWebViewClient;
            messageWebViewClient.setLocalAssetsMap(this.assetMap);
            this.webView.setWebViewClient(this.webViewClient);
            WebSettings settings = this.webView.getSettings();
            this.webviewSettings = settings;
            settings.setJavaScriptEnabled(true);
            this.webviewSettings.setAllowFileAccess(false);
            this.webviewSettings.setDomStorageEnabled(true);
            this.message.setWebView(this.webView);
            FullscreenMessageDelegate messageDelegate = ServiceProvider.getInstance().getMessageDelegate();
            if (!messageDelegate.shouldShowMessage(this.message)) {
                MobileCore.log(LoggingMode.DEBUG, TAG, "Message couldn't be displayed, FullscreenMessageDelegate#shouldShowMessage states the message should not be displayed.");
                messageDelegate.onShowFailure();
                return;
            }
            if (this.message.getMessageFragment() == null) {
                MobileCore.log(LoggingMode.WARNING, TAG, "Failed to show the message, the message fragment is null.");
                this.message.cleanup();
                return;
            }
            Method method = this.webviewSettings.getClass().getMethod("setMediaPlaybackRequiresUserGesture", Boolean.TYPE);
            method.setAccessible(true);
            method.invoke(this.webviewSettings, Boolean.FALSE);
            Context appContext2 = App.getInstance().getAppContext();
            File cacheDir = appContext2 != null ? appContext2.getCacheDir() : null;
            if (cacheDir != null) {
                this.webviewSettings.setDatabasePath(cacheDir.getPath());
                this.webviewSettings.setDatabaseEnabled(true);
            }
            this.webviewSettings.setDefaultTextEncodingName("UTF-8");
            this.webView.startInAppMessage();
            AEPMessageSettings aEPMessageSettings = (AEPMessageSettings) this.message.getSettings();
            if (!this.message.isMessageVisible()) {
                Animation animation = setupDisplayAnimation();
                if (animation == null) {
                    MobileCore.log(LoggingMode.DEBUG, TAG, "Unexpected Null Value (MessageAnimation), failed to setup a display animation.");
                    return;
                }
                this.webView.setAnimation(animation);
            }
            createMessageFrame(aEPMessageSettings);
        } catch (Exception e5) {
            MobileCore.log(LoggingMode.ERROR, TAG, "Failed to show the message " + e5.getMessage());
        }
    }

    public void setLocalAssetsMap(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        this.assetMap = new HashMap(map);
    }
}
