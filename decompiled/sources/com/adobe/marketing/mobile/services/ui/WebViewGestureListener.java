package com.adobe.marketing.mobile.services.ui;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.webkit.WebView;
import com.adobe.marketing.mobile.LoggingMode;
import com.adobe.marketing.mobile.MobileCore;
import com.adobe.marketing.mobile.internal.utility.StringUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
class WebViewGestureListener extends GestureDetector.SimpleOnGestureListener {
    private static final int ANIMATION_DURATION = 300;
    private static final int SWIPE_THRESHOLD = 200;
    private static final int SWIPE_VELOCITY_THRESHOLD = 300;
    private static final String TAG = "WebViewGestureListener";
    private Animator.AnimatorListener animatorListener;
    private final MessageFragment parentFragment;

    /* JADX INFO: renamed from: com.adobe.marketing.mobile.services.ui.WebViewGestureListener$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$adobe$marketing$mobile$services$ui$MessageSettings$MessageGesture;

        static {
            int[] iArr = new int[MessageSettings.MessageGesture.values().length];
            $SwitchMap$com$adobe$marketing$mobile$services$ui$MessageSettings$MessageGesture = iArr;
            try {
                iArr[MessageSettings.MessageGesture.SWIPE_RIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$adobe$marketing$mobile$services$ui$MessageSettings$MessageGesture[MessageSettings.MessageGesture.SWIPE_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$adobe$marketing$mobile$services$ui$MessageSettings$MessageGesture[MessageSettings.MessageGesture.SWIPE_UP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public WebViewGestureListener(MessageFragment messageFragment) {
        this.parentFragment = messageFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dismissMessage(MessageSettings.MessageGesture messageGesture, boolean z10) {
        MessageFragment messageFragment = this.parentFragment;
        messageFragment.dismissedWithGesture = z10;
        AEPMessage aEPMessage = messageFragment.message;
        if (aEPMessage == null || aEPMessage.fullScreenMessageDelegate == null) {
            return;
        }
        Map<MessageSettings.MessageGesture, String> map = messageFragment.gestures;
        String str = map == null ? null : map.get(messageGesture);
        if (StringUtils.isNullOrEmpty(str)) {
            this.parentFragment.message.dismiss();
        } else {
            AEPMessage aEPMessage2 = this.parentFragment.message;
            aEPMessage2.fullScreenMessageDelegate.overrideUrlLoad(aEPMessage2, str);
        }
    }

    public Animator.AnimatorListener getAnimationListener() {
        return this.animatorListener;
    }

    public void handleGesture(final MessageSettings.MessageGesture messageGesture) {
        ObjectAnimator objectAnimatorOfFloat;
        if (messageGesture.equals(MessageSettings.MessageGesture.BACKGROUND_TAP)) {
            dismissMessage(messageGesture, false);
            return;
        }
        WebView webView = this.parentFragment.message.getWebView();
        int i10 = AnonymousClass2.$SwitchMap$com$adobe$marketing$mobile$services$ui$MessageSettings$MessageGesture[messageGesture.ordinal()];
        if (i10 == 1) {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(webView, "x", webView.getX(), this.parentFragment.message.getParentActivityContentWidth());
        } else if (i10 != 2) {
            objectAnimatorOfFloat = i10 != 3 ? ObjectAnimator.ofFloat(webView, "y", webView.getTop(), this.parentFragment.message.getParentActivityContentHeight()) : ObjectAnimator.ofFloat(webView, "y", webView.getTop(), -this.parentFragment.message.getParentActivityContentHeight());
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(webView, "x", webView.getX(), -this.parentFragment.message.getParentActivityContentWidth());
        }
        if (objectAnimatorOfFloat != null) {
            objectAnimatorOfFloat.setDuration(300L);
            Animator.AnimatorListener animatorListener = new Animator.AnimatorListener() { // from class: com.adobe.marketing.mobile.services.ui.WebViewGestureListener.1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    WebViewGestureListener.this.dismissMessage(messageGesture, true);
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                }
            };
            this.animatorListener = animatorListener;
            objectAnimatorOfFloat.addListener(animatorListener);
            objectAnimatorOfFloat.start();
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        MobileCore.log(LoggingMode.VERBOSE, TAG, "onDown: " + motionEvent.toString());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f6, float f10) {
        float x4 = motionEvent2.getX() - motionEvent.getX();
        float y7 = motionEvent2.getY() - motionEvent.getY();
        if (Math.abs(x4) > Math.abs(y7)) {
            if (Math.abs(x4) > 200.0f && Math.abs(f6) > 300.0f) {
                if (x4 > 0.0f) {
                    MobileCore.log(LoggingMode.VERBOSE, TAG, "Detected swipe right.");
                    handleGesture(MessageSettings.MessageGesture.SWIPE_RIGHT);
                    return true;
                }
                MobileCore.log(LoggingMode.VERBOSE, TAG, "Detected swipe left.");
                handleGesture(MessageSettings.MessageGesture.SWIPE_LEFT);
                return true;
            }
        } else if (Math.abs(y7) > 200.0f && Math.abs(f10) > 300.0f) {
            if (y7 > 0.0f) {
                MobileCore.log(LoggingMode.VERBOSE, TAG, "Detected swipe down.");
                handleGesture(MessageSettings.MessageGesture.SWIPE_DOWN);
                return true;
            }
            MobileCore.log(LoggingMode.VERBOSE, TAG, "Detected swipe up.");
            handleGesture(MessageSettings.MessageGesture.SWIPE_UP);
            return true;
        }
        return false;
    }
}
