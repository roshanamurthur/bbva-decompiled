package com.google.android.play.core.splitinstall;

import com.google.android.play.core.splitinstall.internal.zzbz;
import com.google.android.play.core.splitinstall.internal.zzcb;
import xe.w;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzm implements zzcb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzcb f46365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzcb f46366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzcb f46367c;

    public zzm(zzcb zzcbVar, zzcb zzcbVar2, zzcb zzcbVar3) {
        this.f46365a = zzcbVar;
        this.f46366b = zzcbVar2;
        this.f46367c = zzcbVar3;
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzcb, com.google.android.play.core.splitinstall.internal.zzby
    public final /* bridge */ /* synthetic */ Object zza() {
        return new w(zzbz.zzb(this.f46365a), zzbz.zzb(this.f46366b), zzbz.zzb(this.f46367c));
    }
}
