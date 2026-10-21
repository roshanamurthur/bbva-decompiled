package com.adobe.marketing.mobile;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.webkit.MimeTypeMap;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.adobe.marketing.mobile.services.ui.internal.MessagesMonitor;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
class AndroidFullscreenMessage implements UIService.UIFullScreenMessage {
    private static final int ANIMATION_DURATION = 300;
    private static final String BASE_URL = "file:///android_asset/";
    private static final String MIME_TYPE = "text/html";
    private static final String TAG = "AndroidFullscreenMessage";
    private Map<String, String> assetMap = Collections.emptyMap();
    private final UIService.UIFullScreenListener fullscreenListener;
    private final String html;
    private boolean isVisible;
    Activity messageFullScreenActivity;
    private MessagesMonitor messagesMonitor;
    private int orientationWhenShown;
    ViewGroup rootViewGroup;
    private WebView webView;
    private MessageFullScreenWebViewClient webViewClient;

    public static class MessageFullScreenRunner implements Runnable {
        private final AndroidFullscreenMessage message;

        public MessageFullScreenRunner(AndroidFullscreenMessage androidFullscreenMessage) {
            this.message = androidFullscreenMessage;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.message.webView = new WebView(this.message.messageFullScreenActivity);
                this.message.webView.setVerticalScrollBarEnabled(false);
                this.message.webView.setHorizontalScrollBarEnabled(false);
                this.message.webView.setBackgroundColor(0);
                this.message.webViewClient = new MessageFullScreenWebViewClient(this.message);
                this.message.webView.setWebViewClient(this.message.webViewClient);
                WebSettings settings = this.message.webView.getSettings();
                settings.setJavaScriptEnabled(true);
                settings.setAllowFileAccess(false);
                settings.setDomStorageEnabled(true);
                Method method = settings.getClass().getMethod("setMediaPlaybackRequiresUserGesture", Boolean.TYPE);
                method.setAccessible(true);
                method.invoke(settings, Boolean.FALSE);
                Context appContext = com.adobe.marketing.mobile.internal.context.App.getInstance().getAppContext();
                File cacheDir = appContext != null ? appContext.getCacheDir() : null;
                if (cacheDir != null) {
                    settings.setDatabasePath(cacheDir.getPath());
                    settings.setDatabaseEnabled(true);
                }
                settings.setDefaultTextEncodingName("UTF-8");
                this.message.webView.loadDataWithBaseURL("file:///android_asset/", this.message.html, AndroidFullscreenMessage.MIME_TYPE, "UTF-8", null);
                ViewGroup viewGroup = this.message.rootViewGroup;
                if (viewGroup == null) {
                    Log.debug(AndroidFullscreenMessage.TAG, "%s (root view group), failed to show the fullscreen message.", "Unexpected Null Value");
                    this.message.remove();
                    return;
                }
                int measuredWidth = viewGroup.getMeasuredWidth();
                int measuredHeight = this.message.rootViewGroup.getMeasuredHeight();
                if (measuredWidth != 0 && measuredHeight != 0) {
                    if (this.message.isVisible) {
                        AndroidFullscreenMessage androidFullscreenMessage = this.message;
                        androidFullscreenMessage.rootViewGroup.addView(androidFullscreenMessage.webView, measuredWidth, measuredHeight);
                    } else {
                        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, measuredHeight, 0.0f);
                        translateAnimation.setDuration(300L);
                        this.message.webView.setAnimation(translateAnimation);
                        AndroidFullscreenMessage androidFullscreenMessage2 = this.message;
                        androidFullscreenMessage2.rootViewGroup.addView(androidFullscreenMessage2.webView, measuredWidth, measuredHeight);
                    }
                    this.message.viewed();
                    return;
                }
                Log.warning(AndroidFullscreenMessage.TAG, "Failed to show the fullscreen message, root view group has not been measured.", new Object[0]);
                this.message.remove();
            } catch (Exception e5) {
                Log.error(AndroidFullscreenMessage.TAG, "Failed to show the full screen message (%s).", e5.toString());
            }
        }
    }

    public static class MessageFullScreenWebViewClient extends WebViewClient {
        private final AndroidFullscreenMessage message;

        public MessageFullScreenWebViewClient(AndroidFullscreenMessage androidFullscreenMessage) {
            this.message = androidFullscreenMessage;
        }

        private boolean handleUrl(String str) {
            UIService.UIFullScreenListener uIFullScreenListener = this.message.fullscreenListener;
            return uIFullScreenListener == null || uIFullScreenListener.overrideUrlLoad(this.message, str);
        }

        private WebResourceResponse handleWebResourceRequest(String str) {
            if (StringUtils.stringIsUrl(str) && this.message.assetMap.get(str) != null) {
                try {
                    return new WebResourceResponse(MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(str)), null, new FileInputStream((String) this.message.assetMap.get(str)));
                } catch (IOException unused) {
                    Log.debug(AndroidFullscreenMessage.TAG, "Unable to create WebResourceResponse for remote asset %s and local asset %s", str, this.message.assetMap.get(str));
                }
            }
            return null;
        }

        @Override // android.webkit.WebViewClient
        @Nullable
        @RequiresApi(api = 21)
        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            WebResourceResponse webResourceResponseHandleWebResourceRequest = handleWebResourceRequest(webResourceRequest.getUrl().toString());
            return webResourceResponseHandleWebResourceRequest != null ? webResourceResponseHandleWebResourceRequest : super.shouldInterceptRequest(webView, webResourceRequest);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return handleUrl(str);
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(24)
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return handleUrl(webResourceRequest.getUrl().toString());
        }

        @Override // android.webkit.WebViewClient
        @Nullable
        public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            WebResourceResponse webResourceResponseHandleWebResourceRequest = handleWebResourceRequest(str);
            return webResourceResponseHandleWebResourceRequest != null ? webResourceResponseHandleWebResourceRequest : super.shouldInterceptRequest(webView, str);
        }
    }

    public AndroidFullscreenMessage(String str, UIService.UIFullScreenListener uIFullScreenListener, MessagesMonitor messagesMonitor) {
        this.messagesMonitor = messagesMonitor;
        this.html = str;
        this.fullscreenListener = uIFullScreenListener;
    }

    private void removeFromRootViewGroup() {
        if (this.rootViewGroup == null) {
            Log.debug(TAG, "%s (root view group), failed to dismiss the fullscreen message.", "Unexpected Null Value");
            return;
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, this.rootViewGroup.getMeasuredHeight());
        translateAnimation.setDuration(300L);
        translateAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.adobe.marketing.mobile.AndroidFullscreenMessage.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                AndroidFullscreenMessage.this.messageFullScreenActivity.finish();
                AndroidFullscreenMessage.this.messageFullScreenActivity.overridePendingTransition(0, 0);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        });
        this.webView.setAnimation(translateAnimation);
        this.rootViewGroup.removeView(this.webView);
    }

    public void dismissed() {
        this.isVisible = false;
        UIService.UIFullScreenListener uIFullScreenListener = this.fullscreenListener;
        if (uIFullScreenListener != null) {
            uIFullScreenListener.onDismiss(this);
        }
        MessagesMonitor messagesMonitor = this.messagesMonitor;
        if (messagesMonitor != null) {
            messagesMonitor.dismissed();
        }
    }

    @Override // com.adobe.marketing.mobile.UIService.UIFullScreenMessage
    public void openUrl(String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            Activity activity = this.messageFullScreenActivity;
            if (activity != null) {
                activity.startActivity(intent);
            }
        } catch (Exception e5) {
            Log.warning(TAG, "Could not open the url from the fullscreen message (%s)", e5.toString());
        }
    }

    @Override // com.adobe.marketing.mobile.UIService.UIFullScreenMessage
    public void remove() {
        removeFromRootViewGroup();
        FullscreenMessageActivity.setFullscreenMessage(null);
        MessagesMonitor messagesMonitor = this.messagesMonitor;
        if (messagesMonitor != null) {
            messagesMonitor.dismissed();
        }
        this.isVisible = false;
    }

    @Override // com.adobe.marketing.mobile.UIService.UIFullScreenMessage
    public void setLocalAssetsMap(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        this.assetMap = new HashMap(map);
    }

    @Override // com.adobe.marketing.mobile.UIService.UIFullScreenMessage
    public void show() {
        MessagesMonitor messagesMonitor = this.messagesMonitor;
        if (messagesMonitor != null && messagesMonitor.isDisplayed()) {
            Log.debug(TAG, "Full screen message couldn't be displayed, another message is displayed at this time", new Object[0]);
            return;
        }
        Activity currentActivity = com.adobe.marketing.mobile.internal.context.App.getInstance().getCurrentActivity();
        if (currentActivity == null) {
            Log.debug(TAG, "%s (current activity), failed to show the fullscreen message.", "Unexpected Null Value");
            return;
        }
        try {
            Intent intent = new Intent(currentActivity.getApplicationContext(), (Class<?>) FullscreenMessageActivity.class);
            intent.addFlags(65536);
            FullscreenMessageActivity.setFullscreenMessage(this);
            currentActivity.startActivity(intent);
            currentActivity.overridePendingTransition(0, 0);
            MessagesMonitor messagesMonitor2 = this.messagesMonitor;
            if (messagesMonitor2 != null) {
                messagesMonitor2.displayed();
            }
        } catch (ActivityNotFoundException unused) {
            Log.error(TAG, "Failed to show the fullscreen message, could not start the activity.", new Object[0]);
        }
    }

    public void showInRootViewGroup() {
        int currentOrientation = com.adobe.marketing.mobile.internal.context.App.getInstance().getCurrentOrientation();
        if (this.isVisible && this.orientationWhenShown == currentOrientation) {
            return;
        }
        this.orientationWhenShown = currentOrientation;
        new Handler(Looper.getMainLooper()).post(new MessageFullScreenRunner(this));
    }

    public void viewed() {
        this.isVisible = true;
        UIService.UIFullScreenListener uIFullScreenListener = this.fullscreenListener;
        if (uIFullScreenListener != null) {
            uIFullScreenListener.onShow(this);
        }
    }
}
