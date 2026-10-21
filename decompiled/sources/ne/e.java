package ne;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* JADX INFO: compiled from: SheetDialog.java */
/* JADX INFO: loaded from: classes10.dex */
public final class e extends AccessibilityDelegateCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.sidesheet.a f84506a;

    public e(com.google.android.material.sidesheet.a aVar) {
        this.f84506a = aVar;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        if (!this.f84506a.f45362y0) {
            accessibilityNodeInfoCompat.setDismissable(false);
        } else {
            accessibilityNodeInfoCompat.addAction(1048576);
            accessibilityNodeInfoCompat.setDismissable(true);
        }
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
        if (i10 == 1048576) {
            com.google.android.material.sidesheet.a aVar = this.f84506a;
            if (aVar.f45362y0) {
                aVar.cancel();
                return true;
            }
        }
        return super.performAccessibilityAction(view, i10, bundle);
    }
}
