package com.bbva.ui.dialog;

import android.app.Dialog;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.bbva.nativesettings.common.Constants;
import com.bbva.ui.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DialogBuilder.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"showAndAnnounce", "", "Landroid/app/Dialog;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class DialogBuilderKt {
    public static final void showAndAnnounce(@NotNull Dialog dialog) {
        Intrinsics.checkNotNullParameter(dialog, "<this>");
        Object systemService = dialog.getContext().getSystemService(Constants.ACCESSIBILITY);
        AccessibilityManager accessibilityManager = systemService instanceof AccessibilityManager ? (AccessibilityManager) systemService : null;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
            accessibilityEventObtain.setEventType(16384);
            accessibilityEventObtain.getText().add(dialog.getContext().getString(R.string.ui_dialog_announcement));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain);
        }
        dialog.show();
    }
}
