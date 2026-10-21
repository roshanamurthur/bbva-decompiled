package com.google.android.material.timepicker;

import android.content.Context;
import android.view.View;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* JADX INFO: compiled from: ClickActionDelegate.java */
/* JADX INFO: loaded from: classes10.dex */
public class a extends AccessibilityDelegateCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccessibilityNodeInfoCompat.AccessibilityActionCompat f45768a;

    public a(Context context, int i10) {
        this.f45768a = new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16, context.getString(i10));
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.addAction(this.f45768a);
    }
}
