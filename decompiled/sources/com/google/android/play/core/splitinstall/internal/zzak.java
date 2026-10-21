package com.google.android.play.core.splitinstall.internal;

import android.content.Context;
import com.google.android.play.core.splitcompat.SplitCompat;
import com.google.android.play.core.splitcompat.zze;
import com.google.android.play.core.splitinstall.zzh;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzak implements zzh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f46298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zze f46299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzam f46300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Executor f46301d;

    public zzak(Context context, Executor executor, zzam zzamVar, zze zzeVar, com.google.android.play.core.splitcompat.zzs zzsVar) {
        this.f46298a = context;
        this.f46299b = zzeVar;
        this.f46300c = zzamVar;
        this.f46301d = executor;
    }

    @Override // com.google.android.play.core.splitinstall.zzh
    public final void zzd(List list, com.google.android.play.core.splitinstall.zzf zzfVar) {
        if (!SplitCompat.zze()) {
            throw new IllegalStateException("Ingestion should only be called in SplitCompat mode.");
        }
        this.f46301d.execute(new e(this, list, zzfVar));
    }
}
