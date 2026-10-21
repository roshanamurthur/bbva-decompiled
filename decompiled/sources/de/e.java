package de;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.bottomsheet.BottomSheetDialog;

/* JADX INFO: compiled from: BottomSheetDialog.java */
/* JADX INFO: loaded from: classes10.dex */
public final class e extends AccessibilityDelegateCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BottomSheetDialog f68176a;

    public e(BottomSheetDialog bottomSheetDialog) {
        this.f68176a = bottomSheetDialog;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        if (!this.f68176a.E0) {
            accessibilityNodeInfoCompat.setDismissable(false);
        } else {
            accessibilityNodeInfoCompat.addAction(1048576);
            accessibilityNodeInfoCompat.setDismissable(true);
        }
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
        if (i10 == 1048576) {
            BottomSheetDialog bottomSheetDialog = this.f68176a;
            if (bottomSheetDialog.E0) {
                bottomSheetDialog.cancel();
                return true;
            }
        }
        return super.performAccessibilityAction(view, i10, bundle);
    }
}
