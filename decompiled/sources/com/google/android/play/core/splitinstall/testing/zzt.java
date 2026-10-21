package com.google.android.play.core.splitinstall.testing;

import com.google.android.play.core.splitinstall.internal.zzbz;
import com.google.android.play.core.splitinstall.internal.zzcb;
import com.google.android.play.core.splitinstall.zzad;
import java.io.File;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzt implements zzcb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzcb f46345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzcb f46346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzcb f46347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zzcb f46348d;

    public zzt(zzcb zzcbVar, zzcb zzcbVar2, zzcb zzcbVar3, zzcb zzcbVar4) {
        this.f46345a = zzcbVar;
        this.f46346b = zzcbVar2;
        this.f46347c = zzcbVar3;
        this.f46348d = zzcbVar4;
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzcb, com.google.android.play.core.splitinstall.internal.zzby
    public final /* bridge */ /* synthetic */ Object zza() {
        return new FakeSplitInstallManager(((zzad) this.f46345a).zzb(), (File) this.f46346b.zza(), (com.google.android.play.core.splitinstall.zzs) this.f46347c.zza(), zzbz.zzb(this.f46348d));
    }
}
