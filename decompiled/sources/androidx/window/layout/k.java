package androidx.window.layout;

import android.content.Context;
import androidx.annotation.RestrictTo;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: WindowInfoTracker.kt */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k {
    static {
        WindowInfoTracker.Companion companion = WindowInfoTracker.INSTANCE;
    }

    @JvmStatic
    @JvmName(name = "getOrCreate")
    @NotNull
    public static WindowInfoTracker a(@NotNull Context context) {
        return WindowInfoTracker.INSTANCE.getOrCreate(context);
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static void b(@NotNull WindowInfoTrackerDecorator windowInfoTrackerDecorator) {
        WindowInfoTracker.INSTANCE.overrideDecorator(windowInfoTrackerDecorator);
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static void c() {
        WindowInfoTracker.INSTANCE.reset();
    }
}
