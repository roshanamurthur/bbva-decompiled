package com.google.android.play.core.splitinstall;

import xe.v;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public zzac f46362a;

    public final zzc zza(zzac zzacVar) {
        this.f46362a = zzacVar;
        return this;
    }

    public final zzp zzb() {
        zzac zzacVar = this.f46362a;
        if (zzacVar != null) {
            return new v(zzacVar);
        }
        throw new IllegalStateException(String.valueOf(zzac.class.getCanonicalName()).concat(" must be set"));
    }
}
