package com.bbva.component.ui.modal.list.utils;

import android.content.Context;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AccessibilityTool.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/bbva/component/ui/modal/list/utils/AccessibilityTool;", "", "()V", "announceForAccessibility", "", "context", "Landroid/content/Context;", "announcement", "", "component-ui-modal_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(16384);
        accessibilityEventObtain.setClassName(context.getClass().getName());
        accessibilityEventObtain.setPackageName(context.getPackageName());
        accessibilityEventObtain.getText().add(announcement);
        accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain);
    }
}
