package com.google.android.play.core.splitinstall;

import android.content.Context;
import com.google.android.play.core.splitinstall.internal.zzcb;
import xe.t;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzbd implements zzcb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzcb f46359a;

    public zzbd(zzcb zzcbVar) {
        this.f46359a = zzcbVar;
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzcb, com.google.android.play.core.splitinstall.internal.zzby
    public final /* bridge */ /* synthetic */ Object zza() {
        Context contextZzb = ((zzad) this.f46359a).zzb();
        return new t(contextZzb, contextZzb.getPackageName());
    }
}
