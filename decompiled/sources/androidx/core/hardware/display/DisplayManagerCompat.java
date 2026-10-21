package androidx.core.hardware.display;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class DisplayManagerCompat {
    public static final String DISPLAY_CATEGORY_PRESENTATION = "android.hardware.display.category.PRESENTATION";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final WeakHashMap<Context, WeakReference<DisplayManagerCompat>> f19929b = new WeakHashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f19930a;

    @RequiresApi(17)
    public static class a {
        @DoNotInline
        public static Display a(DisplayManager displayManager, int i10) {
            return displayManager.getDisplay(i10);
        }

        @DoNotInline
        public static Display[] b(DisplayManager displayManager) {
            return displayManager.getDisplays();
        }
    }

    public DisplayManagerCompat(Context context) {
        this.f19930a = context;
    }

    @NonNull
    public static DisplayManagerCompat getInstance(@NonNull Context context) {
        DisplayManagerCompat displayManagerCompat;
        WeakHashMap<Context, WeakReference<DisplayManagerCompat>> weakHashMap = f19929b;
        synchronized (weakHashMap) {
            try {
                WeakReference<DisplayManagerCompat> weakReference = weakHashMap.get(context);
                if (weakReference == null || weakReference.get() == null) {
                    weakReference = new WeakReference<>(new DisplayManagerCompat(context));
                    weakHashMap.put(context, weakReference);
                }
                displayManagerCompat = weakReference.get();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return displayManagerCompat;
    }

    @Nullable
    public Display getDisplay(int i10) {
        return a.a((DisplayManager) this.f19930a.getSystemService("display"), i10);
    }

    @NonNull
    public Display[] getDisplays() {
        return a.b((DisplayManager) this.f19930a.getSystemService("display"));
    }

    @NonNull
    public Display[] getDisplays(@Nullable String str) {
        return a.b((DisplayManager) this.f19930a.getSystemService("display"));
    }
}
