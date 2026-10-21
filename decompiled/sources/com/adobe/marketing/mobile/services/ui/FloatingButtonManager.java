package com.adobe.marketing.mobile.services.ui;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.adobe.marketing.mobile.LoggingMode;
import com.adobe.marketing.mobile.MobileCore;
import com.adobe.marketing.mobile.internal.context.App;
import com.bbva.sl.ar.core.libmcrypt.exception.ErrorCodes;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
class FloatingButtonManager implements FloatingButton {
    private static final String LOG_TAG = "FloatingButtonManager";
    private static final String UNEXPECTED_NULL_VALUE = "Unexpected Null Value";
    private Application.ActivityLifecycleCallbacks activityLifecycleCallbacks;
    private AndroidUIService androidUIService;
    private FloatingButtonListener buttonListener;
    private float lastKnownXPos;
    private float lastKnownYPos;
    private boolean displayFloatingButtonAcrossActivities = false;
    Map<String, FloatingButtonView> managedButtons = new HashMap();

    public FloatingButtonManager(AndroidUIService androidUIService, FloatingButtonListener floatingButtonListener) {
        this.buttonListener = null;
        this.androidUIService = androidUIService;
        this.buttonListener = floatingButtonListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float adjustXBounds(FloatingButtonView floatingButtonView, float f6, float f10) {
        return (floatingButtonView == null || f10 <= f6 - ((float) floatingButtonView.getWidth())) ? f10 : f6 - floatingButtonView.getWidth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float adjustYBounds(FloatingButtonView floatingButtonView, float f6, float f10) {
        return (floatingButtonView == null || f10 <= f6 - ((float) floatingButtonView.getHeight())) ? f10 : f6 - floatingButtonView.getHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getPxForDp(Context context, int i10) {
        try {
            return Math.round(i10 * context.getResources().getDisplayMetrics().density);
        } catch (Exception unused) {
            return ErrorCodes.ERR_CRY_IO_PROPERTIES;
        }
    }

    public void addManagedButton(String str, FloatingButtonView floatingButtonView) {
        floatingButtonView.setFloatingButtonListener(this.buttonListener);
        this.managedButtons.put(str, floatingButtonView);
    }

    public void deregisterLifecycleCallbacks() {
        Application application = MobileCore.getApplication();
        if (application != null) {
            application.unregisterActivityLifecycleCallbacks(this.activityLifecycleCallbacks);
            this.activityLifecycleCallbacks = null;
        }
    }

    @Override // com.adobe.marketing.mobile.services.ui.FloatingButton
    public void display() {
        Activity currentActivity = App.getInstance().getCurrentActivity();
        if (currentActivity == null) {
            MobileCore.log(LoggingMode.DEBUG, LOG_TAG, String.format("%s (Current activity), will not display button.", UNEXPECTED_NULL_VALUE));
            return;
        }
        if (this.activityLifecycleCallbacks != null) {
            MobileCore.log(LoggingMode.DEBUG, LOG_TAG, "Display cannot be called twice!");
            return;
        }
        Application application = MobileCore.getApplication();
        if (application != null) {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = getActivityLifecycleCallbacks();
            this.activityLifecycleCallbacks = activityLifecycleCallbacks;
            application.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
        display(0.0f, 0.0f, currentActivity);
        this.displayFloatingButtonAcrossActivities = true;
    }

    public Application.ActivityLifecycleCallbacks getActivityLifecycleCallbacks() {
        return new Application.ActivityLifecycleCallbacks() { // from class: com.adobe.marketing.mobile.services.ui.FloatingButtonManager.1
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(Activity activity) {
                FloatingButtonManager.this.managedButtons.remove(activity.getLocalClassName());
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(Activity activity) {
                if (FloatingButtonManager.this.displayFloatingButtonAcrossActivities) {
                    if (FloatingButtonManager.this.managedButtons.get(activity.getLocalClassName()) == null) {
                        FloatingButtonManager.this.addManagedButton(activity.getLocalClassName(), FloatingButtonManager.this.androidUIService.createFloatingButtonView(activity));
                    }
                    FloatingButtonManager floatingButtonManager = FloatingButtonManager.this;
                    floatingButtonManager.display(floatingButtonManager.lastKnownXPos, FloatingButtonManager.this.lastKnownYPos, activity);
                    return;
                }
                if (FloatingButtonManager.this.managedButtons.containsKey(activity.getLocalClassName())) {
                    FloatingButtonManager.this.removeFloatingButtonFromActivity(activity);
                }
                if (FloatingButtonManager.this.managedButtons.isEmpty()) {
                    FloatingButtonManager.this.deregisterLifecycleCallbacks();
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }
        };
    }

    @Override // com.adobe.marketing.mobile.services.ui.FloatingButton
    public void remove() {
        removeFloatingButtonFromActivity(App.getInstance().getCurrentActivity());
        this.displayFloatingButtonAcrossActivities = false;
    }

    public void removeFloatingButtonFromActivity(Activity activity) {
        if (activity == null) {
            MobileCore.log(LoggingMode.DEBUG, LOG_TAG, String.format("%s (Activity), cannot remove button!", UNEXPECTED_NULL_VALUE));
        } else {
            activity.runOnUiThread(new Runnable() { // from class: com.adobe.marketing.mobile.services.ui.FloatingButtonManager.3
                @Override // java.lang.Runnable
                public void run() {
                    Activity currentActivity = App.getInstance().getCurrentActivity();
                    if (currentActivity == null) {
                        MobileCore.log(LoggingMode.DEBUG, FloatingButtonManager.LOG_TAG, String.format("%s (Activity), cannot remove button!", FloatingButtonManager.UNEXPECTED_NULL_VALUE));
                        return;
                    }
                    FloatingButtonView floatingButtonView = (FloatingButtonView) ((ViewGroup) currentActivity.getWindow().getDecorView().getRootView()).findViewWithTag("ADBFloatingButtonTag");
                    if (floatingButtonView != null) {
                        floatingButtonView.setVisibility(8);
                    } else {
                        MobileCore.log(LoggingMode.DEBUG, FloatingButtonManager.LOG_TAG, String.format("No button found to remove for %s", currentActivity.getLocalClassName()));
                    }
                }
            });
            this.managedButtons.remove(activity.getLocalClassName());
        }
    }

    public void removeOnGlobalLayoutListenerCompat(FloatingButtonView floatingButtonView, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        ViewTreeObserver viewTreeObserver = floatingButtonView.getViewTreeObserver();
        try {
            viewTreeObserver.getClass().getDeclaredMethod("removeOnGlobalLayoutListener", ViewTreeObserver.OnGlobalLayoutListener.class).invoke(viewTreeObserver, onGlobalLayoutListener);
        } catch (Exception e5) {
            MobileCore.log(LoggingMode.ERROR, LOG_TAG, String.format("Error while cleaning up (%s)", e5));
        }
    }

    public void display(final float f6, final float f10, final Activity activity) {
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            final int i10 = displayMetrics.heightPixels;
            final int i11 = displayMetrics.widthPixels;
            final ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView().getRootView();
            activity.runOnUiThread(new Runnable() { // from class: com.adobe.marketing.mobile.services.ui.FloatingButtonManager.2
                @Override // java.lang.Runnable
                public void run() {
                    final int measuredWidth = viewGroup.getMeasuredWidth() == 0 ? i11 : viewGroup.getMeasuredWidth();
                    final int measuredHeight = viewGroup.getMeasuredHeight() == 0 ? i10 : viewGroup.getMeasuredHeight();
                    FloatingButtonView floatingButtonView = (FloatingButtonView) viewGroup.findViewWithTag("ADBFloatingButtonTag");
                    if (floatingButtonView != null) {
                        FloatingButtonManager floatingButtonManager = FloatingButtonManager.this;
                        floatingButtonManager.lastKnownXPos = floatingButtonManager.adjustXBounds(floatingButtonView, measuredWidth, f6);
                        FloatingButtonManager floatingButtonManager2 = FloatingButtonManager.this;
                        floatingButtonManager2.lastKnownYPos = floatingButtonManager2.adjustYBounds(floatingButtonView, measuredHeight, f10);
                        floatingButtonView.setXYCompat(FloatingButtonManager.this.lastKnownXPos, FloatingButtonManager.this.lastKnownYPos);
                        return;
                    }
                    String localClassName = activity.getLocalClassName();
                    final FloatingButtonView floatingButtonView2 = FloatingButtonManager.this.managedButtons.get(localClassName);
                    if (floatingButtonView2 == null) {
                        MobileCore.log(LoggingMode.DEBUG, FloatingButtonManager.LOG_TAG, String.format("%s (Floating button view), for activity: %s", FloatingButtonManager.UNEXPECTED_NULL_VALUE, localClassName));
                        return;
                    }
                    floatingButtonView2.setOnPositionChangedListener(new FloatingButtonView.OnPositionChangedListener() { // from class: com.adobe.marketing.mobile.services.ui.FloatingButtonManager.2.1
                        @Override // com.adobe.marketing.mobile.services.ui.FloatingButtonView.OnPositionChangedListener
                        public void onPositionChanged(float f11, float f12) {
                            FloatingButtonManager.this.lastKnownXPos = f11;
                            FloatingButtonManager.this.lastKnownYPos = f12;
                        }
                    });
                    floatingButtonView2.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.adobe.marketing.mobile.services.ui.FloatingButtonManager.2.2
                        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                        public void onGlobalLayout() {
                            FloatingButtonManager.this.removeOnGlobalLayoutListenerCompat(floatingButtonView2, this);
                            AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                            float f11 = f6;
                            if (f11 < 0.0f || f10 < 0.0f) {
                                FloatingButtonManager.this.lastKnownXPos = (measuredWidth / 2) - (floatingButtonView2.getWidth() / 2);
                                FloatingButtonManager.this.lastKnownYPos = (measuredHeight / 2) - (floatingButtonView2.getHeight() / 2);
                                floatingButtonView2.setXYCompat(FloatingButtonManager.this.lastKnownXPos, FloatingButtonManager.this.lastKnownYPos);
                                return;
                            }
                            FloatingButtonManager floatingButtonManager3 = FloatingButtonManager.this;
                            floatingButtonManager3.lastKnownXPos = floatingButtonManager3.adjustXBounds(floatingButtonView2, measuredWidth, f11);
                            AnonymousClass2 anonymousClass3 = AnonymousClass2.this;
                            FloatingButtonManager floatingButtonManager4 = FloatingButtonManager.this;
                            floatingButtonManager4.lastKnownYPos = floatingButtonManager4.adjustYBounds(floatingButtonView2, measuredHeight, f10);
                            floatingButtonView2.setXYCompat(FloatingButtonManager.this.lastKnownXPos, FloatingButtonManager.this.lastKnownYPos);
                        }
                    });
                    viewGroup.addView(floatingButtonView2);
                    ViewGroup.LayoutParams layoutParams = floatingButtonView2.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.width = FloatingButtonManager.this.getPxForDp(floatingButtonView2.getContext(), 80);
                        layoutParams.height = FloatingButtonManager.this.getPxForDp(floatingButtonView2.getContext(), 80);
                        floatingButtonView2.setLayoutParams(layoutParams);
                    }
                }
            });
        } catch (Exception e5) {
            MobileCore.log(LoggingMode.ERROR, LOG_TAG, String.format("Could not display the button (%s)", e5));
        }
    }
}
