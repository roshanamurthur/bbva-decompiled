package com.bbva.showinfo.nativemodal.utils;

import android.content.Context;
import android.os.Build;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rn.b;

/* JADX INFO: compiled from: AccessibilityTool.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lcom/bbva/showinfo/nativemodal/utils/AccessibilityTool;", "", "Landroid/content/Context;", "context", "", "announcement", "", "announceForAccessibility", "<init>", "()V", "showinfo_release"}, k = 1, mv = {1, 9, 0})
public final class AccessibilityTool {

    @NotNull
    public static final AccessibilityTool INSTANCE = new AccessibilityTool();

    public final void announceForAccessibility(@NotNull Context context, @NotNull String announcement) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(announcement, "announcement");
        AccessibilityManager accessibilityManager = AccessibilityToolKt.getAccessibilityManager(context);
        if (accessibilityManager == null || !AccessibilityToolKt.isGoogleTalkbackActive(accessibilityManager)) {
            return;
        }
        INSTANCE.getClass();
        AccessibilityEvent accessibilityEventB = Build.VERSION.SDK_INT >= 33 ? b.b() : AccessibilityEvent.obtain(16384);
        accessibilityEventB.setClassName(context.getClass().getName());
        accessibilityEventB.setPackageName(context.getPackageName());
        accessibilityEventB.getText().add(announcement);
        accessibilityManager.sendAccessibilityEvent(accessibilityEventB);
    }
}
