package com.google.android.material.internal;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* JADX INFO: compiled from: NavigationMenuPresenter.java */
/* JADX INFO: loaded from: classes10.dex */
public final class c extends AccessibilityDelegateCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f44909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ NavigationMenuPresenter.c f44910c;

    public c(NavigationMenuPresenter.c cVar, int i10, boolean z10) {
        this.f44910c = cVar;
        this.f44908a = i10;
        this.f44909b = z10;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(@NonNull View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        int i10 = this.f44908a;
        int i11 = 0;
        int i12 = i10;
        while (true) {
            NavigationMenuPresenter.c cVar = this.f44910c;
            if (i11 >= i10) {
                cVar.getClass();
                accessibilityNodeInfoCompat.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(i12, 1, 1, 1, this.f44909b, view.isSelected()));
                return;
            } else {
                NavigationMenuPresenter navigationMenuPresenter = NavigationMenuPresenter.this;
                if (navigationMenuPresenter.f44856u0.getItemViewType(i11) == 2 || navigationMenuPresenter.f44856u0.getItemViewType(i11) == 3) {
                    i12--;
                }
                i11++;
            }
        }
    }
}
