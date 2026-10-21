package com.google.android.material.search;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: compiled from: SearchView.java */
/* JADX INFO: loaded from: classes10.dex */
public final class p implements TextWatcher {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ SearchView f45176p0;

    public p(SearchView searchView) {
        this.f45176p0 = searchView;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        this.f45176p0.E0.setVisibility(charSequence.length() > 0 ? 0 : 8);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
