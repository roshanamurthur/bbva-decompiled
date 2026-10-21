package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bbva.nativesettings.common.Constants;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: ImmLeaksCleaner.java */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi(19)
public final class p implements LifecycleEventObserver {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f454q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static Field f455r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static Field f456s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static Field f457t0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public Activity f458p0;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(@NonNull LifecycleOwner lifecycleOwner, @NonNull Lifecycle.Event event) {
        if (event != Lifecycle.Event.ON_DESTROY) {
            return;
        }
        if (f454q0 == 0) {
            try {
                f454q0 = 2;
                Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                f456s0 = declaredField;
                declaredField.setAccessible(true);
                Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
                f457t0 = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
                f455r0 = declaredField3;
                declaredField3.setAccessible(true);
                f454q0 = 1;
            } catch (NoSuchFieldException unused) {
            }
        }
        if (f454q0 == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f458p0.getSystemService(Constants.INPUT_METHOD);
            try {
                Object obj = f455r0.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            View view = (View) f456s0.get(inputMethodManager);
                            if (view == null) {
                                return;
                            }
                            if (view.isAttachedToWindow()) {
                                return;
                            }
                            try {
                                f457t0.set(inputMethodManager, null);
                                inputMethodManager.isActive();
                            } catch (IllegalAccessException unused2) {
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    } catch (ClassCastException unused3) {
                    } catch (IllegalAccessException unused4) {
                    }
                }
            } catch (IllegalAccessException unused5) {
            }
        }
    }
}
