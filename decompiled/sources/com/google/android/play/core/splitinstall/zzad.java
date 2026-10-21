package com.google.android.play.core.splitinstall;

import android.content.Context;
import com.google.android.play.core.splitinstall.internal.zzca;
import com.google.android.play.core.splitinstall.internal.zzcb;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzad implements zzcb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzac f46354a;

    public zzad(zzac zzacVar) {
        this.f46354a = zzacVar;
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzcb, com.google.android.play.core.splitinstall.internal.zzby
    public final Object zza() {
        Context context = this.f46354a.f46353a;
        zzca.zza(context);
        return context;
    }

    public final Context zzb() {
        Context context = this.f46354a.f46353a;
        zzca.zza(context);
        return context;
    }
}
