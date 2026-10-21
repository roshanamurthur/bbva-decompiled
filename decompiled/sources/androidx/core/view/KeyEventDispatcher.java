package androidx.core.view;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class KeyEventDispatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f20201a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f20202b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f20203c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Field f20204d;

    public interface Component {
        boolean superDispatchKeyEvent(@NonNull KeyEvent keyEvent);
    }

    public static boolean dispatchBeforeHierarchy(@NonNull View view, @NonNull KeyEvent keyEvent) {
        return ViewCompat.e(view, keyEvent);
    }

    @SuppressLint({"LambdaLast"})
    public static boolean dispatchKeyEvent(@NonNull Component component, @Nullable View view, @Nullable Window.Callback callback, @NonNull KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        if (component == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return component.superDispatchKeyEvent(keyEvent);
        }
        if (callback instanceof Activity) {
            Activity activity = (Activity) callback;
            activity.onUserInteraction();
            Window window = activity.getWindow();
            if (window.hasFeature(8)) {
                ActionBar actionBar = activity.getActionBar();
                if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                    if (!f20201a) {
                        try {
                            f20202b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                        } catch (NoSuchMethodException unused) {
                        }
                        f20201a = true;
                    }
                    Method method = f20202b;
                    if (method != null) {
                        try {
                            Object objInvoke = method.invoke(actionBar, keyEvent);
                            if (objInvoke != null && ((Boolean) objInvoke).booleanValue()) {
                                return true;
                            }
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                        }
                    }
                }
            }
            if (window.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
            View decorView = window.getDecorView();
            if (ViewCompat.d(decorView, keyEvent)) {
                return true;
            }
            return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
        }
        if (!(callback instanceof Dialog)) {
            return (view != null && ViewCompat.d(view, keyEvent)) || component.superDispatchKeyEvent(keyEvent);
        }
        Dialog dialog = (Dialog) callback;
        if (!f20203c) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                f20204d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused3) {
            }
            f20203c = true;
        }
        Field field = f20204d;
        if (field != null) {
            try {
                onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
            } catch (IllegalAccessException unused4) {
                onKeyListener = null;
            }
        } else {
            onKeyListener = null;
        }
        if (onKeyListener != null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        Window window2 = dialog.getWindow();
        if (window2.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView2 = window2.getDecorView();
        if (ViewCompat.d(decorView2, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
    }
}
