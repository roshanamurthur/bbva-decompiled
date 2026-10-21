package com.google.firebase.storage;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnCanceledListener;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class n implements OnCanceledListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CancellationTokenSource f49163a;

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public final void onCanceled() {
        this.f49163a.cancel();
    }
}
