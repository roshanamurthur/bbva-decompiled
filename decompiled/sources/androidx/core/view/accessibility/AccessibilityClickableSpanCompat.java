package androidx.core.view.accessibility;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes2.dex */
public final class AccessibilityClickableSpanCompat extends ClickableSpan {

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final String SPAN_ID = "ACCESSIBILITY_CLICKABLE_SPAN_ID";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final int f20360p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final AccessibilityNodeInfoCompat f20361q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f20362r0;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public AccessibilityClickableSpanCompat(int i10, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, int i11) {
        this.f20360p0 = i10;
        this.f20361q0 = accessibilityNodeInfoCompat;
        this.f20362r0 = i11;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(@NonNull View view) {
        Bundle bundle = new Bundle();
        bundle.putInt(SPAN_ID, this.f20360p0);
        this.f20361q0.performAction(this.f20362r0, bundle);
    }
}
