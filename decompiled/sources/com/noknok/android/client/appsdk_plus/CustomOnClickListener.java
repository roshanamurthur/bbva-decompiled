package com.noknok.android.client.appsdk_plus;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes11.dex */
class CustomOnClickListener implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f62925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final OnCustomClickListener f62926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ViewGroup f62927c;

    public CustomOnClickListener(OnCustomClickListener onCustomClickListener, int i10, ViewGroup viewGroup) {
        this.f62925a = i10;
        this.f62926b = onCustomClickListener;
        this.f62927c = viewGroup;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f62926b.OnCustomClick(view, this.f62925a, this.f62927c);
    }
}
