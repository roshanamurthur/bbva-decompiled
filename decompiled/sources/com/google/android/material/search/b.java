package com.google.android.material.search;

import android.view.View;
import androidx.core.view.accessibility.AccessibilityManagerCompat;

/* JADX INFO: compiled from: SearchBar.java */
/* JADX INFO: loaded from: classes10.dex */
public final class b implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ SearchBar f45145p0;

    public b(SearchBar searchBar) {
        this.f45145p0 = searchBar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        SearchBar searchBar = this.f45145p0;
        AccessibilityManagerCompat.addTouchExplorationStateChangeListener(searchBar.B1, searchBar.C1);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        SearchBar searchBar = this.f45145p0;
        AccessibilityManagerCompat.removeTouchExplorationStateChangeListener(searchBar.B1, searchBar.C1);
    }
}
