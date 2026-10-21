package com.adobe.marketing.mobile.services.ui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.webkit.WebView;
import com.adobe.marketing.mobile.LoggingMode;
import com.adobe.marketing.mobile.MobileCore;
import com.adobe.marketing.mobile.internal.context.App;
import com.adobe.marketing.mobile.internal.utility.StringUtils;
import com.adobe.marketing.mobile.services.ServiceProvider;
import com.adobe.marketing.mobile.services.ui.internal.MessagesMonitor;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class AEPMessage implements FullscreenMessage {
    private static final int ANIMATION_DURATION = 300;
    private static final String FRAGMENT_TAG = "AEPMessageFragment";
    private static final String TAG = "AEPMessage";
    private static final String UNEXPECTED_NULL_VALUE = "Unexpected Null Value";
    private Animation.AnimationListener animationListener;
    private final Map<String, String> assetMap;
    private Animation dismissAnimation;
    FullscreenMessageDelegate fullScreenMessageDelegate;
    private final String html;
    private boolean isVisible;
    private MessageFragment messageFragment;
    private MessageWebViewRunner messageWebViewRunner;
    final MessagesMonitor messagesMonitor;
    private ViewGroup.LayoutParams params;
    private int parentActivityContentHeight;
    private int parentActivityContentWidth;
    private final MessageSettings settings;
    private WebView webView;

    /* JADX INFO: renamed from: com.adobe.marketing.mobile.services.ui.AEPMessage$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {
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

    @Deprecated
    public AEPMessage(String str, FullscreenMessageDelegate fullscreenMessageDelegate, boolean z10, MessagesMonitor messagesMonitor, MessageSettings messageSettings) throws MessageCreationException {
        this.fullScreenMessageDelegate = fullscreenMessageDelegate;
        this.messagesMonitor = messagesMonitor;
        this.settings = messageSettings;
        this.html = str;
        this.assetMap = Collections.emptyMap();
    }

    private void delegateFullscreenMessageDismiss() {
        FullscreenMessageDelegate messageDelegate = ServiceProvider.getInstance().getMessageDelegate();
        if (messageDelegate != null) {
            messageDelegate.onDismiss(this);
        }
    }

    private Animation setupDismissAnimation() {
        Animation translateAnimation;
        MessageSettings.MessageAnimation dismissAnimation = getSettings().getDismissAnimation();
        if (dismissAnimation == null) {
            MobileCore.log(LoggingMode.VERBOSE, TAG, "No dismiss animation found in the message settings. Message will be removed.");
            return null;
        }
        MobileCore.log(LoggingMode.VERBOSE, TAG, "Creating dismiss animation for " + dismissAnimation.name());
        switch (AnonymousClass3.$SwitchMap$com$adobe$marketing$mobile$services$ui$MessageSettings$MessageAnimation[dismissAnimation.ordinal()]) {
            case 1:
                translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, -this.parentActivityContentHeight);
                break;
            case 2:
                translateAnimation = new AlphaAnimation(1.0f, 0.0f);
                translateAnimation.setInterpolator(new DecelerateInterpolator());
                break;
            case 3:
                translateAnimation = new TranslateAnimation(0.0f, -this.parentActivityContentWidth, 0.0f, 0.0f);
                break;
            case 4:
                translateAnimation = new TranslateAnimation(0.0f, this.parentActivityContentWidth, 0.0f, 0.0f);
                break;
            case 5:
                translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, this.parentActivityContentHeight * 2);
                break;
            case 6:
                translateAnimation = new TranslateAnimation(0.0f, this.parentActivityContentWidth, 0.0f, this.parentActivityContentHeight);
                break;
            default:
                translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, 0.0f);
                break;
        }
        if (dismissAnimation.equals(MessageSettings.MessageAnimation.FADE)) {
            translateAnimation.setDuration(600L);
        } else {
            translateAnimation.setDuration(300L);
        }
        translateAnimation.setFillAfter(true);
        return translateAnimation;
    }

    public void cleanup() {
        MobileCore.log(LoggingMode.DEBUG, TAG, "Cleaning the AEPMessage.");
        removeFullscreenMessage();
        delegateFullscreenMessageDismiss();
    }

    @Override // com.adobe.marketing.mobile.services.ui.FullscreenMessage
    public void dismiss() {
        if (!this.messageFragment.dismissedWithGesture) {
            Animation animation = setupDismissAnimation();
            this.dismissAnimation = animation;
            if (animation != null) {
                Animation.AnimationListener animationListener = new Animation.AnimationListener() { // from class: com.adobe.marketing.mobile.services.ui.AEPMessage.2
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation2) {
                        AEPMessage.this.cleanup();
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation2) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation2) {
                    }
                };
                this.animationListener = animationListener;
                this.dismissAnimation.setAnimationListener(animationListener);
                this.webView.startAnimation(this.dismissAnimation);
                return;
            }
        }
        cleanup();
    }

    public Animation.AnimationListener getAnimationListener() {
        return this.animationListener;
    }

    public MessageFragment getMessageFragment() {
        return this.messageFragment;
    }

    public String getMessageHtml() {
        return this.html;
    }

    public ViewGroup.LayoutParams getParams() {
        return this.params;
    }

    @Override // com.adobe.marketing.mobile.services.ui.FullscreenMessage
    public Object getParent() {
        return this.settings.getParent();
    }

    public int getParentActivityContentHeight() {
        return this.parentActivityContentHeight;
    }

    public int getParentActivityContentWidth() {
        return this.parentActivityContentWidth;
    }

    public MessageSettings getSettings() {
        return this.settings;
    }

    public WebView getWebView() {
        return this.webView;
    }

    public boolean isMessageVisible() {
        return this.isVisible;
    }

    @Override // com.adobe.marketing.mobile.services.ui.FullscreenMessage
    public void openUrl(String str) {
        if (StringUtils.isNullOrEmpty(str)) {
            MobileCore.log(LoggingMode.DEBUG, TAG, "Could not open url because it is null or empty.");
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            App.getInstance().getCurrentActivity().startActivity(intent);
        } catch (NullPointerException e5) {
            MobileCore.log(LoggingMode.WARNING, TAG, "Could not open the url from the message " + e5.getMessage());
        }
    }

    public void recreateWebView(int i10, int i11) {
        this.parentActivityContentWidth = i10;
        this.parentActivityContentHeight = i11;
        try {
            MessageWebViewRunner messageWebViewRunner = new MessageWebViewRunner(this);
            this.messageWebViewRunner = messageWebViewRunner;
            messageWebViewRunner.setLocalAssetsMap(this.assetMap);
            this.messageWebViewRunner.run();
        } catch (Exception e5) {
            MobileCore.log(LoggingMode.WARNING, TAG, "Exception occurred when creating the MessageWebViewRunner: " + e5.getMessage());
        }
    }

    public void removeFullscreenMessage() {
        this.isVisible = false;
        this.messageFragment.dismiss();
        this.webView = null;
        this.messageFragment = null;
    }

    public void setParams(ViewGroup.LayoutParams layoutParams) {
        this.params = layoutParams;
    }

    public void setWebView(WebView webView) {
        this.webView = webView;
    }

    @Override // com.adobe.marketing.mobile.services.ui.FullscreenMessage
    @SuppressLint({"ResourceType"})
    public void show() {
        MessagesMonitor messagesMonitor = this.messagesMonitor;
        if (messagesMonitor != null && messagesMonitor.isDisplayed()) {
            MobileCore.log(LoggingMode.DEBUG, TAG, "Message couldn't be displayed, another message is displayed at this time.");
            this.fullScreenMessageDelegate.onShowFailure();
            return;
        }
        final Activity currentActivity = App.getInstance().getCurrentActivity();
        if (currentActivity == null) {
            MobileCore.log(LoggingMode.DEBUG, TAG, "Unexpected Null Value (current activity), failed to show the message.");
            this.fullScreenMessageDelegate.onShowFailure();
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean(MessageFragment.getArgumentKeyIsUiTakeOver(), this.settings.getUITakeover());
        bundle.putString(MessageFragment.getArgumentKeyBackdropColor(), this.settings.getBackdropColor());
        bundle.putFloat(MessageFragment.getArgumentKeyBackdropOpacity(), this.settings.getBackdropOpacity());
        if (this.messageFragment == null) {
            this.messageFragment = new MessageFragment();
        }
        this.messageFragment.setMessage(this);
        this.messageFragment.setArguments(bundle);
        currentActivity.runOnUiThread(new Runnable() { // from class: com.adobe.marketing.mobile.services.ui.AEPMessage.1
            @Override // java.lang.Runnable
            public void run() {
                AEPMessage.this.messageFragment.show(currentActivity.getFragmentManager(), AEPMessage.FRAGMENT_TAG);
            }
        });
    }

    public void viewed() {
        this.isVisible = true;
        FullscreenMessageDelegate fullscreenMessageDelegate = this.fullScreenMessageDelegate;
        if (fullscreenMessageDelegate != null) {
            fullscreenMessageDelegate.onShow(this);
        }
    }

    public AEPMessage(String str, MessageSettings messageSettings, Map<String, String> map) throws MessageCreationException {
        this.fullScreenMessageDelegate = ServiceProvider.getInstance().getMessageDelegate();
        this.messagesMonitor = MessagesMonitor.getInstance();
        if (messageSettings != null) {
            if (messageSettings instanceof AEPMessageSettings) {
                this.settings = messageSettings;
                this.html = str;
                this.assetMap = map;
                return;
            }
            throw new MessageCreationException("MessageSettings were not of type AEPMessageSettings.");
        }
        throw new MessageCreationException("MessageSettings were null.");
    }
}
