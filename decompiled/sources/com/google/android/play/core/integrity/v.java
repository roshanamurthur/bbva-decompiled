package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.play.integrity.internal.aa;
import com.google.android.play.integrity.internal.ac;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class v implements aa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ac f46135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ac f46136b;

    public v(ac acVar, ac acVar2) {
        this.f46135a = acVar;
        this.f46136b = acVar2;
    }

    @Override // com.google.android.play.integrity.internal.ac
    public final /* bridge */ /* synthetic */ Object a() {
        return new te.i((Context) this.f46135a.a(), (com.google.android.play.integrity.internal.k) this.f46136b.a());
    }
}
