package ae;

import android.view.View;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.badge.BadgeDrawable;

/* JADX INFO: compiled from: BadgeUtils.java */
/* JADX INFO: loaded from: classes10.dex */
public final class f extends AccessibilityDelegateCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BadgeDrawable f226a;

    public f(BadgeDrawable badgeDrawable) {
        this.f226a = badgeDrawable;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.setContentDescription(this.f226a.getContentDescription());
    }
}
