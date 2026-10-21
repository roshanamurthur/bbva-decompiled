package com.google.android.material.tabs;

import android.view.View;

/* JADX INFO: compiled from: TabLayout.java */
/* JADX INFO: loaded from: classes10.dex */
public final class c implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f45559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TabLayout.TabView f45560b;

    public c(TabLayout.TabView tabView, View view) {
        this.f45560b = tabView;
        this.f45559a = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        View view2 = this.f45559a;
        if (view2.getVisibility() == 0) {
            int i18 = TabLayout.TabView.F0;
            this.f45560b.f(view2);
        }
    }
}
